import java.util.Scanner;
import java.util.InputMismatchException;
public class connect4
{
    Scanner scanner = new Scanner(System.in);
    boolean shouldContinue = true;
    public void runEventLoop() {
        while(shouldContinue){
            System.out.println("O-O-O-O-O-O-O");
            System.out.println("O-O-O-O-O-O-O");
            System.out.println("O-O-O-O-O-O-O");
            System.out.println("O-O-O-O-O-O-O");
            System.out.println("O-O-O-O-O-O-O");
            System.out.println("O-O-O-O-O-O-O");
            System.out.println("enter 1 for team 1");
            System.out.println("enter 2 for team 2");
            System.out.println("enter 0 to exit");
            try{
                System.out.println("");
               
                int user = scanner.nextInt();
                if (user == 0){
                    shouldContinue = false;
                }
            }  catch (InputMismatchException error) {
                System.out.println("An error has occured");
            }
        }
    }

    public static void main (String[] args) {
        connect4 connect = new connect4();
        connect.runEventLoop();
    }
}
