import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employer,Departement> affectation; //=newHashMap<>();

    public AffectationHashMap()
    {
        affectation=new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employer e, Departement d)
    {
        affectation.put(e,d);
        //affectation.putIfAbsent(e,d);
    }
    public void afficherEmployesEtDepartements()
    {
        //avec KeySet
        /*for(Employe e: affectation.keySet())
            System.out.println(e+"++"+affectation.get(e));
        */
        // avec EntrySet
        /*
        for(Map.Entry<Employe,Departement> en:affectation.entrySet())
            System.out.println(en.getKey()+"  "+en.getValue());
         */
        //avec Foreach
        affectation.forEach((k,v)->System.out.println(k+"***"+v));

    }

    public void supprimerEmploye (Employer e)
    {
        affectation.remove(e);
    }

    public void supprimerEmployeEtDepartement (Employer e, Departement d)
    {
        affectation.remove(e,d);
    }
    public void afficherEmployes()
    {
        //avec forEeach
        affectation.keySet().forEach(e->System.out.println(e));
    }
    public void  afficherDepartements()
    {
        //avec forEeach
        affectation.keySet().forEach(d->System.out.println(d));
    }
    public boolean rechercherEmploye (Employer e)
    {
        return affectation.containsKey(e);
    }
    public boolean rechercherDepartement (Departement d)
    {
        return affectation.containsKey(d);
    }
    public TreeMap<Employer, Departement> trierMap()
    {
        TreeMap<Employer, Departement> tree = new TreeMap<>(Comparator.comparing(Employer::getId));
        return tree;
    }

}
