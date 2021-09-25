package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@DisplayName("AppController")
@ExtendWith(MockitoExtension.class)
public class AppControllerTests {

    @Mock
    transient AppService appService;

    @InjectMocks
    transient AppController appController;

    @Test
    @DisplayName("#getHello returns 'Hello!' message")
    void findAll() {
        Mockito.when(appService.getHello()).thenReturn("Hello!");

        assertEquals("Hello!", appController.getHello());
    }
}
