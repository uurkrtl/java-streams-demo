
## Coding: Java Streams

Create a new project in IntelliJ and implement the following steps using Java Streams.

-   Step 1: Filter a list of numbers and only output the even numbers.
-   Step 2: Use 'map' and double each number in the list.
-   Step 3: Sort the list in ascending order.
-   Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
-   Step 5: Use 'forEach' and output each processed number.
-   Step 6: Collect the processed numbers into a new list using 'collect'.
-   If you have already completed this task earlier, you may work on the bonus task on the next page.

## [](https://github.com/neuefische/hh-java-24-1-handouts/blob/main/3-Ecosystem/03-Stream/challenges.md#bonus)Bonus

For those who want to challenge themselves even more!

-   Take a look at the file  [students.csv](https://neuefische.github.io/java-curriculum/3-Ecosystem/03-Stream/res/students.csv). Copy the file to the root directory of your project.
-   Use streams to read and output the file line by line (Hint:  `Files.lines(Path.of("students.csv"))`)
-   Remove the header
-   Convert each line into the class Student
-   Remove invalid lines and duplicates