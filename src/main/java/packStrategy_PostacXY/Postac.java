package packStrategy_PostacXY;

import lombok.Data;
import packStrategy_PostacXY.styl_ruchu.IStylRuchu;
@Data
public class Postac {
    private int x = 0; // zwiększenie x przesuwa Postać w prawo
    private int y = 0; // zwiększenie y przesywa Postać w dół
    private final static char POSTAC = 'X'; // zapis postaci na ekranie

    private IStylRuchu styl;

    public void setStyl(IStylRuchu styl) {
        this.styl = styl;
        this.styl.ustawPostac(this);
    }

    public void porusz() {
        styl.poruszSie();
        wypiszPozycje();
    }

    public void wypiszPozycje() {
        System.out.print("###############################");

        for (int i = 0; i < y; i++) {
            System.out.println();
        }

        for (int i = 0; i < x; i++) {
            System.out.print(" ");
        }

        System.out.println(POSTAC);
    }
}
