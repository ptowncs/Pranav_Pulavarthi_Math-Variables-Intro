class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!






    //ANSWER: 
    // System.out.print keeps cursor on the same line, System.out.println moves cursor to beginning of next line


    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): 
    //double:
    //boolean:

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES
    int num = 8;
    String word = "word";
    boolean tired = true;




    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?
    int calc_num = ((4+5)/2)%4 ;
    System.out.print(calc_num);
    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both
    for(int i = 0; i <= 100; i++){
      System.out.println(i);
    }


    //All multiples of 3 from 1 to 100
    for(int i = 0; i <= 100; i+=3){
      System.out.print(i);
    }


    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
  }
}
