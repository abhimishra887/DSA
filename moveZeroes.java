public class moveZeroes {
    public static void moveZero(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[count++] = nums[i];
            while (count < nums.length)
                nums[count++] = 0;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZero(nums);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<nums.length; i++)
            System.out.print(nums[i]+" ");
    }
    
}
