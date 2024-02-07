package net.ugurkartal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);


        //Step 1: Filter a list of numbers and only output the even numbers.
        List<Integer> evenNumbers = numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .toList();
        System.out.println("Even numbers: " + evenNumbers);

        //Step 2: Use 'map' and double each number in the list.
        List<Integer> evenNumbersDouble = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
        System.out.println("Double each even number: " + evenNumbersDouble);

        //Step 3: Sort the list in ascending order.
        List<Integer> evenNumbersDoubleOrdered = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .toList();
        System.out.println("Double each even number and sort: " + evenNumbersDoubleOrdered);

        //Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of all numbers: " + sum);

        //Step 5: Use 'forEach' and output each processed number.
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        // Collect the processed numbers into a new list using 'collect'.
        List<Integer> processedNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Processed numbers (Collect): " + processedNumbers);


        // Use streams to read and output the file line by line
        Path filePath = Path.of("students.csv");

        try {
            List<Student> students = Files.lines(filePath)
                    .skip(1) // Skip the header
                    .filter(line -> !line.isBlank()) // Remove empty lines
                    .map(line -> {
                        String[] parts = line.split(",");
                        return new Student(parts[0], parts[1], parts[2], Integer.parseInt(parts[3])); // Convert each line into the class Student
                    })
                    .distinct() // Remove duplicates
                    .collect(Collectors.toList());

            students.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}