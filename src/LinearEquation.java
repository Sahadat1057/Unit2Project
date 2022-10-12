public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 =  x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double slope( int x1, int y1, int x2, int y2) {
        int value1 = y2 - y1;
        int value2 = x2 - x1;
        double value3 = double() value1 / value2; //figure out how to cast double
        return value3;
    }

    public double

}
