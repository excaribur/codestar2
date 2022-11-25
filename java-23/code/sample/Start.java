package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] data) {
        
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        System.out.println("Welcome to SpringBoot");
        B b = context.getBean(B.class);
        b.show();
        
 
//        C c = context.getBean(C.class);
//        c.show();
//        D d = context.getBean(D.class);
//        d.show();
//        SpringApplication.exit(context);
    }
}


@SpringBootApplication
class Setup {
    @Bean("latte")
    Product createLatte(){
        Product p = new Product();
        p.name = "Latte";
        p.price = 80;
        return p;
    }
    @Bean 
    @Primary
    Product createMocha(){
        Product p = new Product();
        p.name = "Mocha";
        p.price = 90;
        return p;
    }

}

@RestController
class Sample {
    Sample(@Qualifier("latte") Product p) {
        data = p;
    }
    
   
    @RequestMapping("/check")
    @Autowired
    String showCheck(Product data) {
        return ("The product is " + data.name);
    }
}

class Product {
    String name;
    double price;
}
