import java.util.*;
 class secondLargeandsecondSmall {
    public static int secondLargest(int[] arr, int n) {
        //for arrays with less than 2 values
        if(n<2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i]>largest) {
                second_large = largest;
                largest = arr[i];
            } else if (arr[i]>second_large && arr[i]!=largest) {
                second_large = arr[i];
            }
        }
        return second_large;
    }
    public static int secondSmallest(int[] arr, int n) {
        //for arrays with less than 2 values
        if(n<2) {
            return -1;
        }
        int smallest = Integer.MAX_VALUE, second_small = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(arr[i]<smallest) {
                second_small = smallest;
                smallest = arr[i];
            } else if (arr[i]<second_small && arr[i]!=smallest) {
                second_small = arr[i];
            }
        }
        return second_small;
    }
}
public class Main {
    public static void main(String[]args) {
        int[] arr = {1,2,4,7,7,5};
        int n = arr.length;
        //calling the functions and storing them in a variable
        int sL = secondLargeandsecondSmall.secondLargest(arr, n);
        int sS = secondLargeandsecondSmall.secondSmallest(arr, n);
        //print
        System.out.println("The second largest element is: "+sL);
        System.out.println("The second smallest element is: "+sS);
    }
}
