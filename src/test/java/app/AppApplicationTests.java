package app;

import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.MockedStatic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("AppApplication")
class AppApplicationTests {

    transient MockedStatic<SpringApplication> springApplicationMock;

    @BeforeAll
    public void beforeAll() {
        springApplicationMock = mockStatic(SpringApplication.class);
    }

    @Test
    void contextLoads() {
        springApplicationMock
            .when(() -> SpringApplication.run(AppApplication.class, new String[] {}))
            .thenCallRealMethod();

        AppApplication.main(new String[] {});

        springApplicationMock.verify(() -> SpringApplication.run(AppApplication.class, new String[] {}), times(1));
    }
}
