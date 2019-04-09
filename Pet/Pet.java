public class Pet{
    private String name;
    private int age;
    private double weight;

    public Pet(String initialName, int initialAge, double initialWeight){
        name = initialName;
        if((initialAge < 0)|| (initialWeight < 0)){
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        else{
            age = initialAge;
            weight = initialWeight;
        }
    }

    public String getName() {return name;}
    public int getAge() { return age;}
    public double getWeight() {return weight;}
    public void writeOutput() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age+" years");
        System.out.println("Weight: "+weight+" pounds");
    }
    
}