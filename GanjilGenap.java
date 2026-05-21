import java.util.Scanner;

public class GanjilGenap {

    static boolean isGanjil(int angka) {
        return angka % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (isGanjil(angka)) {
            System.out.println(angka + " adalah bilangan GANJIL");
        } else {
            System.out.println(angka + " adalah bilangan GENAP");
        }

        input.close();
    }
}