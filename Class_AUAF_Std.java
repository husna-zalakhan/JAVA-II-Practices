public class Class_AUAF_Std {
    
    
    //it is called instance field or class field: this belongs to class  
    //instaces variable of the class, it comes with different data structure
    // we use this kind of value when we want to instantiate an object out of this class.    
    String name;
    int stdId;
    String Concentration;
    String Address;
    int YearOfStudy;

    public void display() { 
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + stdId );
        System.out.println("Concentration: " + Concentration );
        System.out.println("Address: " + Address);
        System.out.println("Year of Study: " + YearOfStudy);


    }
    

}
