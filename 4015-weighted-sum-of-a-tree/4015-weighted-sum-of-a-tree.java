class Solution {
    private List<List<Integer>> graph;
    private int height = 0;
    private long result = 0;

    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            graph.get(parent[i]).add(i);
        }
        getHeight(0, 1);
        cal(0, 1, nums);
        return result;
    }

    private void getHeight(int node, int depth) {
        height = Math.max(height, depth);
        for (int child : graph.get(node)) {
            getHeight(child, depth + 1);
        }
    }

    private void cal(int node, int depth, int[] nums) {
        result += (long) nums[node] * (height - depth + 1);
        for (int child : graph.get(node)) {
            cal(child, depth + 1, nums);
        }
    }
}