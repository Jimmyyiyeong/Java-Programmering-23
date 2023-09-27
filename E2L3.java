public class E2L3 {
public static void main(String[] args) {
    
Studentclass anna = new Studentclass("anna", 15, 10);
    System.out.println(anna.name + " is " + anna.age + " years old and got a grade of " + anna.grade);

}    
}

class Studentclass {
    String name;
    int age;
    double grade;

    Studentclass(String name, int age, double grade) {

        this.name = name;
        this.age = age;
        this.grade = grade;

    }
}

