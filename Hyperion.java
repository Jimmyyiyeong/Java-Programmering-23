public class Hyperion {
    public static void main(String[] args) {

        Dorm foo = new Dorm ();
        foo.kiana.age = 17;
        foo.kiana.type = "psychic";
        foo.kiana.rank = 'A';

        valkyrie bronya = new valkyrie("Mecha", 5, 'B');




        valkyrie newSirin = foo.sirin; 


        System.out.println("Kiana is " + foo.kiana.age + " years old and type " + foo.kiana.type + ". Her rank is " + foo.kiana.rank + ".");

        System.out.println(bronya);
        System.out.println(newSirin);
    }
}
