import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    static int row;
    static int col;
    static int mineCount;

    public MineSweeper(){
        Scanner input = new Scanner(System.in);
        System.out.print("Row count: ");
        row = input.nextInt();
        System.out.print("Column count: ");
        col = input.nextInt();
        mineCount = (row * col) / 3;
        generateField(row, col);
    }

    public static void generateField(int row, int col){

        String[][] mineField = new String[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                mineField[i][j] = "-";
            }
        }

        fillMines(mineField, mineCount);
        play(mineField);
        print(mineField);
    }

    public static void fillMines(String[][] mineField, int mineCount){
        int[][] minePositions = new int[mineCount][2];
        Random rand = new Random();
        for(int[] position : minePositions){
            position[0] = rand.nextInt(row);
            position[1] = rand.nextInt(col);
        }

        for(int[] position : minePositions){
            mineField[position[0]][position[1]] = "*";
        }
    }

    public static void play(String[][] mineField){
        Scanner input = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while(true){
            do {
                System.out.print("Enter x coordinate: ");
                x = input.nextInt();
            } while (x >= row);

            do {
                System.out.print("Enter y coordinate: ");
                y = input.nextInt();
            } while (y >= col);

            if(mineField[x][y].equals("*")){
                System.out.println("Lost the game");
                break;
            }

            mineField[x][y] = Integer.toString(countMines(mineField, x, y));
            print(mineField);

        }
    }

    public static int countMines(String[][] mineField, int x, int y){
        int counter = 0;
        for(int i = y-1; i < y+1; i++){
            if(i < 0 || i > row){
                continue;
            }
            for(int j = x-1; j < x+1; j++){
                if(j < 0 || j > col){
                    continue;
                }
                System.out.println(i + " " + j);
                if(mineField[i][j].equals("*")){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void print(String[][] field){
        for (String[] strings : field) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
