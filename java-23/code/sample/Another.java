package sample;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

class A {
    
}

@Component
class B {
    void show(){ System.out.println("B"); }
   
}

@Repository
class C{
   void show(){ System.out.println("C"); }    
}


@Service
class D {
    void show(){ System.out.println("D"); }
}