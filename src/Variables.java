public class Variables {

//     Variable Scope
//     Create a class with:
//      a static variable count
//      an instance variable id
//      a local variable temp inside a method
//      Print them all and note the difference.

    public static int count = 0;
    public int id = 1;

    public void func(){
        int temp = 2;
        count++;
        id++;
        System.out.println("Count: " + count);
        System.out.println("ID: " + id);
        System.out.println("Temp: " + temp);
    }

    public static void main(String[] args){

//     Basic Declaration
//     Create a variable to store your name and print it to the console.

        String name = "Hamidreza";
        System.out.println("My name is : " + name);

//     Arithmetic with Variable
//     Create two integer variables, a = 10 and b = 5, then print their sum, difference, and product

        int a = 10;
        int b = 5;
        System.out.println("sum = " + (a + b));
        System.out.println("difference = " + (a - b));
        System.out.println("product = " + (a * b));

//     Type Conversion
//     Create a double variable with value 9.99, then convert it to an integer and print both.

        double c = 9.99;
        int d = (int) c;
        System.out.println("Double value = " + c);
        System.out.println("Int value = " + d);

//     Variable Scope

        Variables var_1 = new Variables();
        Variables var_2 = new Variables();

        var_1.func();
        var_2.func();

//     Constants and Final Keyword
//     Create a constant for Pi and use it to calculate the area of a circle.

        final double PI = 3.1415;
        double radius = 2.13;
        double circle_area = 2 * PI * radius;
        System.out.println("Area = " + circle_area);

    }
}