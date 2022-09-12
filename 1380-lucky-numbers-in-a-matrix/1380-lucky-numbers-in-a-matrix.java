class Solution {
    
    public int minimum(int[] rowCol) {
        int min = rowCol[0];
        
        for (int i=1; i<rowCol.length; i++) {
            if (min > rowCol[i]) {
                min = rowCol[i];
            }
        }
        return min;
    }
    public int maximum (int[] rowCol) {
        int max = rowCol[0];
        for (int i=1; i<rowCol.length; i++) {
            if (max < rowCol[i]) {
                max = rowCol[i];
            }
        }
        return max;
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] row = new int[m];
        int[] col = new int[n];
        
        for(int i=0; i<m; i++) {
            row[i] = minimum(matrix[i]);
        }
        for(int c=0; c<n; c++) {
             int[] temp = new int[m];
            for (int r=0;r<m; r++) {
                temp[r] = matrix[r][c];
            }
            col[c] = maximum(temp);
        }
        
        for(int i=0; i<m; i++) {
            System.out.println(row[i]);
        }
        System.out.println("--------------------");
        for(int i=0; i<n; i++) {
            System.out.println(col[i]);
        }
        List<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(row[i] == col[j]) {
                    res.add(row[i]);
                }
            }
        }
        return res;
    }
}