
/* ćw 4 klasy */
        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(new Osoba("Jan","Jankowski",5521),WydzialEnum.Archeologia));
        studentList.add(new Student(new Osoba("Adam","Adamczyk",5522),WydzialEnum.Informatyka));
        studentList.add(new Student(new Osoba("Adrian","Adranczuk",5523),WydzialEnum.Zarzadzania));
        studentList.add(new Student(new Osoba("Geralt","Rivia",5524),WydzialEnum.Filozofia));
        studentList.add(new Student(new Osoba("Vincent","Valerie",5525),WydzialEnum.Biologia));
        System.out.print("\n");
        for (Student item : studentList){
            System.out.print(item.toString()+"\n");
        }

    }
}
