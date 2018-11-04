import java.util.*;
public class Tarea2{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
  double A, B, C;
     System.out.println("Introduzca 3 numeros distintos");
   System.out.println("Digite el primer numero:");
   A = sc.nextDouble();
   System.out.println("Digite el segundo numero:");
   B = sc.nextDouble();
   System.out.println("Digite el tercer numero:");
   C = sc.nextDouble();
     
     if(A == B && A == C)
   System.out.println("Se detectaron Valores Iguales vuelva a escribirlos");
     else if(A == B && A != C)
   System.out.println("Se detectaron Valores Iguales vuelva a escribirlos");
     else if(A == C && A != B)
   System.out.println("Se detectaron Valores Iguales vuelva a escribirlos");
     else if(B == A && B != C)
   System.out.println("Se detectaron Valores Iguales vuelva a escribirlos");
     else if(B == C && B != A)
   System.out.println("Se detectaron Valores Iguales vuelva a escribirlos");
     else if(C == A && C != B)
   System.out.println("Se detectaron Valores Iguales vuelva a escribirlos");
     else if(C == B && C != A)
   System.out.println("Se detectaron Valores Iguales vuelva a escribirlos");
    

   else if(A != B && B != C)   
     System.out.println ("numeros validos el orden es:");
    if (A > B && B > C)
     System.out.println("El numero mayor: "+A +" y el menor:" +C);
    if (A > C && C > B )
     System.out.println("El numero mayor: "+A +" y el menor:" +B);
    if (B > A && A > C)
     System.out.println("El numero mayor: "+B +" y el menor:" +C);
    if (B > C && C > A )
     System.out.println("El numero mayor: "+B +" y el menor:" +A);
    if (C > A && A > B)
     System.out.println("El numero mayor: "+C +" y el menor:" +B);
    if (C > B && B > A )
     System.out.println("El numero mayor: "+C +" y el menor:" +A);

 }
}