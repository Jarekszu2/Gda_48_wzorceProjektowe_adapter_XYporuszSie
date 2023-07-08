package packStrategy_PostacXY;

import packStrategy_PostacXY.styl_ruchu.StylRuchuPoruszajSiePoSkosie;
import packStrategy_PostacXY.styl_ruchu.StylRuchuPoruszajSieWDol;
import packStrategy_PostacXY.styl_ruchu.StylRuchuPoruszajSieWPrawo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Postac postac = new Postac();
        Scanner scanner = new Scanner(System.in);

        boolean isWorking = true;
        while (isWorking) {
            String komenda = scanner.nextLine();

            if (komenda.equalsIgnoreCase("podmien")) {
                komenda = scanner.nextLine();

                if (komenda.equalsIgnoreCase("dol")) {
                    postac.setStyl(new StylRuchuPoruszajSieWDol());
                } else if (komenda.equalsIgnoreCase("prawo")) {
                    postac.setStyl((new StylRuchuPoruszajSieWPrawo()));
                } else if (komenda.equalsIgnoreCase("skos")) {
                    postac.setStyl(new StylRuchuPoruszajSiePoSkosie());
                }
            } else if (komenda.equalsIgnoreCase("quit")) {
                break;
            } else {
                postac.porusz();
            }
        }
    }
}
