package practice10;
public class Q06_Runner {
    public static void main(String[] args) {
        Q06_Child obj = new Q06_Child();
        System.out.println( "Area Of Rectangle: "+obj.areaOfRectangle(6,5));
        System.out.println("Area Of Triangle: "+obj.areaOfTriangle(4,7));
        obj.add(6,4);
    }
}