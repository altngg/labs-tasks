
public class Primes {
    public static void main(String[] args) {
        for (int i=2; i<100; i++){
            if (isPrime(i)==true){
                System.out.println(i);
            }
        }
        
        
    }
    public static boolean isPrime(int n) {
        for (int k = 2; k<n; k++) {
            if (n % k ==0){
                return false;
            }
        }  
        return true;   
        
    }
}
