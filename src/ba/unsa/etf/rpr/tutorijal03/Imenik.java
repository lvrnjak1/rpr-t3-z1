package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;

public class Imenik {
    private Map<String, TelefonskiBroj> imenik = new HashMap<String, TelefonskiBroj>();

    public void  dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime,broj);
    }

    public String dajBroj(String ime){
        return imenik.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String,TelefonskiBroj>  par : imenik.entrySet()){
            if(par.getValue().equals(broj)) return par.getKey();
        }
        return null;
    }

    public String naSlovo(char s){
        String tabela = "";
        int i = 1;
        for(String imena: imenik.keySet()){
            if(imena.charAt(0) == s) tabela += i + ". " + imena + " - " + imenik.get(imena).ispisi() + "\n";
        }
        return tabela;
    }

    public Set<String> izGrada(FiksniBroj.Grad g){
        Set<String> skupImenaUGradu = new HashSet<String>();
        for(Map.Entry<String,TelefonskiBroj>  par : imenik.entrySet()){
            if(par.getValue() instanceof FiksniBroj){
                FiksniBroj zaPoredjenje = ((FiksniBroj)par.getValue());
                if(zaPoredjenje.getGrad().equals(g))
                    skupImenaUGradu.add(par.getKey());
            }
        }
        return  skupImenaUGradu;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> skupBrojevaUGradu = new TreeSet<TelefonskiBroj>();
        for(Map.Entry<String,TelefonskiBroj>  par : imenik.entrySet()){
            if(par.getValue() instanceof FiksniBroj){
                FiksniBroj zaPoredjenje = ((FiksniBroj)par.getValue());
                if(zaPoredjenje.getGrad().equals(g))
                    skupBrojevaUGradu.add(par.getValue());
            }
        }
        return skupBrojevaUGradu;
    }

}
