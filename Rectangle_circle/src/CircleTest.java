import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Figure cir = new Circle(10);
    @org.junit.jupiter.api.Test
    void testSquare() {
        assertEquals(Math.PI*10*10, cir.square());
    }
}