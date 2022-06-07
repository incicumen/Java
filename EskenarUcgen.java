package Hafta10;



public class EskenarUcgen {
    public static void main(String[] args) {

        EskenarUcgen1 e1 = new EskenarUcgen1();
        e1.yukseklik = 5;
        e1.taban = 2;
        float alan = e1.AlanHesabi();
        System.out.println("Eskenar Ucgenin Alani : " + alan);


        EskenarUcgen1 e2 = new EskenarUcgen1();
        e2.yukseklik = 5;
        e2.taban = 2;
        float cevre = e2.CevreHesabi();
        System.out.println("Eskenar Ucgenin Cevresi : "+ cevre);


    }
}

class EskenarUcgen1{
    float yukseklik;
    float taban;

    float AlanHesabi(){
        float alan = (yukseklik * taban)/2;
        return alan;
    }

    float CevreHesabi(){
        float cevre = taban * 3;
        return cevre;
    }
}
