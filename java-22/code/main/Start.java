
package main;

import org.springframework.boot.SpringApplication;

import org.springframework.context.ApplicationContext;


class Start {
    public static void main(String[] data) {
        System.out.println("Welcome to Java");
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
//        String b = context.getBean("brand", String.class);
//        System.out.println(b);
//        SpringApplication.exit(context);
//        
//        
//        System.out.println("Finish");
    }
}



//-----------------------------------------------
//package main;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//class Start {
//    public static void main(String[] data) {
//        System.out.println("Hello World");
//        
//        ApplicationContext context;
//        context = new AnnotationConfigApplicationContext(Setup.class);
//        Player p = context.getBean("first", Player.class);
//        System.out.println(p.name);        
//        
//        System.out.println("Finish");        
//        
//    }
//}
//
//@Configuration
//class Setup {
//   @Bean("first")
//   Player sample() {
//       Player x = new Player();
//       x.number = 7;
//       x.name = "David B";
//       return x;
//   }
//   @Bean("second")
//   Player another() {
//       Player x = new Player();
//       x.number = 10;
//       x.name = "Michael O";
//       return x;
//   }
//}
//
//class Player {
//    int number;
//    String name;
//}