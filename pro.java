public class pro {
    int x=10;
    static int y=30;

    public void addition()
    {
        System.out.println("addition is "+(x+y));

    }
    public static void sub()
    {
        pro obj=new pro();
        System.out.println("substration is:"+(y-obj.x));
    }
    public static void main(String[] args) {
        pro obj=new pro();
        System.out.println(obj.x);
        System.out.println(y);

        obj.addition();
        sub();

   
}
}

