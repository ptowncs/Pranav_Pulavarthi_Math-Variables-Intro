class Main {
  public static void main(String[] args) {

    // Use the // to create single line comments to either add info or to take out
    // code for debugging

    System.out.println("Hello world!");

    // We will be using System.out.println and System.out.print throughout the year.
    // Try using both below to see what the difference is!

    // ANSWER:
    // System.out.print keeps cursor on the same line, System.out.println moves the
    // cursor to beginning of next line

    // Throughout the year this year we will need to store information. For that we
    // will be using VARIABLES!

    // Java is an Object-Oriented programming language. All variables we use this
    // year will either be OBJECTS or PRIMITIVES

    // There are 8 primitives in Java: int, byte, short, long, float, double,
    // boolean, char

    // For AP we need to know: int, double, boolean

    // List examples of the types below and give definition
    // int (integer):
    // double:
    // boolean:

    // For now we are just going to work with primitive

    // Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN
    // CREATING THE VARIABLES
    int num = 8;
    String word = "word";
    boolean tired = true;

    // MATH TIME!

    // What are the math operators that we can use?
    // + - * / %

    // Try doing some math operations with numbers. How can we check to see if the
    // math worked?
    int calc_num = (2 + 3) / 2 % 6 * 3;
    System.out.println("calc_num:" + calc_num);
    // Create codes that will print the following:

    // Odd integers from 1 to 100, inclusive of both
    System.out.println("Odds:");
    for (int i = 1; i <= 100; i += 2) {
      System.out.println(i);
    }

    // All multiples of 3 from 1 to 100
    System.out.println("Multiples of 3:");
    for (int i = 0; i <= 100; i += 3) {
      System.out.println(i);
    }

    // Starting at 1000, print on the same line (with a - [hypthen] between each)
    // all of the numbers that end in 0 going down to 0
    System.out.println("numbers from 1000");
    String nums = "";
    for (int i = 1000; i >= 0; i -= 10) {
      nums += i;
      if (i != 0) {
        nums += "-";
      }

    }
    System.out.println(nums);

  }
}
