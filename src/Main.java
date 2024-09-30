public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Fiat", "Punto");
        Auto auto2 = new Auto("Ford", "Fiesta", 12000);
        Auto auto3 = new Auto();
        Auto auto4 = new Auto("Audi", 50000);
        auto1.setPrezzo(10000);
        auto2.setModello("Focus");
        auto3.setMarca("Mercedes");
        auto3.setModello("CLS63 AMG");
        auto3.setPrezzo(100000);
        auto4.setModello("A4");
        System.out.println(auto1.getAuto());
        System.out.println(auto2.getAuto());
        System.out.println(auto3.getAuto());
        System.out.println(auto4.getAuto());
    }
}