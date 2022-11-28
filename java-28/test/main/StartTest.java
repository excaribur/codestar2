package main;

public class StartTest {
    public void test001() {
        Cashier c = new Cashier();
        double result = c.getTotal(75.0);
        assert 75.0 == result;
    }
    public void test002() {
        Cashier c = new Cashier();
        double result = c.getTotal(120.0);
        assert 114.0 == result;
    }
    public void test003() {
        Cashier c = new Cashier();
        double result = c.getTotal(-80.0);
        assert 0.0 == result;
    }
    public void test004() {
        Cashier c = new Cashier();
        double result = c.getTotal(99.0);
        assert 99.0 == result;
    }
    public void test005() {
        Cashier c = new Cashier();
        double result = c.getTotal(100.0);
        assert 95.0 == result;
    }
    public void test006() {
        Cashier c = new Cashier();
        double result = c.getTotal(101.0);
        assert 95.95 == result;
    }
}