public class Terrestres extends Animal{
    int nbLegs;
    public Terrestres(){

    }
    public Terrestres(int age,String name,String family,
                      int nbLegs ){
        super(name,family,age);
        this.nbLegs=nbLegs;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+"NbLegs : "+nbLegs;
    }
}
