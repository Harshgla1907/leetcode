class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(a, t, 0, new ArrayList<>(), ans);
        return ans;
    }

    void dfs(int[] a, int t, int i, List<Integer> l, List<List<Integer>> ans) {
        if(t == 0) {
            ans.add(new ArrayList<>(l));
            return;
        }
        if(i == a.length || t < 0) return;

        l.add(a[i]);
        dfs(a, t-a[i], i, l, ans);
        l.remove(l.size()-1);
        dfs(a, t, i+1, l, ans);
    }
}