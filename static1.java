class Demo {
    int x = 10;

    static int y = 1000;

    public void fun() {
        System.out.println("it is fun");

    }

    static public void run() {
        System.out.println("it is gun");

    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.x);
        System.out.println(y);
        obj.fun();
        run();

    }
}
