import java.util.Scanner;

public class mainasDu {




static void darbas(){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("-------------------------------------");
    System.out.println("IVESTI SKAICIAI - || " + a + " ||" + " || " + b + " || ");


    int sudetis = a + b;
    int atimtis = a - b;
    int dalyba  = a / b;
    int daugyba = a * b;
    int dalybosLiekana = a % b;

    System.out.println("_____________________________");
    int rezultatas1 = sudetis;
    System.out.println("SUDETIES REZULTATAS - " + rezultatas1);
    System.out.println("-_-_-_-_-_-_-");
    int rezultatas2 = atimtis;
    System.out.println("ATIMTIES REZULTATAS - " + rezultatas2);
    System.out.println("-_-_-_-_-_-_-");
    int rezultatas3 = dalyba;
    System.out.println("DALYBOS REZULTATAS - " + rezultatas3);
    System.out.println("-_-_-_-_-_-_-");
    int rezultatas4 = daugyba;
    System.out.println("DAUGYBOS REZULTATAS - " + rezultatas4);
    System.out.println("-_-_-_-_-_-_-");
    int rezultatas5 = dalybosLiekana;
    System.out.println("DALYBOS LIEKANOS REZULTATAS - " + (float) rezultatas5);
    System.out.println("_____________________________");

}

}
