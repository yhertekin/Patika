
public class Main {
    public static void main(String[] args) {
        int row = 2;
        int column = 3;
        int[][] matrix = {{1,2,3}, {4,5,6}};
        int[][] transpose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
               transpose[j][i] = matrix[i][j];
            }
        }

        printArr(matrix);
        printArr(transpose);
    }
    public static void printArr(int[][] arr){
        for(int[] row : arr){
            for (int j : row) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}