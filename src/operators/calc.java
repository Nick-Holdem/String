package operators;

import java.util.Scanner;

public class calc {
        public static void Calc() {
                    char operator;
                    Double number1, number2, result;

                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter number 1: ");
                    number1 = input.nextDouble();
                    System.out.println("Enter number 2: ");
                    number2 = input.nextDouble();
                    System.out.println("Choose an operator: +, -, *, / or P==Pow");
                    operator = input.next().charAt(0);

                    switch (operator) {
                        // conform semnului de operare vom efectua iperatia, fiecare operatie este creata ca o variante in switch>case>break
                        case '+':
                            result = number1 + number2;
                            System.out.println(number1 + " + " + number2 + " = " + result);
                            break;
                            case '-':
                            result = number1 - number2;
                            System.out.println(number1 + " - " + number2 + " = " + result);
                            break;
                        case '*':
                            result = number1 * number2;
                            System.out.println(number1 + " * " + number2 + " = " + result);
                            break;
                        case '/':
                            result = number1 / number2;
                            System.out.println(number1 + " / " + number2 + " = " + result);
                            break;
                            case 'P':
                            System.out.println(Math.pow(number1, number2));
                            break;
                        default:
                            System.out.println("Invalid operator!");
                            break;
                    }
                    input.close();
                }
            }