public class Circle implements Figure {

    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double square(){
        return Math.PI * Math.pow(this.r,2);
    }

}
