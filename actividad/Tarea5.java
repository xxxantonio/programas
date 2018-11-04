import java.util.*;
public class Tarea5{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 double Num;
 System.out.println("Introduzca un numero entre 0 y 9999");
 Num = sc.nextDouble();
  if(Num ==0 && Num <= 10 )
  System.out.println("Su numero tiene 1 cifra ");
  else if (Num >= 10 && Num < 100)
  System.out.println("Su numero tiene 2 cifras");
  else if (Num >=100 && Num < 1000)
  System.out.println("Su numero tiene 3 cifras");
  else if (Num >=1000 && Num <=9999)
  System.out.println("Su numero tiene 4 cifras");
  else if (Num < 0 || Num > 9999)
  System.out.println("Numero No Valido");

 }
}