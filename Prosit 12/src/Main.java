import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.Comparator;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(2,"Foulen",3);
        Etudiant e2 = new Etudiant(1,"dhjk",5);
        Etudiant e3 = new Etudiant(3,"bbbbb",34);
        List<Etudiant> myList = new ArrayList<>();
        myList.add(e1);
        myList.add(e2);
        myList.add(e3);
        EtudiantManagement Em = new EtudiantManagement();
        Consumer<Etudiant> con = e -> System.out.println(e);
        Em.displayStudents(myList,con);
        System.out.println("------------------------------");
        Em.displayStudents(myList,System.out::println);

        Predicate<Etudiant> pre = e -> e.getAge()>20;
        System.out.println("------------------------------");
        Em.displayStudentsByFilter(myList,pre,con);



    }
}