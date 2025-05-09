import java.util.Scanner;

public class TowerOfHanoi {
    //recursive function 
    public static void solveHanoi(int n, char source, char peg, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return; //base case
        }

        // move top disk (n-1) disks to helper peg
        // helper peg = to temporarily hold disks
        solveHanoi(n - 1, source, destination, peg);

        // move remaining disk to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination );

        // move top disk (n-1) from helper peg to destination
        solveHanoi(n - 1, peg, source, destination);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDisks;
        
        System.out.println("Enter the number of disks: ");
        numberOfDisks = input.nextInt();

        solveHanoi(numberOfDisks, 'A', 'B', 'C');

    }
}