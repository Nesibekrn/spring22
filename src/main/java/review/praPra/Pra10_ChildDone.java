package review.praPra;

public class Pra10_ChildDone extends Pra10_AreaDone {
    @Override
    public void recta(int height, int widht) {
        System.out.println("Area of reckt is: "+(height*widht));
    }
    @Override
    public void tri(int heigt, double base) {
        System.out.println("The Area of tria is: "+(heigt*base/2));
    }
}

