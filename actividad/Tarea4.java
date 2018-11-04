import java.util.*;
public class Tarea4{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int Num;
 System.out.println("Introduzca el numero a determinar");
 Num = sc.nextInt();
 if (Num < 0)
  System.out.println("Su numero es Negativo ");
  else if (Num > 0)
  System.out.println("Su numero es Positivo ");
 }
}