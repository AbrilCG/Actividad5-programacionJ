package actividad5.programacionj;
import java.util.Scanner;
public class Actividad5ProgramacionJ {
    public static void main(String[] args) {
        int num1,num2,suma,resta,multiplicacion;
        double division;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame un numero");
        num1=sc.nextInt();
        System.out.println("Dame otro numero");
        num2=sc.nextInt();
        System.out.println("X= "+num1);
        System.out.println("Y= "+num2);
        suma=num1+num2;
        System.out.println("Suma: "+suma);
        resta=num1-num2;
        System.out.println("Resta: "+resta);
        multiplicacion=num1*num2;
        System.out.println("Multiplicacion: "+multiplicacion);
        division=num1/num2;
        System.out.println("Division: "+division);
    }
}
