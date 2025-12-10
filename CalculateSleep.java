import java.util.Scanner; 

public class CalculateSleep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter the number of hours: "); 
        int hours = input.nextInt(); 
        int sleep = 24 - hours; 
        int result = sleep; 

        System.out.println(result); 

        input.close(); 
    }
}
