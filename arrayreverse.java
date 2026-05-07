import java.util.*;
public class arrayreverse{
    static void Arrayreverse(int[]arr) {
        int n = arr.length;
        int[] temp = new int[n];
        //fill the temp array
        for(int i=0;i<n;i++) {
            temp[i] = arr[n-i-1];
        }
          //set the temp array value into main array
          for(int i=0;i<n;i++) {
            arr[i] = temp[i];
          } 
        }
        
          public static void main(String[] args) {
            int[]arr = {1,2,3,4,5,6};
            Arrayreverse(arr);
            for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
          }
        }
    
}