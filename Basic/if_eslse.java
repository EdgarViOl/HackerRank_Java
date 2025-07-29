/* In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

Wikipedia if-else flow chart

Source: Wikipedia

Task
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of  to , print Not Weird
If n is even and in the inclusive range of  to , print Weird
If n is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1 
Not Weird

Explanation

Sample Case 0: n=3
 n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n=24
 n and  is even, so it isn't weird. Thus, we print Not Weird. */
import java.io.*; // Importar clases de entrada/salida
import java.math.*; // Importar clases matemáticas
import java.security.*; // Importar clases de seguridad
import java.text.*; // Importar clases de formato de texto
import java.util.*; // Importar clases de utilidades
import java.util.concurrent.*; // Importar clases de concurrencia
import java.util.regex.*; // Importar clases de expresiones regulares 

Public class if_eslse { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada
        int n = scan.nextInt(); // Leer un entero de la entrada estándar
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); // Saltar el salto de línea restante después de leer el entero
        scan.close(); // Cerrar el escáner ya que no se necesita más entrada

        if (n % 2 == 1) // Verificar si n es impar{
            System.out.println("Weird"); // Imprimir "Weird" si n es impar
        } else { // Si n es par
            if (n >= 2 && n <= 5) // Verificar si n está en el rango de 2 a 5
            {
                System.out.println("Not Weird"); // Imprimir "Not Weird" si n está en el rango de 2 a 5
            } else if (n >= 6 && n <= 20) // Verificar si n está en el rango de 6 a 20
            {
                System.out.println("Weird"); // Imprimir "Weird" si n está en el rango de 6 a 20
            } else if (n > 20) {
                System.out.println("Not Weird"); // Imprimir "Not Weird" si n es mayor que 20
            }
        }
    }

 }  