class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        int l=0;
        int r=n-1;
        if (n < 4) return result;
        Arrays.sort(nums);
        
        long sum = 0;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                l = j + 1;
                r = n - 1;
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                while (l < r) {
                    sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }
                    } else if (sum < target) {
                        l++;
                       
                    } else {
                        r--;
                    
                    }
                }

            }
        }
        return result;
    }
}