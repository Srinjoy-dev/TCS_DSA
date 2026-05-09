import java.util.*;
class solution {
    public static int calculatedsum(int n) {
        int sum = 0;
        while(n!=0) {
            int last = n%10;
            sum += last;
            n /= 10;
        }
        return sum;
    }
}
public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("the sum of the elements of the given number is: "+solution.calculatedsum(n));
    }
}
