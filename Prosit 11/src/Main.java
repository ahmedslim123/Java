
public class Main {
    public static void main(String[] args) {
        Employer e1 = new Employer(2,"Foulen","hihdi","info",3);
        Employer e2 = new Employer(1,"dhjk","ffff","math",5);
        Employer e3 = new Employer(3,"bbbbb","aaaaa","lol",4);

        SocieteArrayList societe= new  SocieteArrayList();

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println(societe.rechercherEmploye(e1));
        societe.trierEmployeParId();
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        Departement d1 = new Departement(1,"info",5);
        Departement d2 = new Departement(2,"math",3);
        Departement d3= new Departement(3,"lol",4);

        DepartementHashSet deps = new DepartementHashSet();
        deps.ajouterDepartement(d1);
        deps.ajouterDepartement(d2);
        deps.ajouterDepartement(d3);

        deps.trierDepartementById().forEach(System.out::println);
        deps.displayDepartement();

        AffectationHashMap aff = new AffectationHashMap();
        aff.ajouterEmployeDepartement(e1,d1);
        aff.ajouterEmployeDepartement(e2,d2);
        aff.ajouterEmployeDepartement(e3,d3);
        aff.afficherEmployesEtDepartements();


    }
}