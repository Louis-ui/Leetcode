package 绝活;

public class 搞不懂 {

}

class Solution {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        nums[index] = nums[4];
        nums[index++] = nums[5];
        return index;


        // 先复制再家家
    }

    public static void main(String[] args) {
        Solution.removeElement(new int[]{1,2,3,4,5,6},6);
    }
}


