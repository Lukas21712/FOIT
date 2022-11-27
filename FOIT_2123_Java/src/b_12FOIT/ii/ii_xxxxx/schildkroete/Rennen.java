package b_12FOIT.ii.ii_xxxxx.schildkroete;

import java.util.Scanner;

public class Rennen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Schildkroete schildi1 = new Schildkroete("Peter - Schildi", 45, 2);
        Schildkroete schildi2 = new Schildkroete("Petra - Schildi", 30, 3);
        int streckenlaenge = 20;

        do {
            if (schildi1.isTankLeer(schildi1.getEnergiepunkte(), schildi1.getAlter())) {
                System.out.println(schildi1.getName() + " Ihr Tank ist leer, wollen Sie für 4 oder 9 Energiepunkte tanken?");
                schildi1.tanken(input.nextInt());
            }
            if (schildi2.isTankLeer(schildi2.getEnergiepunkte(), schildi2.getAlter())) {
                System.out.println(schildi2.getName() + " Ihr Tank ist leer, wollen Sie für 4 oder 9 Energiepunkte tanken?");
                schildi2.tanken(input.nextInt());
            }
            schildi1.krieche();
            schildi2.krieche();
            System.out.println(zeigeRennstrecke(streckenlaenge));
            System.out.println("1. " + zeigeStreckeSchildi("-", schildi1.getStrecke()));
            System.out.println("2. " + zeigeStreckeSchildi("-", schildi2.getStrecke()));
        } while (schildi1.getStrecke() < streckenlaenge && schildi2.getStrecke() < streckenlaenge);

        System.out.println("*".repeat(30));

        if (schildi1.getStrecke() >= streckenlaenge && schildi2.getStrecke() >= streckenlaenge) {
            if (schildi1.getStrecke() >= schildi2.getStrecke()) {
                System.out.println(schildi1.getName() + " hat gewonnen!");
            } else {
                System.out.println(schildi2.getName() + " hat gewonnen!");
            }
        } else if (schildi1.getStrecke() >= streckenlaenge) {
            System.out.println(schildi1.getName() + " hat gewonnen!");
        } else {
            System.out.println(schildi2.getName() + " hat gewonnen!");
        }

        System.out.println("*".repeat(30));

        System.out.println(schildi1.toString());

        System.out.println("*".repeat(30));

        System.out.println(schildi2.toString());

        System.out.println("*".repeat(30));
    }

    public static String zeigeRennstrecke(int rennstrecke) {
        return "   " + "=".repeat(rennstrecke);
    }

    public static String zeigeStreckeSchildi(String zeichen, int zuruckgelegteStrecke) {
        return zeichen.repeat(zuruckgelegteStrecke) + "x";
    }
}
