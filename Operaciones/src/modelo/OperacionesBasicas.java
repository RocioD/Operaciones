package modelo;

public class OperacionesBasicas{

    public OperacionesBasicas() {
    }
    
    public int Sumar(int a, int b){
        if (a == 0 || b == 0) {
            return 0;
        }
        return a + b;
    }

    public int Restar(int a, int b){
        if (a > b) {
           return a - b; 
        }
        return 0;
    }

    public int Multiplicar(int a, int b){
        if (b == 0) {
           return 1; 
        }
        return a * b;
    }

    public int Dividir(int a, int b){
        if (b == 0) {
            return 0; 
         }
         return a / b;
    }

}