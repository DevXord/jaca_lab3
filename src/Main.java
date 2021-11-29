
public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student st1 = new Student();
        st1.name = "Jan";
        st1.surname = "Kowal";
        st1.age = 23;
        st1.isActive = true;

        Student st2 = new Student();
        st2.name = "Edmund";
        st2.surname = "Nitka";
        st2.age = 53;
        st2.isActive = true;

        Student st3 = new Student();
        st3.name = "Adam";
        st3.surname = "Testowy";
        st3.age =13;
        st3.isActive = false;

        Student[] stutentTables = {st1, st2,st3};

        for (Student item : stutentTables) {

            System.out.println("\n"+item.toString());

        }
    }
}
