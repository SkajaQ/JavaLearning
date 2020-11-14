package grybiena;

public class MojTekstuk {

    void drugojMetod() {
        int x1 = 3;
        int x2 = 5;
        int sum1 = summa(x1, x2);
        System.out.println(sum1);

        int x3 =10;
        int x4 = 11;
        int sum2 = summa(x3, x4);
        System.out.println(sum2);

        String mojtekstuk = "hehe, gryb";
        System.out.println(getText(mojtekstuk));
    }

    int summa(int a, int b) {
        return a + b;
    }

    String getText(String mojTekst) {
        return mojTekst.toUpperCase();
    }
}

    public static int atsitiktinis(int nuo, int iki) {
        return (int) (Math.random() * (iki - nuo + 1)) + nuo;
    }