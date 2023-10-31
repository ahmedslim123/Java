 public sealed class Etudiant permits Etudiant3eme, Alternance {
    int id;
    String nom,prenom;
    float moyenne;

     public Etudiant() {
     }
     public Etudiant(int id,String nom, String prenom, float moyenne){
         this.id=id;
         this.nom=nom;
         this.prenom=prenom;
         this.moyenne=moyenne;
     }
 }
