class Pattern {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        char var = 65;
        char svar = 97;
        for (i = 1; i <= 4; i++) {
            var = 65;
            svar = 97;
            for (j = 1; j <= 3; j++) {
                if (i % 2 == 0) {
                    System.out.print(" " + var);
                    var++;
                } else {
                    System.out.print(" " + svar);
                    svar++;
                }
            }
            System.out.println();
        }
    }

}
