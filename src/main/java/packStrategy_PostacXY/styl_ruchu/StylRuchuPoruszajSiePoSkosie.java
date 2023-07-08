package packStrategy_PostacXY.styl_ruchu;

public class StylRuchuPoruszajSiePoSkosie extends IStylRuchu {
    public void poruszSie() {
        postac.setY(postac.getY() + 1);
        postac.setX(postac.getX() + 1);
    }
}
