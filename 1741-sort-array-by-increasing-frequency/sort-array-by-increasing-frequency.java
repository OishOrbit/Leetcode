class Solution {
    public int[] frequencySort(int[] nums) {
        int[] freq = new int[201];
        for (int num : nums) {
            freq[num + 100]++;
        }
        Integer[] numsArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsArr, (a, b) -> {
            if (freq[a + 100] == freq[b + 100]) {
                return b - a;
            }
            return freq[a + 100] - freq[b + 100];
        });
        return Arrays.stream(numsArr).mapToInt(Integer::intValue).toArray();
    }
}