/* Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).

One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
The code above creates a Scanner object named  and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:

Hi 5
Our code will print:

myString is: Hi
myInt is: 5
Alternatively, you can use the BufferedReader class.

Task
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125 */
import java.util.Scanner;   
public class scanner_i{ // Puedes elegir un nombre significativo para tu clase pero debe ser público y coincidir con el nombre del archivo
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in); 
        int myInt1= scan.nextInt(); // Leer el primer entero
        int myInt2= scan.nextInt(); // Leer el segundo entero
        int myInt3= scan.nextInt(); // Leer el tercer entero
        scan.close();  // Cerrar el escáner ya que no se necesita más entrada
        System.out.println(myInt1); // Imprimir el primer entero
        System.out.println(myInt2); // Imprimir el segundo entero
        System.out.println(myInt3); // Imprimir el tercer entero
    
    }
}   