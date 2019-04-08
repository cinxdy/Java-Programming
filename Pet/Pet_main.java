public class Pet_main{
    public static void main(String[] args){
        Pet p1 = new Pet("cat",5,2.2);
        Pet p2 = new Pet("dog",10,12.6);

        p1.writeOutput();
        p2.writeOutput();
    }
}