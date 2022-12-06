package hello;
import java.util.*;
public class hello
{
    public static void hello(String[] args)
    {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a name:");
        String str= sc.nextLine();              //reads string
        System.out.print("hello "+str);

    }
}