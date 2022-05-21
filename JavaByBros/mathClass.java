import java.util.Scanner;

public class mathClass {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //simple program to find the area and hypotenuse of a triangle
        int a, b, c, area;
        System.out.println("                  * ");
        System.out.println("                  * *"); 
        System.out.println("                  * * *"); 
        System.out.println("                  * * * *       side c"); 
        System.out.println("       side a     * * * * *"); 
        System.out.println("                  * * * * * *"); 
        System.out.println("                  * * * * * * *"); 
        System.out.println("                     side b");
        System.out.println("");
        System.out.println("");
        System.out.print("Enter the value of side a: ");
        a = s.nextInt();
        System.out.print("Enter the value of side b: ");
        b = s.nextInt();
        // System.out.println(a);
        // System.out.println(b);
            area = ((b/2)* a);
            System.out.println("Area of triangle is : "+area+"cm");
        
    }
}

