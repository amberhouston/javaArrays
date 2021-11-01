
    import java.util.ArrayList;


// # 1 Write a program to sum all the values of a given Array in Java.

public class arrays2 {

    public static void main(String[] args){
        double [] arr = new double [] {1,5,6,5,4,1};  
        double sum = 0;  
         
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  

   
  

        
// #2 What is the output?

// double[ ] exampleArray = {1,5,6,5,4,1};

//           double maximum = examplesArray[0];

//           int index = 0;

//           for (int i = 1; i<exampleArray.length>; i++){

//                if (exampleArray[ i ] > maximum) {

//                     maximum = exampleArray[ i ];

//                     index = i;

//                }

//           }

//           System.out.println(index);

// This outputs: Errors since the second line says examplesArray, not exampleArray.
// Also there is an error on the 4th line and '>' needs the be removed after 'length'
// otherwise the answer would be 2.



/* # 3 Write a public static method called "toPower" that takes in as parameters 
two integers called size and power. The method should return an array of size "size" 
with each array index raised to the value of "power." So, for example, if we passed 
in "size = 4" and "power = 2" to the "toPower," the method should return the 
following result: [0,1,4,9]. */

    public static void toPower(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        //Sorry I don't understand how to do this assignment


    }

}
// public class arrays {
//     public static void main (String[] args){
       
//         ArrayList<Integer> numbers = new ArrayList<Integer>();

//         numbers.add(3);
//         numbers.add(7);
//         numbers.add(2);
        
//         for (int a : numbers){
//             System.out.println(a);
//         }

//         for(int i = 0; i < numbers.length; i++){
//             System.out.println(numbers.get(i));;
//         }
       
        
//     }
// }

