package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj {

    public enum Grad{
        BUGOJNO("030"), ODŽAK("031"), BREZA("032"), SARAJEVO("033"), TUZLA("035"), MOSTAR("036"), BIHAĆ("037"), GORAŽDE("038"), ZENICA("032");

        private final String pozivniBroj;

        Grad(String pozivniBroj) {
            this.pozivniBroj = pozivniBroj;
        }
    }

    
    
}
