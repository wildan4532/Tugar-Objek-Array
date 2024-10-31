import java.util.Scanner;

/**
 * array
 */
public class array {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner wildan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Objek : ");
        int object = wildan.nextInt();

        product[] p = new product[object];

        for (int i = 1; i < p.length + 1; i++) {
            System.out.print("Masukkan Nomor : ");
            int number = wildan.nextInt();
            System.out.print("Masukkan Nama : ");
            String name = wildan.next();
            System.out.print("Masukkan Kuantitas : ");
            int quantity = wildan.nextInt();
            System.out.print("Masukkan Harga : ");
            double price = wildan.nextDouble();
            System.out.println("--------------------------------");
            System.out.println("           OBJEK KE - "+ i);
            System.out.println("--------------------------------");
        }

    }
}