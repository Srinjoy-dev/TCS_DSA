import java.util.*;
class solution {
    public static int reversedigitslogic(int n) {
        int revnum = 0;
        while(n>0) {
            revnum = revnum*10 + n%10;
            n = n/10;
        }
        return revnum;
    }
}
public class reversedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution.reversedigitslogic(n));
    }
}
