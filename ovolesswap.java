public class ovolesswap {
    
        public static void main(String[] args) {
            String name="Suraj";
            int n=name.length();
            int[] intArray = new int[n];
            char alph;
            int i;
            for(i=0;i<n;i++)
            {
                alph=(name.charAt(i));
                if(alph=='a' || alph=='e' || alph=='i' || alph=='o' || alph=='u')
                {
                    System.out.print(alph);
                }
                
            }
            i=0;
            for(i=0;i<n;i++)
            {
                alph=(name.charAt(i));
                if(alph != 'a' && alph != 'e' && alph != 'i' && alph != 'o' && alph != 'u')
                {
                    System.out.print(alph);
                }
                
            }
        }
    }

