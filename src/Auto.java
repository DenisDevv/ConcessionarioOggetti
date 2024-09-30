import java.util.ArrayList;

public class Auto {
    static ArrayList<String> macchine = new ArrayList<>();
    public Auto(String m, String mod, double p) {
        macchine.add(m + ", " + mod + ", " + p + "€");
    }
    public static String getAuto() {
        StringBuilder auto = new StringBuilder();
        for (String s : macchine.toArray(new String[macchine.size()])) {
            auto.append(s).append("\n");
        }
        return auto.toString();
    }
}
