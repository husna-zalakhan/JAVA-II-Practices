
public class App{

    

    public static void sayHello(String name_Std, String name_Std2){//descriptive name
        System.out.println("Hello, " + name_Std +  "!");
        System.out.println("Hello, " + name_Std2 +  "!");
    }
   
//Create a ,ethod  ------> to get average
public static void getAvrg(int num1, int num2){
    int avrg = (num1+ num2)/2;
    System.out.println("The average is: " + avrg);

}
 public static void main(String[] args) {
    sayHello("Husna", "Nazly");
    getAvrg(10, 20);

}



}