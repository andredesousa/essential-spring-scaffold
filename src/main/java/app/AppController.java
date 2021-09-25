package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private transient AppService appService;

    @GetMapping
    public String getHello() {
        return appService.getHello();
    }
}
