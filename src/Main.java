import java.util.Scanner;
import java.util.stream.Stream;

public class Main {




    public static void main(String[] args) {

        /* ćw 1 enum-y */

        /* zad.1
        a) Stworzyć prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi słownie,
        b) stworzyć prosty enum "StatusEnum" z wartościami KONTYNUUJEMY i KONIEC,
        c) stworzyć pętlę while z wartością true w warunku (nieskończona pętla),
        d) niech w pętli są podawane wartości liczbowe z klawiatury,
        e) jeśli użytkownik poda z klawiatury 0 to program ma kończyć działanie,
        f) umieścić w pętli switch() case: które będą wypisywały cyfry słownie odpowiednio
        do podanych cyfr przez użytkownika,
        g) gdy użytkownik wciśnie 0 ma wyświetlić się status KONIEC w innym wypadku KONTYNUUJEMY :),
        */
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.print("Wpisz liczbę od 1 do 6\n ");
            System.out.print("0 - Wyjdź\n");

            System.out.print("Co chcesz zrobić?\n>> ");
            int input = sc.nextInt();

            switch (input) {
                case 1 -> System.out.print("\n"+(LiczbyEnum.Jeden) + "\n");
                case 2 -> System.out.print("\n"+(LiczbyEnum.Dwa) + "\n");
                case 3 -> System.out.print("\n"+(LiczbyEnum.Trzy) + "\n");
                case 4 -> System.out.print("\n"+(LiczbyEnum.Cztery) + "\n");
                case 5 -> System.out.print("\n"+(LiczbyEnum.Piec) + "\n");
                case 6 -> System.out.print("\n"+(LiczbyEnum.Szesc) + "\n");
                default -> {
                    if(input != 0){ System.out.print("\nBłędna wartość\n");}
                }
            }

            if(input == 0) {
                System.out.print("\n"+StatusEnum.KONIEC +"\n\n");
                break;
            }
            else
            {
                System.out.print("\n"+StatusEnum.KONTYNUUJEMY +" :)\n\n");
            }

        }
        /* statusy i wybór ze switch case to najczęstsze użycia enumów, enumy są często używane
        * w różnego rodzaju listach, selectach jako krótkie opcje wyboru np. jako status A, X (Aktualny, Usunięty) */

    }

}

enum LiczbyEnum {
    Jeden, Dwa, Trzy, Cztery, Piec, Szesc;
}

enum StatusEnum {
    KONTYNUUJEMY, KONIEC;
}