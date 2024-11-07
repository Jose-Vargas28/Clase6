public class calculadora {
    double  n, n1, n2;


    public calculadora() {
    }

    public calculadora(double n,double n1, double n2) {
        this.n = n;
        this.n1 = n1;
        this.n2 = n2;
    }

    public double dividir(double n1, double n2) {
        try{
            return n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
    public static double raizc(double n){
        try{
            return Math.sqrt(n);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
        finally {
            System.out.println("El valor es:");
        }

    }
    public static double raices(double a,double b, double c){
        try{
            double discrim=b*b-a*a*c;
            if(discrim<0){
                System.out.println("No existen raices reales:");
            }
            double raiz1=(-b+Math.sqrt(discrim))/(2*a);
            double raiz2=(-b+Math.sqrt(discrim))/(2*a);
            System.out.println(raiz1);
            System.out.println(raiz2);
        }catch(ArithmeticException e){
            System.out.println("Error:" + e.getMessage());
        }
        return 0;
    }
}
