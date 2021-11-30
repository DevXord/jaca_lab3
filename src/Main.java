import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        List<Person> personList = new ArrayList<>();


        Person person = new Person("Adam","Nowak",500);
        System.out.println("\n"+person.toString());
        System.out.println("My money: " + person.getMoney() + "\n");

        Manager manager = new Manager("Adrian","Nitka",2000,true);
        System.out.println(manager.toString());
        System.out.println("My money: " + manager.getMoney() + "\n"+ (manager.getManager() ? "I am the Manager\n": ""));

        Prezes prezes = new Prezes("Tomasz","Anders",25_000_000,false,true);
        System.out.println(prezes.toString());
        System.out.println("My money: " + prezes.getMoney() + "\n"+ (prezes.getManager() ? "I am the Manager\n": (prezes.getPrezes() ? "I am the Prezes\n": "")));

        personList.add(person);
        personList.add(manager);
        personList.add(prezes);
        System.out.println(personList);
    }
}
