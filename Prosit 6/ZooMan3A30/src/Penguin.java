public class Penguin extends Aquatiques {
    float swimmingDepth;
    public Penguin(){}
    public Penguin(int age, String name, String family,
                   String habitat, float swimmingDepth) {
        super(age, name, family, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString()+"\n"+"swimmingDepth :"+swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This Penguin is swimming.");
    }

}
