class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int b = Math.abs(nums[i]);
            if (nums[b - 1] < 0){
                list.add(b);
            }
            else
            nums[b - 1] = - nums[b - 1];
        }
        return list;
    }
}