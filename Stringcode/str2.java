public class str2 {
    public void fun() {
        String str2 = "Core2web";
        String str3 = "Core2web";
        System.out.println(str2);
        String str5 = new String("Core2web");
        System.out.println(str5);
        System.out.println(str2 == str5);
        System.out.println(str2 == str3);
    }

    public static void main(String[] args) {
        String str1 = "Core2web";
        str2 obj = new str2();
        obj.fun();
        String str4 = "Core2web";

    }

}
