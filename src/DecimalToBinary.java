import java.util.Scanner;
/**
 * author Nadzrul
 *
 * */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan desimal: ");
        int decimal = input.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Bilangan binernya adalah: " + binary);
    }
/**
 * param decimal harus diisi dengan bilangan positif
 * return mengembalikan menjadi biner
 * */
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }
}
