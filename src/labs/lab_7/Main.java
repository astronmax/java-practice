package labs.lab_7;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.removeFirst();
        cars.addFirst("Skoda");
        System.out.println(cars);

        cars.removeLast();
        cars.addLast("Impala");
        System.out.println(cars);

        cars.set(2, "Audi");
        System.out.println(cars);

        System.out.print("{ ");
        for (int i = 0; i < cars.size(); ++i) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.print("}\n");

        System.out.print("{ ");
        for (String car : cars) {
            System.out.print(car + " ");
        }
        System.out.print("}\n");

        String cars_str = cars.toString();
        System.out.println(cars_str);

        System.out.println("Head of the list: " + cars.peek());
        
        cars.clear();
        System.out.println(cars);
    }
}