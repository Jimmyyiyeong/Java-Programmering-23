public class myMathMethods {

int number;

static int factorial(int number) {
    int fact = 1;

    if (number<0) {
        System.out.println("FEL");
    }

    for(int a = 1; a<=number; a++)
        fact = fact*a;
        return fact;
}

static int calculateFibonacci(int number) {
    if (number<=0) {
        throw new IllegalArgumentException("Number must be positive integer");
    }
    if (number == 1 || number == 2) {
        number = number - 1;
    }
}

//myMathMethods(int number) {
   //this.number = number;
//}

public static void main(String[] args) {

//myMathMethods factorial = new myMathMethods();
System.out.println(factorial(10));



}



}

