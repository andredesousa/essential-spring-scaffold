package app;

import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("AppApplication")
class AppApplicationTests {

    @Test
    void contextLoads() {
        try (MockedStatic<SpringApplication> springApplicationMock = mockStatic(SpringApplication.class)) {
            springApplicationMock
                .when(() -> SpringApplication.run(AppApplication.class, new String[] {}))
                .thenCallRealMethod();

            AppApplication.main(new String[] {});

            springApplicationMock.verify(() -> SpringApplication.run(AppApplication.class, new String[] {}), times(1));
        }
    }
}
