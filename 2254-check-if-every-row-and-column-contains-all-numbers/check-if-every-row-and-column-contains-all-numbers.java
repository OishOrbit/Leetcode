class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            boolean found[] = new boolean[n + 1];
            for (int j = 0; j < n; j++) {
                int k = matrix[i][j];
                if (found[k]) 
                return false;
                found[k] = true;
            }
        }
        for (int i = 0; i < n; i++)
         {
            boolean found[] = new boolean[n + 1];
            for (int j = 0; j < n; j++) 
            {
                int k = matrix[j][i];
                if (found[k]) 
                return false;
                found[k] = true;
            }
    }
    return true;
    }
}