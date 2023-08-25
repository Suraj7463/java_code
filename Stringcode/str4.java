public class str4 {
    public static void main(String[] args) {
        String str1 = "c2w";
        String str2 = "c2w";
        String str3 = "c2wTech";

        String str4 = str2 + "Tech";

        System.out.println(str1 == str2);
        System.out.println(str3 == str4); // compare address
        System.out.println(str3.equals(str4)); // compare contante
    }

}
