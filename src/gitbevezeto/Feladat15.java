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
        }
    }
}
