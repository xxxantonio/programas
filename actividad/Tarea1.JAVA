
import java.util.*;
public class Tarea1{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int A,B;
 System.out.println("Introduzca su primer numero entero ");
 A = sc.nextInt();
 System.out.println("Introduzca su segundo numero entero ");
 B = sc.nextInt();
 if (A > B)
  System.out.println("El mayor es: "+A);
 else if (B > A)
  System.out.println("El mayor es: "+B);
  }
}
