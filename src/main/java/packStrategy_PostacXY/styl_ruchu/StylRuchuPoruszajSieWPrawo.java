package packStrategy_PostacXY.styl_ruchu;

public class StylRuchuPoruszajSieWPrawo extends IStylRuchu {
    public void poruszSie() {
        postac.setX(postac.getX() + 1);
    }
}
