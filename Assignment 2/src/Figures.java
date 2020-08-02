import java.util.Scanner;

public class Figures {
        public static void main(String[] args) {
            System.out.println("Programming Fundamentals");
            System.out.println("NAME: Dan Hannigan");           // assignment header
            System.out.println("PROGRAMMING ASSIGNMENT 2");

            Scanner in = new Scanner(System.in);
            System.out.print("\nEnter the size of the figure (odd number): ");
            int size = in.nextInt();
            while (size % 2 == 0) { // checks for odd number
                System.out.println("Invalid figure size - must be an odd number");
                System.out.print("\nRe-enter the size of the figure: "); // asks for odd number again
                size = in.nextInt();
            }
            System.out.println("\nMENU:");
            System.out.println("1. Print box");
            System.out.println("2. Print diamond"); // shape menu
            System.out.println("3. Print X");
            System.out.println("4. Quit Program");
            System.out.print("\nPlease select an option: ");
            int choice = in.nextInt();
            while (choice != 4) {
                switch (choice) { // keeps going if wrong number entered.
                    case 1:
                        printBox(size);
                        break;
                    case 2:
                        printDiamond(size);
                        break;
                    case 3:
                        printX(size);
                        break;
                    default:
                        break;
                }
                System.out.print("\nPlease select an option: "); // once completed, asks for new shape
                choice = in.nextInt();
            }
            System.out.println("\nGood bye!");
            System.exit(0); // ends program
        }
        public static void printBox(int size) { // creates box shape
            int i, j;
            for (i = 1; i <= size; i++) {
               for (j = 1; j <= size; j++) {
                  System.out.print("X");
               }
                  System.out.println();
               }
            }
        public static void printDiamond(int size) { //creates diamond shape
            int i, j, m;
            for (i = 1; i <= size - 1; i += 2) {
                for (j = size; j >= i; j -= 2) {
                    System.out.print(" ");
                }
                System.out.print("X");
                for (j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("X");
            }
            for (i= 1; i <= size; i += 2) {
                for (j = 1; j <= i; j += 2) {
                    System.out.print(" ");
                }
                System.out.print("X");
                for (m = size; m >= i + 1; m--) {
                    System.out.print(" ");
                }
                System.out.println("X");
                }
            }
        public static void printX(int size) { //creates X shape
            int i, j;
            for (i = 1; i <= size; i++) {
                for (j = 1; j <= size; j++) {
                    if (i == j || i + j == size + 1) {
                       System.out.print("X");
                    }
                    else {
                       System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
}