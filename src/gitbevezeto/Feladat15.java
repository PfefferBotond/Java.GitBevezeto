package gitbevezeto;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Feladat15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy szöveget: ");
        String szöveg = sc.nextLine();
        String menüpont = "";
        while (menüpont.equals("f")){
            System.out.println("Adja meg mit szeretne csinálni a szöveggel: ");
            System.out.println("\ta - Nagybetüssé alakítani");
            System.out.println("\tb - Kisbetűssé alakítani");
            System.out.println("\tc - Lekérdezni a hosszát");
            System.out.println("\td - Össze hasonlítani egy másik szöveggel");
            System.out.println("\te - A szöveg egy részét kiiratni");
            System.out.println("\tf - Kilépni");
            System.out.print("Adja meg a menüpontot");
            menüpont = sc.nextLine().toLowerCase();
            switch (menüpont){
                case "a" :
                    System.out.println(szöveg.toUpperCase());
                    break;
                case "b" :
                    System.out.println(szöveg.toLowerCase());
                    break;
                case "c" :
                    System.out.printf("A szöveg %d karakter\n");
                    break;
                case "d" :
                    System.out.println("Kérem adjon meg egy másik szöveget");
                    String szoveg2 = sc.nextLine();
                    int osszehasonlitas = szöveg.compareTo(szoveg2);
                    if (osszehasonlitas < 0){
                        System.out.println("A második szöveg ban előrébb az ABC-ben");
                    } else if (osszehasonlitas > 0){
                        System.out.println("A második szöveg van előrébb");
                    } else {
                        System.out.println("A két szöveg megegyezik");
                    }
                    break;
                case "e" :
                    System.out.println("Kérem adja meg a kezdő karakterszámát amit ki szeretn eírni");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Kérem adja meg a karakterszámát amit ki szeretne írni");
                    sc.nextLine();
                    System.out.println(szöveg.substring(a - 1));
                    break;
                case "f" :
                    System.out.println("Viszlát!");
                    break;
                default:
                    System.out.println("Rossz lehetőséget adok meg: ");
                    break;
            }
        }
    }
}
