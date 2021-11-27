package Rectangle;

class Rect {
    public double length;
    public double breadth;
    public double area(){
        return length*breadth;
    }

}
class Cuboid extends Rect{
    public double height;
    public double volume(){
        return area()*height;
    }
}
public class Rectangle{
    public static void main(String[] args){
        Cuboid cuboid=new Cuboid();
        cuboid.length=4;
        cuboid.breadth=5;
        cuboid.height=6;
        System.out.println(cuboid.area());
        System.out.println(cuboid.volume());
    }
}
