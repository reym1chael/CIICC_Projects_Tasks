
class Point {
    //private double x;
    //private double y;
    private int x;
    private int y;

    //public Point(double x, double y){
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("("+x+","+y+")");
    }

    public void scale(){
        //x /= x;
        //y /=y;
        this.x = x/2;
        this.y = y/2;
    }
}

public class Task12 {
    public static void main(String[] args) {
        Point p = new Point(32,32);
        for (int i = 0; i <= 5; i++){ // <= 5 to show (0,0)
            p.scale();
            p.print();
        }
    }
}
