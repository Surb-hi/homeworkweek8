package javahomeworkweek7;

public class Program16_point {
    int x;
    int y;

    public Program16_point() {//no arg constructore
    }

    public Program16_point(int x, int y) {//with pera constractore
     this.x=x;
     this.y=y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return distance(0,0);
    }//d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    public double distance(int x,int y){
        return Math.sqrt((((x-this.x)) * (x-this.x)+(y-this.y)*(y-this.y)));
}
    public double distance(Program16_point another) {
        return distance(another.x, another.y);

}
//Main method
    public static void main(String[] args) {
        Program16_point first = new Program16_point(6, 5);
        Program16_point second = new Program16_point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Program16_point point = new Program16_point();
        System.out.println("distance()= " + point.distance());


    }
    }
