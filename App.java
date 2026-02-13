
public class App{

    

    public static void sayHello(String name_Std, String name_Std2){//descriptive name
        System.out.println("Hello, " + name_Std +  "!");
        System.out.println("Hello, " + name_Std2 +  "!");
    }
   
//Create a method ------> to get average
public static int getAvrg(int num1, int num2){
    int avrg = (num1+ num2)/2;
    
    return avrg;
}
 public static void main(String[] args) {
    // we do print inside the main function 
    // instead we are doing the return inside the function itself.   
    sayHello("Husna", "Nazly");
    int average= getAvrg(10, 20);
    System.out.println("The average is: " + average);

}




}