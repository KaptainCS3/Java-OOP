package SwitchVariables;

import java.util.jar.Attributes.Name;

public class switchVariables {
    public static void main(String[] args) {
        String Name = "Leo";
        String NickName = "KaptainCS3";
        String temp;
        temp = Name;
        Name = NickName;
        NickName = temp;
        System.out.println("Name:"+Name); 
        System.out.println("NickName:"+NickName); 
    }
}
