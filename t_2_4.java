package jAVA;

public class t_2_4 {
     public static void main(String[] args) {
        char[][] board = {

                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Sudoku:");
        boolean val = Sudoku.isValidSudoku(board);
        if(val){
            System.out.println("Все хорошо");
        }
        else {
            System.out.println("Такая цифра уже есть!");}
    }
}
