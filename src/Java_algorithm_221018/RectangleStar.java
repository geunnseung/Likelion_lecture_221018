package Java_algorithm_221018;

public class RectangleStar {
    public void printRectangle(int x, int y) {

        for (int i = 0; i < y; i++) {
            System.out.println("*".repeat(x));
        }
    }

    public static void main(String[] args) {

        RectangleStar rectangleStar = new RectangleStar();
        rectangleStar.printRectangle(3,5);
    }
}
