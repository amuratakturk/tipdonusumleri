import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı girişi alın
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan bir ondalıklı sayı girişi alın
        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürün
        double tamSayiOndalikli = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürün
        int ondalikliSayiTam = (int) ondalikliSayi;

        // Sonuçları ekrana yazdırın
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürdüğümüzde: " + tamSayiOndalikli);
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürdüğümüzde: " + ondalikliSayiTam);
    }
}