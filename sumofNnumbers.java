import java.util.*;
class solution {
    public static int sumlogic(int n) {
        if(n == 1) return 1;
    return n + sumlogic(n-1);
    }
}
public class sumofNnumbers {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(solution.sumlogic(n));
    }
}
