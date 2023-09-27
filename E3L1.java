public class E3L1 {

        public static void main (String[] args) {

        Bookclass harryp = new Bookclass();
        System.out.println(harryp.title + harryp.author + harryp.year);

    }
    
}
    class Bookclass {
        String title;
        String author;
        int year;

        Bookclass() {

            title = "harryp";
            author = "JKR";
            year = 1999;
        }

    }

