package packStrategy_PostacXY.styl_ruchu;

import packStrategy_PostacXY.Postac;

public abstract class IStylRuchu {
    protected Postac postac;

    public void ustawPostac(Postac postac) {
        this.postac = postac;
    }

    public abstract void poruszSie();
}
