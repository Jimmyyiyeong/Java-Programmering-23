package exercises;
import java.util.*;

public class Registry {
public static void main(String[] args) {
    Map<Integer, Employee> mihoyo = new HashMap<>();

    mihoyo.put(101, new Employee("Theresa", 40));
    mihoyo.put(102, new Employee("Himeko", 35));
    mihoyo.put(103, new Employee("Kiana", 17));
    mihoyo.put(104, new Employee("Mei", 18));
    mihoyo.put(105, new Employee("Bronya", 15));

    System.out.println(mihoyo.get(103));

}

}
