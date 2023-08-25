public class factorial {
    static public  void main(String[] args) {
        
int num1=10;
for(int j=1;j<=num1;j++){
    int facto=1;

    for(int i=1;i<=j;i++){
    facto=facto*i;
    }
System.out.println("Factorial of "+j+" is:"+facto);

}
    }

    
}
