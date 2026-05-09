import java.util.*;
class leapyearlogic {
    public static boolean func(int n) {
        if(n%4 == 0) {
            //check for centuries
            if(n%100 == 0) {
                return n%400 == 0;
            }
            return true;
        }
        return false;
    }
}
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        leapyearlogic obj = new leapyearlogic();
        System.out.println(obj.func(n) ? "is a leapyear":"is not a leapyear");
    }
}
