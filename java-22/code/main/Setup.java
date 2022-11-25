package main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
class Setup {
    @Bean("brand")
    String getBrandname() {
        return "iCoffee";
    }
}