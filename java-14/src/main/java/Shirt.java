class Shirt {
    char size;
    double price;
    double getSpeacialPrice() {
        return (price * 0.95);
    }
    void showDetail() {
        System.out.println("Shirt size: "+ size + " " + price);
    }
} 