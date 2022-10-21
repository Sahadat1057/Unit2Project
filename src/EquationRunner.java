import java.util.Scanner;
public class EquationRunner {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            // Asks user to input coordinate points 1 and 2
            System.out.print("Enter the first coordinate point: ");
            String firstCoordinate = s.nextLine();
            System.out.print("Enter the second coordinate point: ");
            String secondCoordinate = s.nextLine();

            // Parsing/ "finding" out where the x and y values are in both coordinates
            int findfirstComma = firstCoordinate.indexOf(",");
            int x1 = Integer.parseInt(firstCoordinate.substring(1 , findfirstComma));
            int y1 = Integer.parseInt(firstCoordinate.substring(findfirstComma + 1 , firstCoordinate.length() - 1) );

            int findsecondComma = secondCoordinate.indexOf(",");
            int x2 = Integer.parseInt(secondCoordinate.substring(1 , findsecondComma));
            int y2 = Integer.parseInt(secondCoordinate.substring(findsecondComma + 1 ,secondCoordinate.length() - 1 ));

            // Creating slopeEquation object using LinearEquation constructor
            LinearEquation slopeEquation = new LinearEquation(x1, y1, x2, y2);

            // Printing out all information
            System.out.println(slopeEquation.toString());

            // Asks user to input x value
            System.out.print("Enter an x value: ");
            double knownxValue = s.nextDouble();

            //Prints out y value based on user's given x value
            String findCoordinatePoint = slopeEquation.findCoordinatePoint(knownxValue);
            System.out.print("The solved coordinate plane is: " + findCoordinatePoint);

        }
    }


