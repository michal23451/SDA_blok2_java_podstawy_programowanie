package pl.sdacademy.java.basic.day2extras;

public class Task7 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 3},
                {4, 5, 6, 3},
                {7, 8, 9, 9},
                {1, 3, 4, 1}

        };
        System.out.println("Sum of elements on diagonals: " + diagonalSum(array));
        System.out.println("Sum of elements on edges: " + edgesSum(array));
    }


    private static int diagonalSum(int[][] input) {
        int sum = 0;
        for(int r = 0; r < input.length; r++) {
            for(int c = 0; c < input[r].length; c++) {
                if(r == c || r + c == input[r].length - 1) {
                    sum += input[r][c];
                }
            }
        }
        return sum;
    }

    private static int edgesSum(int[][] input) {
        int sum = 0;
        for(int r = 0; r < input.length; r++) {
            for(int c = 0; c < input[r].length; c++) {
                if(r == 0 || r == input.length - 1 || c == 0 || c == input[r].length - 1) {
                    sum += input[r][c];
                }
            }
        }
        return sum;
    }
}
