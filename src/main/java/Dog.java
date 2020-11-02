public class Dog extends Pet {

    // Instance variable(s)
    private String breed;
    // Constructors
    public Dog(String name,int age,String breed){
        super (name,age);
        this.breed = breed;
    }

    public Dog(){
        super("Jerry",16);
        this.breed = "Teddy";
    }
    // makeNoise() method
    public void makeNoise(){
        System.out.print("Bark Bark Bark....");
    }

    // toString method
    public String toString(){
        return "\nname:" + this.getName() + "\nage"+ this.getAge() + "\nbreed:" + this.breed;
    }

    // Getter
    public String getName() {
        return this.getName();
    }

    public int getAge() {
        return this.getAge();
    }
    public String getBreed(){
        return this.breed;
    }
    // Setter
    public void setBreed(String breed){
        if (this.breed.trim().length() != 0){
            this.breed = breed;
        }
    }
}