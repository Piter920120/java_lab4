public class Main {

    public static void metoda1(String narzad, String organ)
    {

    }
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól,
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
        d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
        metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
        */
        Dom dom1 = new Dom();
        dom1.setValue(12);
        dom1.setKolor(Budynek.KolorEnum.ZOLTY);
        dom1.setCena(335000);
        dom1.setMiejscowosc("Iława");
        dom1.setKodPocztowy("14-200");
        dom1.setNrDomu(3);
        dom1.setNrLokalu("4");
        dom1.setPowBudynku(600);
        dom1.setPowierzchnia(60);
        dom1.setPowParkingu(50);
        dom1.setPowPodworka(0);
        dom1.setUlica("Odnowiciela");
        dom1.setImie("Piotr");
        dom1.setNazwisko("Nazwisko");
        System.out.println(dom1.toString());

        Budynek dom2 = new Dom();
        dom2.liczbaOkien(9);
        dom2.liczbaMieszkancow(3);
        dom2.kolorDomu(Budynek.KolorEnum.BIALY);
        dom2.adresBudynku("Iława","Niepodleglosci", 4, "24", "14-200");
        dom2.powierzchnia(5000,0,40);
        dom2.wlasciciel("Adam","Rynkowski");
        System.out.println(dom2.toString());



    }
}
