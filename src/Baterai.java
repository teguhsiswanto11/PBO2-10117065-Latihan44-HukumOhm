public class Baterai {
    private float kuatArus;
    private float hambatan;

    public float getKuatArus() {
        return kuatArus = 3;
    }

    public float getHambatan() {
        return hambatan = 12;
    }

    public void baterai() {
        System.out.println("===== Hukum Ohm =====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar \n" +
                "akan berbanding lurus dengan beda potensial \n" +
                "pada ujung-ujung kawat penghantar tersebut \n" +
                "asalkan suhu kawat dijaga konstan. \n");
    }

    public float baterai(float kuatArus, float hambatan) {

    return hitungTegangan();}

    public float hitungTegangan() {
     return kuatArus*hambatan;}

}
