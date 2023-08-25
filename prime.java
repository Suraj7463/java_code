class PrimeNum {
    static public  void main(String[] args) {
        
        int num=47;
        
        int count=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count==2){
    System.out.println("Number is prime");

    }
    else{
    System.out.println("Number is Not prime");

    }
    }

    
}
