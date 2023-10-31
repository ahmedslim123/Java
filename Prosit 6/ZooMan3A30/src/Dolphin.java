public class Dolphin extends Aquatiques{
    float swimmingSpeed;

    public Dolphin(){}
    public Dolphin(int age, String name, String family,
                   String habitat, float swimmingSpeed) {
        super(age, name, family, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
      return super.toString()+"\n"+"swimmingSpeed :"+swimmingSpeed;
    }
    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
