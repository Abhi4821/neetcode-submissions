class Solution {

    public int[] sortArray(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int[] arr = new int[max - min + 1];

        for (int num : nums) {
            arr[num - min]++;
        }

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {

            while (arr[i] > 0) {
                nums[idx] = i + min;
                idx++;
                arr[i]--;
            }
        }

        return nums;
    }
}