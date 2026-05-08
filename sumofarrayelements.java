import java.util.*;
public class sumofarrayelements {
    static int sum(int[] arr, int n) {
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[]args) {
        int[] arr = {2,5,6,7,9};
        int n = arr.length;
        int answer = sum(arr, n);
        System.out.println("The sum of the given array is: "+answer);
    }
}
