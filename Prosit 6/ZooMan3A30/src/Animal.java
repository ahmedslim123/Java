public class Animal  {
    String family,name;
    int age;
    boolean isMammal;
    public Animal()
    {

    }
    public Animal(String name,String family,int age){
        this.family=family;
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString(){
        return "Family : "+family+"\n"+"Name : "+"\n"+"Age :"
                +age;
    }
}
