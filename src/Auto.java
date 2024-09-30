public class Auto {
    private String marca;
    private String modello;
    private double prezzo;
    public Auto(String m, String mod, double p) {
        ifPrezzo(p);
        marca = m;
        modello = mod;
        prezzo = p;
    }
    public Auto(String m, String mod) {
        marca = m;
        modello = mod;
    }
    public Auto(String m, double p) {
        ifPrezzo(p);
        marca = m;
        prezzo = p;
    }
    public Auto(String m) {
        marca = m;
    }
    public Auto(double p) {
        ifPrezzo(p);
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
        ifPrezzo(p);
        prezzo = p;
    }
    public String getAuto() {
        return marca + ", " + modello + ", " + prezzo + "€";
    }
    public String getMarca() {
        return marca;
    }
    public String getModello() {
        return modello;
    }
    public double getPrezzo() {
        return prezzo;
    }
    private void ifPrezzo (double p) {
        if (p < 0)
            throw new IllegalArgumentException("Prezzo non valido, il prezzo deve essere maggiore o uguale a 0");
    }
}
