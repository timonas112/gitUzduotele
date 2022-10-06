import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        Float rez;
        a++;
        b--;
        rez = a * b * (float) 5;
        System.out.println(rez);


        String[] dienos = {"Pirmadienis", "Antradienis", "Treciadienis", "Ketvirtadienis", "Penktadienis", "Sestadienis", "Sekmadienis" };
        System.out.println("Masyvo dydis - " + dienos.length);
        System.out.println("Paskutinis masyvo elementas - " + dienos[dienos.length - 1]);
        System.out.println("Iveskite skaiciu nuo 1 iki 7.");
        int input = sc.nextInt();
        if (input > 7) {
            System.out.println("Skaicius per didelis");
        } else {
            System.out.println(" Pasirinkta diena - " + dienos[input - 1]);
        }

    }
}