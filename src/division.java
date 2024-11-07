public class division {
    double numerador;
    double denominador;
    double raiz;

    public division() {
    }

    public division(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.raiz = raiz;

    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }
    public double operaciones(double a, double b){
        return a /b;
    }
    public double operacionEnteros(int a, int b){
        return a * b;

    }
    public double operacionraiz(int a){
        return Math.sqrt(a);
    }
}

