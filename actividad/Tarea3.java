
import java.util.*;
public class Tarea3{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int A,B;
 System.out.println("Introduzca su primer numero entero ");
 A = sc.nextInt();
 System.out.println("Introduzca su segundo numero entero ");
 B = sc.nextInt();
 if (A < B)
  System.out.println("El orden menor a mayor es: " + A + "," + B);
  else if (B < A)
  System.out.println("El orden menor a mayor es: " + B + "," + A);

  }
}
 