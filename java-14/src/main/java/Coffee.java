//import java.util.Arrays;

class Coffee implements Comparable {
    public int compareTo(Object o) {
        Coffee y = (Coffee)o;
        if (this.price < y.price) return (-1);
        if (this.price > y.price) return (+1);
        return (0);
    }
    

    Coffee(String x, double p) {
        name = x;
        price = p;
    }
    String name;
    double price;
}