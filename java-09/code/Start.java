import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.SpringVersion;

class Start {
    public static void main(String[] data) {
        System.out.println("Welcome to Spring Framework");
        
        System.out.println( SpringVersion.getVersion() );
        
        //Student s = new Student(); // creat instance but will dissapear in later
        
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean("a",Student.class);
        context.registerBean("b",Student.class);
        context.registerBean("c",Student.class);
        context.refresh();
        
        Student b = context.getBean("b", Student.class);
        b.name = "Harry Potter"; 
        b.score = 87.5;
        
        String[] beans = context.getBeanDefinitionNames();
        for (int i = 0; i < beans.length; i++) {
            System.out.println(beans[i]);
            Student s = context.getBean(beans[i], Student.class);
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    double score;
}