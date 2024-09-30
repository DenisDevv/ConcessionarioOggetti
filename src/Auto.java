public class Auto {
    private String marca;
    private String modello;
    private double prezzo;
    public Auto(String m, String mod, double p) {
        marca = m;
        modello = mod;
        prezzo = p;
    }
    public Auto(String m, String mod) {
        marca = m;
        modello = mod;
    }
    public Auto(String m, double p) {
        marca = m;
        prezzo = p;
    }
    public Auto(String m) {
        marca = m;
    }
    public Auto(double p, String mod) {
        prezzo = p;
        modello = mod;
    }
    public Auto(double p) {
        prezzo = p;
    }
    public Auto() {
    }
    public void setMarca(String m) {
        marca = m;
    }
    public void setModello(String mod) {
        modello = mod;
    }
    public void setPrezzo(double p) {
        prezzo = p;
    }
    public String getAuto() {
        return marca + ", " + modello + ", " + prezzo + "€";
    }
}
