// import java.io.*;
public class conditionals {
    public static void main(String[] args) {
        person u = new person("john", 12, 68.345);
        if (u.name == "john") {
            System.out.println("Welcome Mr " + u.name);
        } else {
            System.out.println("invalid name");
        }
    }
}