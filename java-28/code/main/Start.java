package main;


class Start {
    public static void main (String[] data) {
        
    }
}

class Cashier {
    double getTotal(double price) {
        if (price < 0) return 0.0;
        if (price >= 100) return price * 0.95;
        return price;
    }
}








//import java.util.Iterator;
//
//class Start {
//    public static void main(String[] data) {
//        System.out.println("Welcome");
//        
//        double[] values = { 8.5, 8.7, 9.1, 8.8 };
//        for (double v : values) {
//            System.out.println(v);
//        }
//                
//        
//        PlayerList all = new PlayerList();
//        all.data[0] = "A";
//        all.data[1] = "B";
//        all.data[2] = "C";
//        all.data[3] = "D";
//        all.data[4] = "E";
//        all.data[5] = "F";
//        all.data[6] = "G";
//        all.data[7] = "H";
//        all.data[8] = "I";
//        all.data[9] = "J";
//        all.data[10] = "K";
//
// //iterator     
//        for (Object s:all) {
//            System.out.println(s);
//        }
//
//////iterable
////        while (all.hasNext()) {            
////            String s = all.next();
////            System.out.println(s);
////        }       
//        
//    
////        for( ;all.hasNext(); ) {
////             String s = all.next();
////           System.out.println(s);
////        }
//        
//    }
//}
//
//class PlayerList implements Iterator, Iterable {
//    public Iterator iterator() {
//        return this;
//    }
//    
//    String[] data = new String[11];
//    int current = 0;
//    public boolean hasNext() {
//        return (current < data.length);
//    }
//    public String next() {
//        String result = data[current];
//        current++;
//        return result;
//    }
//}

