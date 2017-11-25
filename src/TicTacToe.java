/**
 * Created by surya on 10/22/17.
 */
public class TicTacToe {

    private char [][] board;
    private char currentPlayerMark;

    public void TicTacToe(){
        board = new char[3][3];
        currentPlayerMark = 'x';
        initializeBoard();
        
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    public void printBoard(){
        System.out.println("-------------------");
        for(int i =0; i<3; i++){
            System.out.println( "| ");
            for(int j=0; j<3; j++){
                System.out.println(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("-------------------");
        }

    }
    public boolean isBoardFull(){
        boolean isFull = true;
        for(int i =0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(board[i][j] == '-'){
                    isFull = false;
                }
            }
        }
        return isFull;
    }
    public boolean checkForWin (){
        return (checkRowsForWin() || checkColumnsForWin() ||  checkDiagnolsForWin());

    }
    private boolean checkRowsForWin(){
        for(int i = 0; i<3; i++){
            if(checkRowCol(board[i][0], board[i][1], board[i][2]) == true){
                return true;
            }
        }
        return false;
    }
    private boolean checkColumnsForWin(){
        for(int i =0; i<3; i++){
            if(checkRowCol(board[0][i],board[1][i],board[2][i]) == true){
                return true;

            }
        }
        return false;

    }
    private boolean checkDiagnolsForWin(){
        return (checkRowCol(board[0][2], board[1][1], board[2][0]) == true);



    }
    private boolean checkRowCol( char s, char s1, char s2){
        return((s != '-') && (s == s1) && s1 == s2);

    }
    public void changePlayer(){
        if(currentPlayerMark == 'x'){
            currentPlayerMark = 'o';
        }else{
            currentPlayerMark = 'x';
        }
    }
    public boolean placeMark(int row, int col){
        if((row >= 0) && (row<3)){
            if((col>=0) && (col<3)){
                if(board[row][col] == '-'){
                    board[row][col] = currentPlayerMark;
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String [] args){
        TicTacToe game = new TicTacToe();
        game.TicTacToe();
        game.placeMark(2,0);
        game.printBoard();



        if(game.checkForWin()){
            System.out.println("We have a Winner! Congrats!");
            System.exit(0);
        }else if(game.isBoardFull()) {
            System.out.println("Appears We have a draw");
            System.exit(0);

        }
        game.changePlayer();
    }

}




