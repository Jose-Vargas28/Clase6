import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numerador entero: ");
        Double numerador = sc.nextDouble();
        System.out.println("Introduzca un denominador entero: ");
        Double denominador = sc.nextDouble();

        Double resultado = division.operaciones(numerador, denominador);
        System.out.println("\nResultado: " + resultado);

        division division = new division();

        try{
            System.out.println(division.operaciones(10,0));

        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Resultado final: " + division.operaciones(10,0));*/

        System.out.println(calculadora.raizc(10));
        System.out.println(calculadora.raices(2,3,5));
    }
}
