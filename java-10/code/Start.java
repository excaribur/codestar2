// There are two ways to handle an Exception in Java
class Start {
    public static void main(String[] data) {
        int[] a= { 8, 5, 4, 7};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i]+": ");
            for(int j = 0; j < a[i];j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}


/*
import java.io.File;
import java.util.Scanner;
class Start {
    public static void main(String[] data) {
        try {
            File f = new File("raws.txt");
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                String s = in.nextLine();
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("Failed: " + e);
        }
        System.out.println("Exit Successfully");
    }
}
*/



/*
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

class Start {
    public static void main(String[] data) {
          System.out.println("Welcome to Spring Framework " 
                                + SpringVersion.getVersion());
          ApplicationContext context, context_bank;
          context = new ClassPathXmlApplicationContext
                        ("configure.xml");
          context_bank = new ClassPathXmlApplicationContext
                        ("configure_bank.xml");
          
         Student s = context.getBean("sample", Student.class);
         System.out.println(s.getName());
         System.out.println(s.getScore());
         
         Student s1 = context_bank.getBean("sample2", Student.class);
         System.out.println(s1.getName());
         System.out.println(s1.getScore());
    }
}

class Student {
    String name;
    double score; 
    public void setName(String s) {
        name = s;
    }
    public String getName() {
        return name;
    }
    public void setScore(double s) {
        score = s;
    }
    public double getScore() {
        return score;
    }
}
*/