package InputUtility;
import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = input.nextInt();
        //to solve invalid scanning for string input
        // we include a nextLine method after the nextInt; method;
        input.nextLine();
        System.out.println("Where do you live? ");
        String location = input.nextLine();
        System.out.println("You are "+age+" years old"); 
        System.out.println("I live in "+location); 
    }
}
