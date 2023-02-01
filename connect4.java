import java.util.Scanner;
import java.util.InputMismatchException;
public class connect4
{
    static Scanner scanner = new Scanner(System.in);
    static boolean shouldContinue = true;
    final static int WIDTH = 6;
    final static int HEIGHT = 6;
    final static int BOTTOM_ROW = WIDTH - 1;

    static char[][] board = new char[WIDTH][HEIGHT];
    public static void runEventLoop() {
        while(shouldContinue){

            System.out.println("enter 1 for team 1");
            System.out.println("enter 2 for team 2");
            System.out.println("enter 0 to exit");
            try{
                int user = scanner.nextInt();
                if (user == 1) {

                }
                if (user == 2) {

                }
                if (user == 0) {
                    shouldContinue = false;
                }
            } catch (InputMismatchException error) {
                System.out.println("An error has occured");
            }
        }
    }

    public static void CreateBoard() {
        for (int w = 0; WIDTH > w; w += 1) {
            for (int h = 0; HEIGHT > h; h += 1) {
                board[w][h] = '.';
            }
        }

    }
      public static void PrintBoard() {
        for (int w = 0; WIDTH > w; w += 1) {
            for (int h = 0; HEIGHT > h; h += 1) {
                System.out.print(board[w][h]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main (String[] args) {
        connect4 connect = new connect4();
        connect.runEventLoop();
    }
       public static void DropX(){
        //creates a counter
        int counter = 1;

        //shows whos turn
        System.out.println("Player 1 turn");

        //gets input
        int column = scanner.nextInt();

        while(true){
            if(column > WIDTH){
                System.out.println("That's not a valid column");
                break;
            }

            if (board[BOTTOM_ROW][column] == '.') { //checks to see if space is blank, puts X there if it is
                board[BOTTOM_ROW][column] = 'X';
                break; //breaks loop after placing
            }else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O'){ //if space isn't blank, checks to see if one above is
                if(board[BOTTOM_ROW - counter][column] == '.'){ //puts X if blank
                    board[BOTTOM_ROW - counter][column] = 'X';
                    break; //breaks loop after placing
                }
            }
            counter += 1; //adds one to counter if the space wasn't blank, then loops again
            if(counter == WIDTH){ //checks to see if at end of column
                System.out.println("That column is full");
                break;
            }
        }
    }
     public static void DropO(){
        //creates a counter
        int counter = 1;

        //shows whos turn
        System.out.println("Player 2 turn");

        //gets input
        int column = scanner.nextInt();

        while(true){
            if(column > WIDTH){
                System.out.println("That's not a valid column");
                break;
            }

            if (board[BOTTOM_ROW][column] == '.') { //checks to see if space is blank, puts O there if it is
                board[BOTTOM_ROW][column] = 'O';
                break; //breaks loop after placing
            }else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'O'){ //if space isn't blank, checks to see if one above is
                if(board[BOTTOM_ROW - counter][column] == '.'){ //puts O if blank
                    board[BOTTOM_ROW - counter][column] = 'O';
                    break; //breaks loop after placing
                }
            }
            counter += 1; //adds one to counter if the space wasn't blank, then loops again
            if(counter == WIDTH){ //checks to see if at end of column
                System.out.println("That column is full");
                break;
            }
        }
    }
}


