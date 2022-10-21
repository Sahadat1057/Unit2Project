public class LinearEquation {
    private int x1; // instance variables for my code below:
    private int y1;
    private int x2;
    private int y2;
    private int yDifference;
    private int xDifference;

    // constructor for my code below:
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    // methods for my code below:
    public double slope() {
         yDifference = y2 - y1;
         xDifference = x2 - x1;
        double slope = (double) yDifference / xDifference;
        return slope;
    }

    public double roundedSlope() {
        yDifference = y2 - y1;
        xDifference = x2 - x1;
        double slope = (double) yDifference / xDifference;
        double roundedSlope = (Math.round(slope * 100.0) / 100.0);
        return roundedSlope;
    }

    public double findYIntercept () {
        double mxValue = (slope() * x1);
        double yIntercept = (y1 - mxValue);
        return yIntercept;
    }

    public double roundedYIntercept() {
        double mxValue = (slope() * x1);
        double yIntercept = (y1 - mxValue);
        double roundedYIntercept = (Math.round(yIntercept * 100.0) / 100.0);
        return roundedYIntercept;
    }

    public String slopeInterceptForm() {
        String slopeInterceptForm = ("y = " + "(" + yDifference + "/" + xDifference + ")" + "x + " + roundedYIntercept() );
        return slopeInterceptForm;
    }

    public double findDistance () {
         int xDifference = x2 - x1;
         int yDifference = y2 - y1;
         double distance = (double) Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference , 2 ));
         double roundedDistance = (Math.round(distance * 100.0) / 100.0);
         return roundedDistance;
    }

    public String findCoordinatePoint (double knownXValue) {
        double mxValue = (slope() * knownXValue);
        double yValue = (mxValue + findYIntercept());
        double roundedYValue = (Math.round(yValue * 100.0) / 100.0);
        String findCoordinatePoint = ( "(" + knownXValue + "," + roundedYValue + ")");
        return findCoordinatePoint;
    }
    // method that prints all out the specific information required:
    public String toString() {
        String coordinateInfo = "First Coordinate Pair: (" + x1 + "," + y1 + ")" + "\r\n";
        String secondcoordinateInfo = "Second Coordinate Pair: (" + x2 + "," + y2 + ")" + "\r\n";
        String slopeInfo = "Slope of line: " + roundedSlope() + "\r\n";
        String yInterceptInfo = "Y Intercept: " + roundedYIntercept() + "\r\n";
        String slopeInterceptInfo = "Slope Intercept Form: " + slopeInterceptForm() + "\r\n";
        String distanceInfo = "Distance between the two points: " + findDistance() + "\r\n";
        String totalInfo = coordinateInfo + secondcoordinateInfo + slopeInfo + yInterceptInfo + slopeInterceptInfo + distanceInfo;
        return totalInfo;

    }


}
