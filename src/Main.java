import hello.hello;
import operators.calc;
import String.StringUsage;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("\t> Hello Words\n");
        hello salut = new hello();
        salut.hello();

        System.out.println("\t> txt operation\n");
        StringUsage text = new StringUsage();
        text.operation();

        System.out.println("\n> Basic Calculator\n");
        calc str = new calc();
        str.Calc();
    }
}