public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public LinearEquation(int x1, int y1, int x2, int y2, double slope, double yIntercept, double distance) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double Slope( int x1, int y1, int x2 , int y2) {
        int value1 = y2 - y1;
        int value2 = x2 - x1;
        double slope = (double) value1 / value2; //figure out how to cast double
        return slope;
    }
     /*public double getSlope() {
         return value3;
    } */
    public double findYIntercept (int x1, int y1, double slope) {
        double mxValue = slope * x1;
        double yIntercept = y1 - mxValue;
        return yIntercept;

    }
    public double findDistance (int x1, int y1, int x2, int y2, double distance) {
        return distance = Math.sqrt(Math.pow(x2 - x1, x2- x1 ) + Math.pow(y2 - y1, y2 - y1 ));
    }


}
