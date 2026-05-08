import java.util.*;
class solution {
    public boolean sortinglogic(int[] arr, int n) {
        for(int i=1;i<n;i++) {
            if(arr[i]<arr[i-1]) 
                return false;
        }
        return true;
    }
}
public class issortedornot {
    public static void main (String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        solution obj = new solution();
        System.out.println(obj.sortinglogic(arr, n) ? "True":"False");
    }
}
