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
//can also be done by sepaerating the classes of logic and implementation
/*public class largest {
    public static int findlargest(int []arr, int n) {
        int max = arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    } 
}      
    public class solution{
     public static void main(String []args) {
        int []arr1 = {6,4,3,7,9};
        int n = arr1.length;
        int max = solution.findlargest(arr1, n);  -----[here max can be defined again 
        because of different class]
        System.out.print("The largest element of the array is: "+max);
    }
}       
    */