class MatrixZeros {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> setRow = new HashSet<>();
        HashSet<Integer> setCol = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] != 0){
                    continue;
                }
                else{
                    setRow.add(i);
                    setCol.add(j);
                }
            }
        }
        for(Integer i: setRow){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = 0;
            }
        }
        for(Integer i: setCol){
            for(int j=0;j<matrix.length;j++){
                matrix[j][i] = 0;
            }
        }
        return;               
    }
}