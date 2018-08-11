package strings;

import java.util.List;

public class Application {


    /*
        W tej metodzie (main) będziemy jedynie wywoływać (testować) inne metody, które napiszemy poniżej.
        Przykładowe wywołanie metody doNothing znajdziesz poniżej
     */
    public static void main(String[] args) {
        doNothing();
    }


    public static void doNothing() {

    }

    /*
        Napisz kod, który wyświetli wszystkie napisy z listy
     */

    public static void printAllStrings(List<String> strings) {

    }

    public static void printAllStringsUppercaseJoinedWithCommas(List<String> strings) {

    }

    /*
        Napisz kod, który wydrukuje wszystkie imiona z listy.
     */

    public static void printAllNames() {
        List<String> names = StringCollections.names();

    }

    /*
        Pobierz listę wszystkich imion.
        Wyświetl wszystkie imiona bez powtórzeń.
     */
    public static void printAllUniqueNames() {

    }

    /*
        Pobierz listę wszystkich imion.
        Wyświetl te, które są dłuższe niż podana jako argument długość.
     */
    public static void printAllLongerThan(int length) {

    }



}
