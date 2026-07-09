class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int sum = 0;
        for(int i = 0;i < row ; i++)
        {
                sum+=mat[i][i];
                sum+=mat[i][row - i - 1];
            
        }
        if(row % 2!=0)
        sum-=mat[row/2][row/2];
        return sum;
    }
}