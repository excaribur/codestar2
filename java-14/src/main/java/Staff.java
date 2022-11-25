class Staff {
    String name;
    char size;
    double salary;
    
    Staff(){ }
    
    Staff(String n, double d) {
        name = n;
        salary = d;
    }
    
    Staff(String n, char s, double d) {
        name = n;
        size = s;
        salary = d;
    }

    void showDetail() {
        System.out.printf("Name: "+ name + "\nSize: " + size + "\nSalary: " + salary + "\n");
    }
} 