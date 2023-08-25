class TestString {
    String str1 = "suraj";
    String str2 = new String("ganesh");

    String str3 = "suraj";
    String str4 = new String();

    public static void main(String[] args) {
        String str5 = "mahesh";
        String str6 = "mahesh";

        TestString ts = new TestString();
        System.out.println(ts.str1 == ts.str2);
        System.out.println(ts.str2);
        System.out.println(ts.str3);
        System.out.println(ts.str4);
        System.out.println(str5 == str6);

    }

}
