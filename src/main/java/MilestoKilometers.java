import java.util.Scanner; 
 
public class MilestoKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        float miles = input.nextFloat();
        
        float kilometers = miles * 1.60934f;
        System.out.println(miles + " miles is equal to " + kilometers + " kilo" + "meters.");
        input.close();
    }
}
      
  