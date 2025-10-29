import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class ArrayMethods {
    public static void main(String[] args){
        int[] numbers = {101, 5, 2, 100, 8, 1, 9, 10, 22 , -2, 0};
        int[] copyNumbers;
        int[] filledArray = new int[5];

        System.out.println("Original Array is: " + Arrays.toString(numbers)); // [101, 5, 2, 100, 8, 1, 9, 10, 22, -2, 0]

        // 1️⃣ sort() → sorts array in ascending order
        Arrays.sort(numbers);
        System.out.println("1. Sorted array: " + Arrays.toString(numbers)); // [-2, 0, 1, 2, 5, 8, 9, 10, 22, 100, 101]

        // 2️⃣ binarySearch() → searches for an element (must be sorted!)
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("2. index of 5 in array: "+ index); // 4

        // 3️⃣ copyOf() → copy entire array with new length
        copyNumbers = Arrays.copyOf(numbers, 15);

        // 4️⃣ copyOfRange() → copy a specific range
        int[] range = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("4. copyOfRange(1,4): " + Arrays.toString(range)); // [0, 1, 2]

        // 5️⃣ fill() → fill all elements with a specific value
        Arrays.fill(filledArray, -15);
        System.out.println("5. Arrays.fill(): "+ Arrays.toString(filledArray)); //[-15, -15, -15, -15, -15]

        // 6️⃣ equals() → compare two arrays (content, not reference)
        int[] array = {-15, -15, -15, -15, -15};
        System.out.println("6. equals: "+ array.equals(filledArray)); // false
        System.out.println("6. Arrays.equals: "+ Arrays.equals(array, filledArray)); //true

        // 7️⃣ compare() → compares lexicographically (Java 9+)
        int[] arr_compare_1 = {0, 2, 4, 6, 8, 10, 11, -1};
        int[] arr_compare_2 = {0, 2, 4, 6, 8, 10, 11, -1, 0};

        System.out.println("7. compre two arrays: " + Arrays.compare(arr_compare_1, arr_compare_2)); // -1

        // 8️⃣ mismatch() → finds index of first difference (Java 9+)
        System.out.println("8. mismatch: " + Arrays.mismatch(arr_compare_1, arr_compare_2)); // 8

        // 9️⃣ toString() → easy way to print arrays
        System.out.println("9. toString(): " + Arrays.toString(numbers));

        // 🔟 deepToString() → for multidimensional arrays
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("10. deepToString(): " + Arrays.deepToString(matrix)); // [[1, 2], [3, 4]]

        // 11️⃣ stream() (Java 8+) → convert array to Stream

        List<Employee> employeeList = List.of(
                new Employee("Hamidreza", 10000),
                new Employee("Ali", 20000),
                new Employee("Tedd", 30000),
                new Employee("Ramin", 1000),
                new Employee("Neda", 15000)
        );
        System.out.println("11. List.Stream() filter employees with salary more than or equals to 20000 sorted by their names");
        employeeList.stream().filter(e -> e.salary >= 20000).sorted(Comparator.comparing(e -> e.name)).map(e -> e.name).forEach(System.out::println);

    }
}
