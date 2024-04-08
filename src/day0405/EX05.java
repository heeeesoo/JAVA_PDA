package day0405;

public class EX05 {
    public static void main(String[] args) {
        OTT ott = new OTT();
        Netflix netflix = new Netflix("Netflix");
        Tving tving = new Tving("Tving");

        ott.play(netflix);
        ott.finish(netflix);

        ott.play(tving);
        ott.finish(tving);

    }
}

class OTT {
    String name;

    OTT() {

    }

    OTT(String name) {
        this.name = name;
    }

    void printOpeningLogo(OTT ott) {
        System.out.println(ott.getName());
        System.out.println("영상 시작");
    }

    void play(OTT ott) {
        this.printOpeningLogo(ott);
    }

    void finish(OTT ott) {
        System.out.println("끝");
    }

    String getName() {
        return this.name;
    }
}

class Netflix extends OTT {
    Netflix(String name) {
        super(name);
    }
}

class Tving extends OTT {
    Tving(String name) {
        super(name);
    }
}


