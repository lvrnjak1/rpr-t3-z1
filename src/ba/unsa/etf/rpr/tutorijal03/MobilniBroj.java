package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj){
        setMobilnaMreza(mobilnaMreza);
        setBroj(broj);
    }

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public void setMobilnaMreza(int mobilnaMreza) {
        this.mobilnaMreza = mobilnaMreza;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }


    @Override
    public String ispisi() {
        return  "0" + mobilnaMreza + broj;
    }

    @Override
    public int compareTo(TelefonskiBroj telefonskiBroj) {
        return 0;
    }
}
