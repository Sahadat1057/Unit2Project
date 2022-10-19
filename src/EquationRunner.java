import java.util.Scanner;
public class EquationRunner {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.print("Enter the first coordinate point: ");
            String firstCoordinate = s.nextLine();
            System.out.print("Enter the second coordinate point: ");
            String secondCoordinate = s.nextLine();

            int findfirstComma = firstCoordinate.indexOf(",");
            int x1 = Integer.parseInt(firstCoordinate.substring(1 , findfirstComma));
            int y1 = Integer.parseInt(firstCoordinate.substring(findfirstComma + 1 , firstCoordinate.length() - 1) );

            int findsecondComma = secondCoordinate.indexOf(",");
            int x2 = Integer.parseInt(secondCoordinate.substring(1 , findsecondComma));
            int y2 = Integer.parseInt(secondCoordinate.substring(findsecondComma +1,secondCoordinate.length() ));

            LinearEquation slopeEquation = new LinearEquation(x1,y1, x2, y2);

            System.out.println(slopeEquation.toString());

            System.out.print("Enter an x value: ");
            double xValue = s.nextDouble();

            String findCoordinatePoint = slopeEquation.findCoordinatePoint(xValue);
            System.out.println("The solved coordinate plane is: " + findCoordinatePoint);







        }
    }


