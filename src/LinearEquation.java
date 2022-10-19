public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int yDifference;
    private int xDifference;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double slope() {
        int yDifference = y2 - y1;
        int xDifference = x2 - x1;
        double slope = (double) yDifference / xDifference; //figure out how to cast double
        return slope;
    }

    private String slopeInterceptForm() {
        String slopeInterceptForm = ("(" + yDifference + "/" + xDifference + ")" + "x" + findYIntercept() );
        return slopeInterceptForm;
    }


    public double findYIntercept () {
        double mxValue = (slope() * x1);
        int yIntercept = (int) (y1 - mxValue);
        return yIntercept;

    }
    public double findDistance () {
         double distance = Math.sqrt(Math.pow(x2 - x1, x2 - x1 ) + Math.pow(y2 - y1, y2 - y1 ));
         return distance;
    }

    public String toString() {
        String coordinateInfo = "First Coordinate Pair: (" + x1 + ", " + y1 + ")";
        String secondcoordinateInfo = "Second Coordinate Pair: (" + x2 + "," + y2 + ")";
        String slopeInfo = "Slope of line:" + slope();
        String yInterceptInfo = "Y intercept: " + findYIntercept();
        String slopeInterceptInfo = "Slope Intercept Form: " + slopeInterceptForm();
        String distanceInfo = "Distance between two points: " + findDistance();
        return coordinateInfo + secondcoordinateInfo + slopeInfo + yInterceptInfo + slopeInterceptInfo + distanceInfo;

    }

    public String findCoordinatePoint (double knownXValue) {
        double mxValue = (slope() * knownXValue);
        double yValue = (double) mxValue + findYIntercept();
        String findCoordinatePoint = ( "(" + knownXValue + ", " + yValue );
        return findCoordinatePoint;
    }

}
