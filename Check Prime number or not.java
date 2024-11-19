// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    static boolean CheckPrime(int n){
        int cnt=0;
        if(n<2){
            return false;
        }
        
         for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    cnt++;
                }
            }
            if(cnt==0){
                return true;
            }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isPrime=CheckPrime(num);
        if(isPrime){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
