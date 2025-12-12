import java.util.Scanner;
public class Ties {
    public static void main(String[] args) {
        System.out.print("Enter the number of players and matches separated by a space: ");
       Scanner input = new Scanner(System.in);
       String [] firstLine = input.nextLine().split(" ");
       int players = Integer.parseInt(firstLine[0]);
       int matches = Integer.parseInt(firstLine[1]);
       System.out.print("Enter the points of each player separated by spaces: ");
       String[] secondLine = input.nextLine().split(" ");
       int totalPoints = 0;
       for (int i = 0; i < secondLine.length; i++) {    
        totalPoints += Integer.parseInt(secondLine[i]);
         }
         int ties = (42 * matches - totalPoints) / 22;
         System.out.println(ties);
       input.close();
    }
}