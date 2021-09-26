package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("AppService")
public class AppServiceTests {

    transient AppService appService;

    @BeforeEach
    void beforeEach() {
        appService = new AppService();
    }

    @Test
    @DisplayName("#getHello returns 'Hello World!' message")
    void getHello() {
        assertEquals("Hello World!", appService.getHello());
    }
}
