import java.util.*;
class solution {
    public static boolean ispalindrome(int n) {
        int reverse = 0;
        int temp = Math.abs(n);
        while(temp!=0) {
            reverse = reverse*10 + temp%10;
            temp = temp/10;
        }
        return(reverse == Math.abs(n));
    }
}
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution obj = new solution();
        System.out.print(obj.ispalindrome(n) ? "it is a palindrome":"it is not a palindrome");
    }
    
}
