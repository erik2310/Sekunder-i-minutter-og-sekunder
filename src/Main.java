import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //Laver int variabler
        int antalSekunder;
        int minutterRes;
        int sekunderRes;

        //Laver en scanner med navn input
        Scanner input = new Scanner(System.in);

        //Printer en besked
        System.out.println("Indtast antal sekunder:");

        //Gemmer bruger input i antalSekunder
        antalSekunder = input.nextInt();

        //Udregner minutter og sekunder, gemmer dem i variabler
        minutterRes = antalSekunder / 60;
        sekunderRes = antalSekunder % 60;

        //Printer en besked med minutter og sekunder
        System.out.println(antalSekunder + " SEKUNDER SVARER TIL " + minutterRes + " MINUTTER OG " + sekunderRes + " SEKUNDER.");
    }
}
