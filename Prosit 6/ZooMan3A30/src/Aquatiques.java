public abstract class Aquatiques extends Animal {
    String habitat;
    public Aquatiques(){

    }
    public Aquatiques(int age,String name,String family,
                      String habitat){
        super(name,family,age);
        this.habitat=habitat;
    }

    @Override
    public String toString(){
       return super.toString()+"\n" +"Habitat :"+habitat;
    }
    public abstract void swim();
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(obj instanceof Aquatiques){
            return this.habitat== ((Aquatiques)obj).habitat
                    && this.name== ((Aquatiques)obj).name
                    && this.age == ((Aquatiques)obj).age;
        }
       return false;
    }
}
