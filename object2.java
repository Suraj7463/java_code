class Mall {
    int cashCounter = 0; // Non-static
    static int parking = 1; // static

    static void cleaning() {
        System.out.println("Mall cleaning");

    }

    void prodDisplay() {
        System.out.println("Attractive Display");
    }

    public static void main(String[] args) {
        System.out.println(parking);
        cleaning();

        Mall zara = new Mall();
        System.out.println(zara.cashCounter);
        zara.prodDisplay();

        Mall.cleaning();

        Mall maxx = new Mall();
        System.out.println(maxx.cashCounter);
        maxx.prodDisplay();
    }

}
