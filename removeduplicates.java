import java.util.*;
class solution {
    public int duplicateremovelogic(int[] nums) {
        if(nums.length == 0) return 0;
        int i = 0;
        for(int j=1;j<nums.length;j++) {
            if(nums[j]!=nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
public class removeduplicates {
    public static void main(String[]args) {
        int[] nums = {0,0,1,1,1,2,2,3,3};
        solution obj = new solution();
        int k = obj.duplicateremovelogic(nums);
        //print
        System.out.print("the unique numbers in the array are: "+k);
        System.out.print("the unique elements are: ");
        for(int x=0;x<k;x++) {
            System.out.print(nums[x]+" ");
        }

    }
}
