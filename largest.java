import java.util.*;
public class largest {
    public static int findlargest(int []arr, int n) {
        int max = arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String []args) {
        int []arr1 = {6,4,3,7,9};
        int n = arr1.length;
        int large = findlargest(arr1, n);
        System.out.print("The largest element of the array is: "+large);
    }
}
