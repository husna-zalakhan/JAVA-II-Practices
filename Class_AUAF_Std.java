public class Class_AUAF_Std {
    
    //it is called instance field or class field: this belongs to class  
    //instaces variable of the class, it comes with different data structure
    // we use this kind of value when we want to instantiate an object out of this class.    
    private String name; //instance variable
    int stdId;
    String Concentration;
    String Address;
    int YearOfStudy;

    /*
    how we can access instance variables when they are private?
    we use Get and Set method
    for each variable we have 1 get and 1 set method
    Get: i am calling the value assign for this variable
    Set: i am gonna set the value 
    */
    public void setName(String name){ //argument class
        this.name= name; //this name belong to argment class. 
    }   //this.name belong to instance variable
        // in set method, we don't expect anything to return

    public String getName(){
        return name;

    }

    public void display() { 
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + stdId );
        System.out.println("Concentration: " + Concentration );
        System.out.println("Address: " + Address);
        System.out.println("Year of Study: " + YearOfStudy);


    }
    public static void main (String[] args) {
    Class_AUAF_Std sdt1 = new Class_AUAF_Std(); //copying every instance variable and every methods in the class. 
    sdt1.name = "Ahmad Ali";    
    sdt1.display();

    Class_AUAF_Std sdt2 = new Class_AUAF_Std();
    sdt2.name = "Mursal Safi";    
    sdt2.display();
 }

}
