public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("myzoo","Tunis",2);
        Zoo myZoo2 = new Zoo("myzoo2","ariana",40);
        Zoo myZoo3 = new Zoo("myzoo2","ariana",40);
        Animal lion = new Animal("Dog","mammel",4);
        Animal Chat = new Animal("Chat","mammel",5);
        Animal Chien = new Animal("Chien","mammel",5);

        //myZoo.displayZoo();
       // myZoo2.displayZoo();
        //System.out.println(lion);


       // System.out.println(myZoo.nbAnimals);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(Chien));
        System.out.println(Zoo.nbAnimalsTotal);

        System.out.println(myZoo2.addAnimal(Chat));
        System.out.println(myZoo2.addAnimal(Chien));
        System.out.println(myZoo2.addAnimal(lion));
        System.out.println(Zoo.nbAnimalsTotal);


       // System.out.println( myZoo.comparerZoo(myZoo2));
        System.out.println( Zoo.comparerZoo(myZoo,myZoo2));;


      //  System.out.println(myZoo.searchAnimal(Chat));
        System.out.println("------------------------");
        Terrestres t1 = new Terrestres();
       // Aquatiques a1 = new Aquatiques();
        Dolphin d1 = new Dolphin();
        Penguin p1 = new Penguin();
        Penguin p2 = new Penguin();
        p1.age=10;
        p1.swimmingDepth=10;
        p2.swimmingDepth=5;
        //System.out.println(t1.toString());

        System.out.println("----------------------");
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        System.out.println(myZoo.nbAnimalsAqua);
       // a1.swim();
        //d1.swim();
        //p1.swim();
        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        System.out.println("-----------------------");
        System.out.println(p2.equals(myZoo));



    }
}