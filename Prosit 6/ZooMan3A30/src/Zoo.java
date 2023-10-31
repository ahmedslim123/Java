public class Zoo {
    Animal[] animals;
    //attribut d'instance
    String name,city;
    final int nbCages=50;
    int nbAnimals;
//attribut de classe
   static int nbAnimalsTotal;
   Aquatiques[] aquaticAnimals;
   int nbAnimalsAqua;

    public Zoo(String name,String city,int nbCages){
        animals = new Animal[nbCages];
        aquaticAnimals = new Aquatiques[10];
        this.name=name;
        this.city=city;

    }
    public void displayZoo(){
        System.out.println("Name : "+name);
        System.out.println("city : "+city);
        System.out.println("NbCages : "+nbCages);

    }
    @Override
    public String toString() {
        String s ="Name : "+name+"\n"+"City : "+city+"\n"+"NbCages : "+nbCages+"\n";
        String r ="";
        for(int i=0;i<nbAnimals;i++){
            r+= animals[i];
        }
        return s+r;
    }
    public boolean addAnimal(Animal animal){
        if(searchAnimal(animal)==-1 && nbAnimals<nbCages){
            animals[nbAnimals] = animal;
            nbAnimals++;
            nbAnimalsTotal++;
            return true;
        }
        return false;
    }

    int searchAnimal(Animal animal){
        for(int i=0;i<nbAnimals;i++)
        {
            if(animals[i].name==animal.name){
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal an){
        int index = this.searchAnimal(an);
        for(int i=index;i<nbAnimals;i++){
            animals[i]=animals[i+1];
        }
        animals[nbAnimals]=null;
        nbAnimals--;
        return true;
    }
    boolean isZooFull(){
        return nbAnimals==nbCages;
    }
    static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbAnimals>z2.nbAnimals){
            return z1;
        }else{
            return z2;
        }

    }

    Zoo comparerZoo(Zoo z1){
        if(this.nbAnimals>z1.nbAnimals){
            return this;
        }
        return z1;

    }
    public void addAquaticAnimal(Aquatiques aquatic){
        if(nbAnimalsAqua<=10){
            aquaticAnimals[nbAnimalsAqua]=aquatic;
            nbAnimalsAqua++;
        }
    }
    public float maxPenguinSwimmingDepth(){
        float maxDepth=0;
        for(int i=0;i<nbAnimalsAqua;i++){
          //if(aquaticAnimals[i].getClass() ==  Penguin.class)
            if(aquaticAnimals[i] instanceof   Penguin){
                if(maxDepth< ((Penguin)aquaticAnimals[i]).swimmingDepth){
                    maxDepth= ((Penguin)aquaticAnimals[i]).swimmingDepth;
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType(){
        int nbDol=0;
        int nbPen = 0;
        for(int i=0;i<nbAnimalsAqua;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                nbPen++;
            }
            if(aquaticAnimals[i] instanceof Dolphin){
                nbDol++;
            }
        }
        System.out.println("Le Zoo "+name+" Contient "+nbDol+
                "Dolphin "+nbPen+"Penguin");
    }

}
