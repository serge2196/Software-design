public class Rectangle implements Figure{

    private double a;
    private double b;

    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;
    }

    public double square (){
        return this.a * this.b;
    }

}
