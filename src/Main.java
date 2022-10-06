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
        float[] laikas = new float[7];
        laikas[0] = 4;
        laikas[1] = 4;
        laikas[2] = 4;
        laikas[3] = 4;
        laikas[4] = 4;
        laikas[5] = 5;
        laikas[6] = 3;

        System.out.println("Masyvo dydis - " + dienos.length);
        System.out.println("Paskutinis masyvo elementas - " + dienos[dienos.length - 1]);
        System.out.println("Iveskite skaiciu nuo 1 iki 7.");
        int input = sc.nextInt();
        if (input > 7) {
            System.out.println("Skaicius per didelis");
        } else {
            System.out.println(" Pasirinkta diena - " + dienos[input - 1] + ". Sugaista laiko -" + laikas[input -1]);
        }


        System.out.println("=======================================================================================================");

        System.out.println("Laiko masyvas");
        System.out.println("Masyvo ilgis - " + laikas.length);
        System.out.println("Pirmas elementas - " + laikas[0]);
        System.out.println("Paskutinis elementas - " + laikas[laikas.length - 1]);
        for(int i = 0; i < laikas.length; i++)
            System.out.println(i + 1 + ". " + laikas[i]);

        mainasDu skaiciuojam = new mainasDu();

        System.out.println("IVESKITE DU SKAICIUS IR MES JUOS");
        System.out.println("| SUDESIME | | ATIMSIME | | PADALINSIME | | PADAUGINSIME | | GAUSIME DALYBOS LIEKANA | |");

        skaiciuojam.darbas();
    }
}