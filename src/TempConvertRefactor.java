import java.util.Scanner;

/**
 * Program untuk mengonversi suhu dari Celsius ke Fahrenheit dan Kelvin.
 * Pada class ini akan meminta input suhu dalam Celsius dari pengguna,
 * lalu menampilkan hasil konversi ke Fahrenheit dan Kelvin.
 */
public class TempConvertRefactor {

    /**
     * Metode utama untuk menjalankan program.
     * Meminta input suhu dari pengguna dalam Celsius dan
     * menampilkan hasil konversi ke Fahrenheit dan Kelvin.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = getCelsiusInput(scanner);
        tampilkanhasil(celsius);
    }

    /**
     * Meminta pengguna untuk memasukkan suhu dalam Celsius.
     *
     * @param scanner Scanner yang digunakan untuk membaca input pengguna.
     * @return suhu yang dimasukkan oleh pengguna dalam Celsius.
     */
    private static double getCelsiusInput(Scanner scanner) {
        System.out.print("Masukkan suhu dalam Celsius: ");
        return scanner.nextDouble();
    }

    /**
     * Mengonversi suhu dari Celsius ke Fahrenheit.
     *
     * @param celsius suhu dalam Celsius.
     * @return suhu yang telah dikonversi ke Fahrenheit.
     */
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /**
     * Mengonversi suhu dari Celsius ke Kelvin.
     *
     * @param celsius suhu dalam Celsius.
     * @return suhu yang telah dikonversi ke Kelvin.
     */
    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    /**
     * Mencetak hasil konversi suhu dalam Fahrenheit dan Kelvin.
     *
     * @param celsius suhu dalam Celsius yang akan dikonversi.
     */
    private static void tampilkanhasil(double celsius) {
        double fahrenheit = celsiusToFahrenheit(celsius);
        double kelvin = celsiusToKelvin(celsius);

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        System.out.println("Suhu dalam Kelvin: " + kelvin);
    }
}
