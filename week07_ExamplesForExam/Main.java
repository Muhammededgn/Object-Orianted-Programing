package week07_ExamplesForExam;

public class Main {
    public static void main(String[] args) {
        // 52 kartı temsil etmek için bir desteyi oluştur
        Kart[] destede_Kartlar = new Kart[52];
        int index = 0;
        int a=1;
        // Kartları oluştur ve desteye ekle
        for (KartTuru turu : KartTuru.values()) {
            for (KartDegeri degeri : KartDegeri.values()) {
                destede_Kartlar[index] = new Kart(turu, degeri);
                index++;
            }
        }

        // Destedeki kartları yazdır
        for (Kart kart : destede_Kartlar) {
            System.out.println(a+" "+kart);
            a++;
        }
    }
}