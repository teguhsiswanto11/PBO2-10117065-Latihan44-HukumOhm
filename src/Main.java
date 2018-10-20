/**
 * @author
 * NAMA     : Teguh Siswanto
 * KELAS    : PBO2
 * NIM      : 10117065
 * Deskripsi Program : Menghitung besar tegangan menggunakan hukum ohm V = R.I
 *
 */
public class Main {
    public static void main(String[] args) {
        Baterai bat = new Baterai(3,12);
        Baterai bat2 = new Baterai();

        System.out.println("Kuat Arus : "+bat.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+bat.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+bat.hitungTegangan()+" volt");

    }
}
