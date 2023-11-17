package codealongs;
import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> turordning = new LinkedList<>();

        turordning.add("David");
        turordning.add("Maria");
        turordning.add("Tomas");
        turordning.add("George");
        turordning.add("Sophie");

        System.out.println(turordning);

        String nextInLine = turordning.poll();

        System.out.println("Next in line:" + nextInLine);
        System.out.println(turordning);

        nextInLine = turordning.peek();
        
        System.out.println("Next in line:" + nextInLine);
        System.out.println(turordning);

        turordning.offer("David");


     
    }
    
}
