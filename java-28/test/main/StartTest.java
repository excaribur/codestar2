//package main;
//
//public class StartTest {
//    public void testLowerThanHundred() {
//        Cashier c = new Cashier();
//        double result = c.getTotal(75.0);
//        double delta = 0.0001;
//        assert 75.0 - delta <= result && result <= 75.0 + delta;
//    }
//    public void test002() {
//        Cashier c = new Cashier();
//        double result = c.getTotal(120.0);
//        double delta = 0.0001;
//        assert 114.0 - delta <= result && result <= 114.0 + delta;
//    }
//    public void test003() {
//        Cashier c = new Cashier();
//        double result = c.getTotal(-80.0);
//        double delta = 0.0001;
//        assert 0.0 - delta <= result && result <= 0 + delta;
//    }
//    public void test004() {
//        Cashier c = new Cashier();
//        double result = c.getTotal(99.0);
//        double delta = 0.0001;
//        assert 99.0 - delta <= result && result <= 99.0 + delta;
//    }
//    public void test005() {
//        Cashier c = new Cashier();
//        double result = c.getTotal(100.0);
//        double delta = 0.0001;
//        assert 95.0 - delta <= result && result <= 95.0 + delta;
//    }
//    public void test006() {
//        Cashier c = new Cashier();
//        double result = c.getTotal(101.0);
//        double delta = 0.0001;
//        assert 95.95 - delta <= result && result <= 95.95 + delta;   
//        //  95.9499 <= resutl >= 95.9501 
//    }
//}