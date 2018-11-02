package ba.unsa.etf.rpr.tutorijal03;

public class FiksniBroj {



    public enum Grad{
        BUGOJNO("030"), BREZA("032"), SARAJEVO("033"), TUZLA("035"), MOSTAR("036"), BIHAC("037"), GORAŽDE("038"),
        ZENICA("032"), TRAVNIK("030"), ORASJE("031"), LIVNO("034"), SIROKI_BRIJEG("039"), BRCKO("049");

        private final String pozivniBroj;

        Grad(String pozivniBroj) {
            this.pozivniBroj = pozivniBroj;
        }

        public String getPozivniBroj() {
            return pozivniBroj;
        }
    }

    private Grad grad;
    private String broj;

    FiksniBroj(Grad grad, String broj){
        setGrad(grad);
        setBroj(grad.getPozivniBroj() + "/" + broj);
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }
    
}
