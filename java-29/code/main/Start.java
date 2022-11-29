package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
    }
}

@SpringBootApplication
class Setup { }

@Controller
class Sample {
    @RequestMapping("/check")
    String show() {
        return "start"; // mean "start" + ".html"
    }

}