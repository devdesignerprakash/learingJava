

public class MultiDimesionSum{
    public static void main(String[] args){
        int [][][] matrix1={
            {
                {1,2,3},
                {4,5,6}
            },
            {
                {7,8,9},
                {10,11,12}
            }
        };
        int [][][] matrix2={
            {
                {13,14,15},
                {16,17,18}
            },
            {
                {19,20,21},
                {22,23,24}
            }
        };
        int[][][] sum = sumMatricesElement(matrix1, matrix2);
        System.out.println("Sum of the two 3D matrices:" + java.util.Arrays.deepToString(sum));
    }
    public static int[][][] sumMatricesElement(int[][][]a,int[][][]b){
        int [][][] result= new int[a.length][a[0].length][a[0][0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    result[i][j][k]=a[i][j][k]+b[i][j][k];
                }
            }
        }
        return result;
    }
}