package practices.practice_6;

import java.util.ArrayList;

public class Test {
    
    public static void task_1() {
        var arr = new ArrayList<Student>();
        for (var i = 0; i < 10; ++i) {
            arr.add(new Student(100 - i, "Student", 100 - i));
        }

        // insertion sort
        for (var i = 1; i < arr.size(); i++) {
            var key = arr.get(i);

            for (var j = i - 1; j >= 0; j--) {
                if (key.get_id() < arr.get(j).get_id()) {
                    arr.set(j + 1, arr.get(j));
                    if (j == 0)
                        arr.set(0, key);

                } else {
                    arr.set(j + 1, key);
                    break;
                }
            }
        }

        for (var i : arr) {
            System.out.println(i.toString());
        }
    }

    public static void task_2() {
        var arr = new ArrayList<Student>();
        for (var i = 0; i < 10; ++i) {
            arr.add(new Student(100 - i, "Student", 100 - i));
        }

        var s = new SortingStudentsByGPA();
        s.quicksort(arr);

        for (var i : arr) {
            System.out.println(i.toString());
        }
    }

    public static void task_3() {
        var arr = new ArrayList<Student>();
        for (var i = 0; i < 10; ++i) {
            arr.add(new Student(100 - i, "Student", 100 - i));
        }

        var s = new SortingStudentsByGPA();
        s.mergesort(arr, 0, 9);

        for (var i : arr) {
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args) {        
        System.out.println("Task 1 demonstration: ");
        task_1();
        System.out.println("\nTask 2 demonstration: ");
        task_2();
        System.out.println("Task 3 demonstration: ");
        task_3();
    }
}
