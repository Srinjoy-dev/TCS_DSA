import java.util.*;
class solution {
    static boolean isprime(int n) {
        if(n<=1) return false;
        for(int i=2;i<n;i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}
public class primenumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        solution obj = new solution();
        System.out.print(obj.isprime(x) ? "Is a prime number":"Not a prime number");
    }
}
