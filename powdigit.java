class sweet {
    public static void main(String[] args) {
        int num1 = 153;
        int x = 0, rem = 100, sum = 1;

        while (num1 >= 0) {
            x = num1 / rem;
            rem = rem / 10;
            sum = sum * x;
            num1 = num1 % rem;
            rem = rem / 10;

        }
        System.out.println(sum);
    }

}
