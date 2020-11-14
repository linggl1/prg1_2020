package ch.teko.prg.tag01.work;

public class PKW {
    //Attribute
    private String marke;
    private String modell;
    private int ps;

    //Konstruktoren
    public PKW(String marke, String modell, int ps){
        this.marke = marke;
        this.modell = modell;
        this.ps = ps;
    }

    //Methoden
    public String getMarke() {return marke; }

    public void setMarke(String marke) {this.marke = marke}

    public String getModell() {return modell; }

    public void setMarke(String modell) {this.modell = modell}

    public int getPs() {return ps; }

    public void setPs(int ps) {this.ps = ps; }
}
