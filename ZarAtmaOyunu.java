public class ZarAtmaOyunu {
    public static void main(String[] args) {
        int deger = (int) (Math.random() * 6 + 1);
        System.out.println("Atılan Zar : " + deger);

        if (deger == 1) {
            System.out.println(".");
        }
        if (deger == 2) {
            System.out.println(". .");
        }
        if (deger == 3) {
            System.out.println(". .\n .");
        }
        if (deger == 4) {
            System.out.println(". .\n. .");
        }
        if (deger == 5) {
            System.out.println(". .\n .\n. . ");
        }
        if (deger == 6) {
            System.out.println(". . .\n. . .");
        }

    }
}
