package week07_ExamplesForExam;

enum KartTuru {
    Kupa, KARO, Sinek, MACA
}

// KartDegeri enum'u
enum KartDegeri {
    AS, IKI, UC, DORT, BES, ALTI, YEDI, SEKIZ, DOKUZ, ON, VALE, KIZ, PAPAZ
}

// Card sınıfı
class Kart {
    private final KartTuru turu;
    private final KartDegeri degeri;

    public Kart(KartTuru turu, KartDegeri degeri) {
        this.turu = turu;
        this.degeri = degeri;
    }

    
    public String toString() {
        return degeri + " " + turu;
    }
}
