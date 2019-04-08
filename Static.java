import java.util.Scanner;

public class Static{
    public int instanceVar;
    public static int staticVar;

    public static void main(String args[]){
        System.out.println("MyClass.staticVar = "+ Static.staticVar);

        Static a1 = new Static();
        Static a2 = new Static();

        a1.instanceVar = 1; a1.staticVar = 100;
        a2.instanceVar = 2; a2.staticVar = 200;

        System.out.println("a1.instanceVar = " + a1.instanceVar);
        System.out.println("a2.instanceVar = " + a2.instanceVar);
        System.out.println("a1.staticVar = " + a1.staticVar);
        System.out.println("a2.staticVar = " + a2.staticVar);

        a1.instanceVar ++ ;
        a1.staticVar ++ ;
        
        System.out.println("a1.instanceVar = " + a1.instanceVar);
        System.out.println("a2.instanceVar = " + a2.instanceVar);
        System.out.println("a1.staticVar = " + a1.staticVar);
        System.out.println("a2.staticVar = " + a2.staticVar);

    }
}