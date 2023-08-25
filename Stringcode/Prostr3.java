public class Prostr3 {
    public static void main(String[] args) {
        String str1 = "core2web";
        String str2 = "biencaps";
        String str3 = "Aakash";
        String str4 = "Core2web";

        System.out.println(str1.concat(str2));

        System.out.println(str1.length());

        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str2));

        System.out.println(str1.compareTo(str4));

        System.out.println(str1.compareToIgnoreCase(str4));

        System.out.println(str1.startsWith("core"));
        System.out.println(str1.startsWith("web"));

        System.out.println(str1.endsWith("web"));
        System.out.println(str1.endsWith("core"));

        char[] carr = str1.toCharArray();

        for (int i = 0; i < carr.length; i++) {
            System.out.print(carr[i] + " ");
        }

        System.out.println(str1.toUpperCase());

        System.out.println(str1.toLowerCase());

        System.out.println(str1.replace('e', 'x'));

        System.out.println(str1.substring(4));

        System.out.println(str1.substring(1, 5));

        System.out.println(str1);
        System.out.println(str1.trim());

        char[] arr = new char[5];
        str1 = "core2WebTech";
        str1.getChars(3, 8, arr, 0);

        System.out.println(arr);

    }

}
