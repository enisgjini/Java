public class Studenti {
    public static void main(String[] args) {
        String drejtimi = "Shkenca kompjuterike";

        int vitiIStudimit = 4;

        if (drejtimi == "Shkenca kompjuterike" && vitiIStudimit == 1) {
            System.out.println("Shkenca kompjuterike - Viti 1");
        } else if (drejtimi == "Shkenca kompjuterike" && vitiIStudimit == 2) {
            System.out.println("Shkenca kompjuterike - Viti 2");
        } else if (drejtimi == "Shkenca kompjuterike" && vitiIStudimit == 3) {
            System.out.println("Shkenca kompjuterike - Viti 3");
        } else {
            System.out.println("Studenti nuk i perket drejtimit te shkencave kompjuterike");
        }
    }
}
