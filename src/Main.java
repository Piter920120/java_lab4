import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */


        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

        int[] tab1 = {1, 2, 3, 4, 5, 6};

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj numer indeksu tablicy, ktory mam ci wyswietlic: ");
        int liczba = scan.nextInt();

        if (liczba > 5 || liczba < 0)
        {
            try {
                System.out.println(tab1[liczba]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Blad! Podales index: " + liczba + ", a dozwolone sa od 0 do " + (tab1.length - 1));
            }
        }

        try {
            liczba = Integer.parseInt(scan.next());
        } catch (NumberFormatException e) {
            System.out.println("Blad, wprowadzony znak nie jest cyfra!");
            throw e;
        }

        finally {
            System.out.println("KONIEC PROGRAMU");
        }
    }
}
