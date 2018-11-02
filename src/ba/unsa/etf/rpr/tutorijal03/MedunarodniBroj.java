package ba.unsa.etf.rpr.tutorijal03;

import com.sun.java.swing.plaf.motif.MotifEditorPaneUI;

public class MedunarodniBroj extends TelefonskiBroj {
    private String drzava;
    private  String broj;

    public MedunarodniBroj(String drzava, String broj){
        setDrzava(drzava);
        setBroj(broj);
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        return drzava+broj;
    }
}
