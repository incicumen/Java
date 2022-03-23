package hafta4;

import java.util.Scanner;

public class faktoriyelHesaplama {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz : ");

        int num = sc.nextInt();
        double faktoriyel = 1;
        for(int i = 1; i <= num; i++){
            faktoriyel *= i;
        }
        System.out.println("sayinin faktoriyeli : " + faktoriyel);


    }
}
