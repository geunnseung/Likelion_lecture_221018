package Java_algorithm_221018;

import java.util.Scanner;

public class SquareStar {
    public void printSquareStar(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        SquareStar squareStar = new SquareStar();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        squareStar.printSquareStar(size);

    }
}
