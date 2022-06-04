public class MuajtEVitit {
    public static void main(String[] args) {
        byte numriIMuajitTeVitit = 6;

        if (numriIMuajitTeVitit > 0 && numriIMuajitTeVitit <= 6) {
            System.out.print("Periudha e pare e vitit");
        } else if (numriIMuajitTeVitit >= 6 && numriIMuajitTeVitit < 12) {
            System.out.print("Periudha e dyte e vitit");
        } else {
            System.out.print("Vlera e dhene gabim");
        }
    }
}
