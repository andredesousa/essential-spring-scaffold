package app;

import org.springframework.stereotype.Service;

@Service
public class AppService {

    public String getHello() {
        return "Hello World!";
    }
}
