import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.Comparator;
import java.util.stream.Stream;

public class EtudiantManagement implements Management {

    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con)
    {
        for (Etudiant e:students)
        {
            con.accept(e);
        }
    }
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for (Etudiant e:students)
        {
            if (pre.test(e))
            {
                con.accept(e);
            }
        }
    }
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        String names = "";
        for (Etudiant e:students)
        {
            names += (fun.apply(e) + "\n");
        }
        return names;
    }
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        students.sort(com);
        return students;
    }
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return students.stream();
    }
}
