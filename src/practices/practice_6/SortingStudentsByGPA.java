package practices.practice_6;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    
    public int compare(Student first, Student second) {
        return first.compareTo(second);
    }

    public void quicksort(ArrayList<Student> students) {
        quicksort(students, 0, students.size() - 1);
    }

    public void quicksort(ArrayList<Student> students, int left, int right) {
        if (left >= right) return;

        int currentLeft = left;
        int currentRight = right;
        Student pivot = students.get((left + right) / 2);

        do {
            while (compare(students.get(currentLeft), pivot) < 0) ++currentLeft;
            while (compare(students.get(currentRight), pivot) > 0) --currentRight;

            if (currentLeft <= currentRight) {
                swap(students, currentLeft, currentRight);

                ++currentLeft;
                --currentRight;
            }
        } while (currentLeft <= currentRight);

        quicksort(students, left, currentRight);
        quicksort(students, currentLeft, right);
    }

    public void mergesort(ArrayList<Student> students, int left, int right) {
        if (left == right) {
            var middle = (left + right) / 2;

            mergesort(students, left, middle);
            mergesort(students, middle, right);
            merge(students, left, middle, right);
        }
    }

    public void merge(ArrayList<Student> students, int l, int m, int r) {
        var leftIndex = l;
        var rightIndex = m + 1;
        var mergedSortedArray = new ArrayList<Student>();

        while(leftIndex <= m && rightIndex <= r){
            if (compare(students.get(leftIndex), students.get(rightIndex)) >= 0){
                mergedSortedArray.add(students.get(leftIndex));
                leftIndex++;
            } else{
                mergedSortedArray.add(students.get(rightIndex));
                rightIndex++;
            }
        }

        while(leftIndex <= m){
            mergedSortedArray.add(students.get(leftIndex));
            leftIndex++;
        }

        while(rightIndex <= r){
            mergedSortedArray.add(students.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = l;
        while(i < mergedSortedArray.size()){
            students.set(j, mergedSortedArray.get(i++));
            j++;
        }
    }

    public void swap(ArrayList<Student> students, int first, int second) {
        Student temp = students.get(first);
        students.set(first, students.get(second));
        students.set(second, temp);
    }
}
