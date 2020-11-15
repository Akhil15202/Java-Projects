
import java.util.*;
public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean pass = false;

       
        char[] elements = {'_', '_', '_', '_', '_', '_', '_', '_', '_', };

        System.out.println("---------");
        System.out.println("| " + elements[0] + " " + elements[1] + " " + elements[2] + " |");
        System.out.println("| " + elements[3] + " " + elements[4] + " " + elements[5] + " |");
        System.out.println("| " + elements[6] + " " + elements[7] + " " + elements[8] + " |");
        System.out.println("---------");
        
        boolean isANumber = true;
        boolean isnotOccupied = false;
        boolean check = true;
        int XorO = 1;
        do {
            isANumber = true;
            check = true;
            isnotOccupied = false;
            System.out.println("Enter the Coodinates");
            String cordinates = input.nextLine();
            cordinates = cordinates.replaceAll(" ","");
            int corCheck = 0;
            if (cordinates == null) 
            	{
            	isANumber = false;
            	}
            int i =0;
            try {
                i = Integer.parseInt(cordinates);
            } 
            catch (NumberFormatException e) {
                isANumber = false;
                System.out.println("You should enter numbers!");
            }
            if (isANumber == true) {
            if (i == 11) 
            {corCheck = 0;}
            if (i == 12)
            {corCheck = 1;}
            if (i == 13)
            {corCheck = 2;}
            if (i == 21)
            {corCheck = 3;}
            if (i == 22)
            {corCheck = 4;}
            if (i == 23)
            {corCheck = 5;}
            if (i == 31)
            {corCheck = 6;}
            if (i == 32)
            {corCheck = 7;}
            if (i == 33)
            {corCheck = 8;}
            if (i != 11 && i != 12 && i != 13 && i != 21 && i != 22 && i != 23 && i != 31 && i != 32 && i != 33)
            {
                System.out.println("Coordinates should be from 1 to 3!");
                check = false;
            }
            if (elements[corCheck] != '_')
            {
                System.out.println("This cell is occupied! Choose another one!");
                check = false;
            }
            if (check == true) {
                XorO++;
                if (XorO % 2 == 0) {
                    elements[corCheck] = 'X';
                }
                if (XorO % 2 !=0) {
                    elements[corCheck] = 'O';
                }
                isnotOccupied = true;
                System.out.println("---------");
                System.out.println("| " + elements[0] + " " + elements[1] + " " + elements[2] + " |");
                System.out.println("| " + elements[3] + " " + elements[4] + " " + elements[5] + " |");
                System.out.println("| " + elements[6] + " " + elements[7] + " " + elements[8] + " |");
                System.out.println("---------");
                if ((elements[0] == 'X' && elements[4] == 'X' && elements[8] == 'X') || (elements[1] == 'X' && elements[4] == 'X' && elements[7] == 'X') || (elements[2] == 'X' && elements[4] == 'X' && elements[6] == 'X') || (elements[0] == 'X' && elements[1] == 'X' && elements[2] == 'X') || (elements[6] == 'X' && elements[7] == 'X' && elements[8] == 'X') || (elements[3] == 'X' && elements[4] == 'X' && elements[5] == 'X') || (elements[0] == 'X' && elements[3] == 'X' && elements[6] == 'X') || (elements[2] == 'X' && elements[5] == 'X' && elements[8] == 'X')) {
                    System.out.println("X wins");
                    pass = true;
                    break;
                }
                if ((elements[0] == 'O' && elements[4] == 'O' && elements[8] == 'O') || (elements[1] == 'O' && elements[4] == 'O' && elements[7] == 'O') || (elements[2] == 'O' && elements[4] == 'O' && elements[6] == 'O') || (elements[0] == 'O' && elements[1] == 'O' && elements[2] == 'O') || (elements[6] == 'O' && elements[7] == 'O' && elements[8] == 'O') || (elements[3] == 'O' && elements[4] == 'O' && elements[5] == 'O') || (elements[0] == 'O' && elements[3] == 'O' && elements[6] == 'O') || (elements[2] == 'O' && elements[5] == 'O' && elements[8] == 'O')) {
                    System.out.println("O wins");
                    pass = true;
                    break;
                }
            }
            }
        }
        while (XorO < 10);
        if (pass == false) {
            System.out.println("Draw");
        }

    }
}







