public class Check {

    public static void main(String[] args) {

        Circle cir = new Circle(10);
        Rectangle rec = new Rectangle(10, 20);
        Foursquare fou = new Foursquare(10);
        System.out.println(cir.square());
        System.out.println(rec.square());
        System.out.println(fou.square());

    }

}
