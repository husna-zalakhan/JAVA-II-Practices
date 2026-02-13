
public class App{

    

    public static void sayHello(String name_Std, String name_Std2){//descriptive name
        System.out.println("Hello, " + name_Std +  "!");
        System.out.println("Hello, " + name_Std2 +  "!");
    }
   
//Create a method ------> to get average
public static int getAvrg(int num1, int num2){
    int avrg = (num1+ num2)/2;
    
    return avrg; //we are returning the value
}

/* block comment
it is placed between slashes and asterisks */

 /* Given a number n, write a method that 
 sums all the multiples of three and five up to n.
 */

public static int sumMul3_5(int num){
    int sum = 0; /*varible called sum and set it to 0
    This will store the total of multiples of 3 and 5.*/

    for (int i = 0 ; //start from 0
        i < num; //keep looping while i is less than num
        i++){ 
    if (i % 3 ==0 || i % 5 ==0){
        //sum += num;
        sum += i; //Add the current value of i to sum.
    }
}
    return sum; //This sends the final total back to whoever called the method.

}
 public static void main(String[] args) {
    // we do print inside the main function 
    // instead we are doing the return inside the function itself.   
    sayHello("Husna", "Nazly");
    int average= getAvrg(10, 20);
    System.out.println("The average is: " + average);
    
    sumMul3_5(23); //calling the function, passing num 23
    System.out.println(sumMul3_5(23));

    int summation = sumMul3_5(1000); //return the sum //storing the returned value.

    System.out.println("The sum of multiples of 3 and 5 is: " + summation);
}



}