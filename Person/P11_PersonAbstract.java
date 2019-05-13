public abstract class P11_PersonAbstract{
  private String name;
  public P11_PersonAbstract(){
    name = "No name yet";
  }
  public P11_PersonAbstract(String newName){
    name = newName;
  }
  public String getName(){
    return name;
  }
  public abstract void writeOutput();
}
