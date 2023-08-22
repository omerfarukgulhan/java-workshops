
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Character[] charArray = {'J', 'A', 'V', 'A'};
        Integer[] intArray = {1, 2, 3, 4, 5, 6};

        String[] stringArray = {"Java", "Python", "C++", "Php"};

        Student[] studentArray = {new Student("Mustafa"), new Student("Mehmet"), new Student("Merve")};

        PrintClass<Character> printChar = new PrintClass<Character>();
        PrintClass<String> printString = new PrintClass<String>();
        PrintClass<Integer> printInteger = new PrintClass<Integer>();
        PrintClass<Student> printStudent = new PrintClass<Student>();

        printChar.print(charArray);

        System.out.println("******************************");

        printString.print(stringArray);
        System.out.println("******************************");

        printInteger.print(intArray);
        System.out.println("******************************");

        printStudent.print(studentArray);

    }

}
