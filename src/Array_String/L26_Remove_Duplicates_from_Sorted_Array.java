package Array_String;

public class L26_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        for(int fast = 1; fast < nums.length; fast++){
            if(nums[fast] != nums[slow - 1]){
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
