public class ConstructorMain {

   private static int myAge = 17; //private mean it can be acceessed only in the same class. 

    public static void printAge(){

    }

    //non-static method
    public void printName(){

    }

    public static void main(String[] args){
        Constructor_Practices s1 = new Constructor_Practices("Arash", 2345, "Computer Science");  

        Constructor_Practices s2 = new Constructor_Practices();
        Constructor_Practices s3 = new Constructor_Practices("Kabul");

       B b1 = new B ();
       b1.age= 123;
       b1.add= "Herat";

    //    B.add = "Ghazni"; 
    //    B.age= 32;
    // B.Uni_Name;
      
      System.out.println("University: " + B.Uni_Name);
      System.out.println("age: " + myAge); 
      printAge();
      //ConstructorMain.printName();      
      

    }
}
