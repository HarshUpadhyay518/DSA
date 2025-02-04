# DataStructureAndAlgorithm
This is the DSA series from basic to advance.
Here we see the basic java concepts and programs.
And then we will the advanced algorithms.

* ## Lecture1 : we will see the syntax and detailed about why we use public,static,class,main and void keywords.
* ## Lecture2 : // Conditionals And Loops ======================>>>>>>

_//  If-else : Syntax => if(boolean expression T or F){
// body
//                      }else{
//                           do this
//                      }

//  for - loop : Syntax => for(initialization ; condition ; increment/decrement){
//                              // body
//                         }

// while-loops : Syntax => while(condition){
//                              //body
//                         }_ 

## * Lecture 3 : Switch Statements && Nested Case
// Switch Syntax : switch(expression){
            //case one -> do something
            //case two -> do something
            //default -> do something
           }

Nested Switch Syntax : switch(expression){
                         //case one -> do something
                         //case two -> do something
                         //case three -> switch(expression){ 
                                               //case one -> do something
                                               //case two > do something
                                              //default -> do something
                                         }
}

## * Lecture 4 : Functions and Methods in java.

[//]: # In java we use methods.
* Methods : A block of code that performs a specific task.
*           It is a way to modularize your code and make it reusable.

[//]: # (Syntax : accessModifier returnType methodName (Parameter/Arguments){
                       // body
                       return value; // If the body has return type
                     } )

[//]: # (Method Overiding : Same method names but different arguments/parameters.)

[//]: # (Arrays :  
                It is used to store value of same data types.
                Initialization :  int[]arr = new int[size];
               2-D Arrays : It is used to store values in matrix form.
                  Initialization : int[][]arr = new int[row][column]
)

[//]: # (ArrayList : It is used when we have not given the size and ask to take the size as we dynamically add the values.
                Initialization :  ArrayList<Integer> list = new ArrayList<>();