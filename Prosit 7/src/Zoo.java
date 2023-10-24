public class Zoo {

    static int NUMBER_OF_CAGES = 25;
    Animal[] animals;
    Aquatic[] aquaticAnimals;
    String name, city;
    int nbrAnimals;
    int nbrAquatic=10;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        aquaticAnimals = new Aquatic[nbrAquatic];
        this.name = name;
        this.city = city;
    }

    static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public void addAquaticAnimal(Aquatic aquatic)
    {
        if (nbrAquatic < aquaticAnimals.length)
        {
            aquaticAnimals[nbrAquatic] = aquatic;
            nbrAquatic++;  // Incrémenter le nombre d'animaux aquatiques dans le tableau
        }
        else
        {
            System.out.println("aquaticAnimals is already full.");
        }
    }
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException() {
            super("Invalid age for the animal. Age must be non-negative.");
        }
    }
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (searchAnimal(animal) == -1) {
            if (nbrAnimals < NUMBER_OF_CAGES) {
                if (animal.age >= 0) {
                    animals[nbrAnimals] = animal;
                    nbrAnimals++;
                } else {
                    throw new InvalidAgeException();
                }
            } else {
                throw new ZooFullException();
            }
        } else {
            System.out.println("The animal is already in the zoo.");
        }
    }



    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }

    boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}
