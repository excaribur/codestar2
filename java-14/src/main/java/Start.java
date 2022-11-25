
class Start {
    public static void main(String[] data) {
    
        double[][] d = {    {7.2, 8.1, 8.2},
                            {7.5, 8.0, 7.8},
                            {7.7, 8.0, 8.1}
                                            };
        
        for (int j = 0; j < d.length; j++) {
            double sum = 0.0;
            for (int i = 0; i < d.length; i ++) {
                sum += d[i][j]; 
            }
            System.out.print(sum + " ");
        }
    }
}







    /*
//////////////////////
class Start {
    public static void main(String data[]) {
        ToolABC t = new ToolABC();
        int[] values = { 8, 5, 4, 1, 2, 7, 9, 3, 6 };
        Element a = t.create(values);
        Element m = t.sort(a);
        t.print(m);
    }
}

class Start {
    public static void main(String data[]) {
        ToolABC t = new ToolABC();
        int[] values = { 2, 4, 5, 5, 8, 9, 9, 9 };
        Element a= t.create(values);

        int[] numbers = { 1, 2, 3, 5, 7, 9 };
        //Element b = t.create(numbers);
        Element b = null;
       
        Element c = t.merge(a, b);
        t.print(c);
    }
}


class Start {
    public static void main(String[] data) {
        int[] a = { 7, 3, 2, 5, 8, 1, 4, 5, 4, 1, 3, 6, 5, 4 };
        Tool t = new Tool();
        Element root = t.create(a);
        t.print(root);
        System.out.println("count: " + t.count(root));
        System.out.println("leaves : " + t.leave(root));
    }
}

 


class Start {
    public static void main(String[] data) {
           String[] a = { "2", "+", "5", "*", "3", "+", "4" };
           Engine e = new Engine();
           Element root = e.create(a);
           e.print(root);
    }
}


class Start {
    public static void main(String[] data) {
        Player root = new Player();
        root.name = "David"; 
        root.number = 7;
        root.left = new Player();
        root.left.name = "Michael";
        root.left.number = 10;
        root.right = new Player();
        root.right.name = "Frank";
        root.right.number = 8;
        root.right.right = new Player();
        root.right.right.name = "Stephen";
        root.right.right.number = 4;
        
        int total = root.number;
        for (Player c = root; c.right != null; c = c.right)
            total += c.number;
        for (Player c = root; c.left != null; c = c.left)
            total += c.number;
        Helper h = new Helper();
        System.out.println(h.find(root));
    }
}
   
    

    public static void main(String[] data) {
        int[] a = { 8, 5, 4, 88, 7, 5, 3, 6 };
        Element last = null;
        for (int i = 0; i < a.length; i++) {
            Element current = new Element();
            current.number = a[i];
            current.back = last;
            last = current;
        }

        Element m = null;
        for (Element c = last; c != null; c = c.back) {
            if (m == null || m.number < c.number)
               m = c;
        }
        if (m == null)
            System.out.println("No Maximum");
        if (m != null)
            System.out.println("Maximum: " + m.number);
        
        //////////////////////////////////
        Element first = null;
        Element lastt = null;
        for (int i = 0; i < a.length - 1; i++) {
            if (lastt == null) {
                lastt = new Element();
                lastt.number = a[i];
                first = lastt;
            } else {
                lastt.back = new Element();
                lastt.back.number = a[i];
                lastt = lastt.back;
            }
        }
            
        Element c = first;
        while (c != null)
        {
            System.out.println(c.number);
            c = c.back;
        }
    }
}
    
        
    
    
    /*
//////////////////////
    Element first = null;
    Element last = null;
    for (int i = 0; i < a.length; i++) {
        if (last == null) {
            Element last = new Element();
            last.number = a[i];
            first = last;
        } else {
            Element middle = new Element();
            middle.number = a[i];
            last.next = middle;
    }
    
    Element c = first;
    while (c != null)
    {
        System.out.println(c.number + " " + c.name);
        c = c.next;
    }




//////////////////////
    public static void main(String[] data) {
        Element e = new Element();
        e.number = 1;
        e.name = "Hydrogen";
        
        Element f = new Element();
        f.number = 2;
        f.name = "Helium";
        
        Element g = new Element();
        g.number = 3;
        g.name = "Lithium";

        f.next = g;
        e.next = f;
        
        System.out.println(e.next.next.number + " " + e.next.next.name);
        
        int total = 0;
        for (Element current = e; current != null; current = current.next) {
            System.out.println(current.number + " " + current.name);
            total += current.number;
        }
        
        System.out.println("total " + total);
        
        
        Element c = e;
        while (c != null)
        {
            System.out.println(c.number + " " + c.name);
            c = c.next;
        }
         
    }
}
    
    
/*
//////////////////////
//////////////////////
    public static void main(String[] data) {
       
        int v = 7;
        Integer w =  Integer.valueOf(v);
        Number x = 6.9342894;
        System.out.println(v);
        System.out.println(w);
         System.out.println(x);
        System.out.println(x instanceof Integer);
        
    }
}
    



class Start {
    public static void main(String[] data) {
        User u = new User("bill@gmail.com", 300.0);
         System.out.println(u);
        System.out.println(u.email());
         
    }
}

record User(String email, double minutes) {}

//////////////////////
        Gender[] all = {    Gender.MALE, Gender.FEMALE,
      
                            Gender.FEMALE, Gender.MALE,
                            Gender.MALE, Gender.FEMALE,
                            Gender.MALE, Gender.MALE };
        int m = 0;
        int f = 0;
        for (int i = 0; i < all.length; i++)
        {
            if (all[i] == Gender.MALE)  m++;
            if (all[i] == Gender.FEMALE)  f++;
        }
        System.out.println(Gender);
        System.out.println(all[1]);
        System.out.println(m +" "+ f);
//////////////////////
        
        Worker w = new Worker();
        w.start();
        
        Printer p = new Printer();
        Thread t = new Thread(p);
        t.start();
        
        for (int i = 0; i < 5;i++) {
            System.out.println("A");
        }
    }
}
   

    public static void main(String[] data) {
        Coffee c = new Coffee("Latte", 80.0);
        Coffee[] all = {    new Coffee("Latte", 50.0),
                            new Coffee("Mocha", 90.0),
                            new Coffee("Espresso", 50.0),
                            new Coffee("Cappuccino", 80.0),
                            new Coffee("Superblend", 100.0) };

        Coffee m = all[0];     
        //Arrays.sort(all);
        for (int i = 1; i < all.length; i++) {
            int cmp = m.compareTo(all[i]);
            System.out.println(cmp);
            if (cmp > 0)
                m = all[i];
        }
        System.out.println(m.name +": " + m.price);                  
    }  


    /*
        String[] list = {"Latte", "Mocha", "Cappuccino", "Mocha"};
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void main(String[] data) {
        User[] all = {  new Monthly(), new Monthly(),
                        new Yearly(), new Monthly(),
                        new Monthly(), new Yearly() };
        
        int count = 0;
        for (int i = 0; i < all.length; i++) {
            if(all[i] instanceof Monthly) 
                count++;
        }
        System.out.println("Monthly :" + count);
    }
    
    
        Vehicle v = new Vehicle();
        Car c = new Car();
        c.wheels = 4;
        c.plate = "CR-7315-44168-FWKD";
        c.showDetail();
        Account a = new Account();
        a.balance = 5000.0;
        a.history = new Transaction[20];
        System.out.println(a.balance);
        System.out.println(a.history);    
    
        Shirt s;
        s = new Shirt();
        System.out.println(s);
        Shirt t = new Shirt();
        System.out.println(t);
        s.showDetail();
    
        Staff u = new Staff();
        Staff w = new Staff("Mark Sucker", 8000.0);
        Staff t = new Staff("Bill Gates", 'M', 38000.0);
        u.showDetail();
        w.showDetail();
        t.showDetail();
*/
    
