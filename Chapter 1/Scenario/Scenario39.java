public class Scenario39 {
    public static int[][] multiplyMatrices(int[][] matrix1,int[][] matrix2){
        int n=matrix1.length;
        int[][] result=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static int[][] matrixPower(int[][] matrix,int power){
        int n=matrix.length;
        int[][] result=new int[n][n];
        for(int i=0;i<n;i++){
            result[i][i]=1;            
        }
        if(power==0) return result;
        result=matrixPower(matrix, power/2);
        result=multiplyMatrices(result, result);
        // printMatrix(result);
        if((power&1)==1){
            result=multiplyMatrices(result,matrix);
        }
        // printMatrix(result);
        return result;
    }
    public static void printMatrix(int[][] result){
        int n=result.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result=matrixPower(matrix, 2);        
        printMatrix(result);
    }
}
