/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjunto;

/**
 *
 * @author usuario
 */
public class Fraccion {

    public int getN() {//regresa variable pruvada sout
        return n;
    }

    public int getD() {
        return d;
    }
    private int n, d;//obligar a ingresar las dos                              variables

    public void setFraccion1(int n) {
        this.n = n;

    }

    public void setFraccion2(int d) {
        this.d = d;
    }

    public Fraccion() {
        setFraccion1(0);
        setFraccion2(0);
    }

    public Fraccion suma(Fraccion F1, Fraccion F2) {
        Fraccion resultado;
        resultado = new Fraccion();//referencia accede a el new objectcomo puntero no se copian los datos pierdes 1 rrewrite(->ref=ref2)
        if (F1.d == 0) {
            F1.d = 1;
        }
        if (F2.d == 0) {
            F2.d = 1;
        }
        if (F1.d != F2.d) {
            resultado.d = F1.d * F2.d;
            resultado.n = (F1.n * F2.d) + (F2.n * F1.d);
        } else {
            resultado.d = F1.d;
            resultado.n = (F1.n + F2.n);
        }
        return resultado;
    }

    public Fraccion resta(Fraccion F1, Fraccion F2) {
        Fraccion resultado;
        resultado = new Fraccion();
        if (F1.d == 0) {
            F1.d = 1;
        }
        if (F2.d == 0) {
            F2.d = 1;
        }
        if (F1.d != F2.d) {
            resultado.n = (F1.n * F2.d) - (F2.n * F1.d);
            resultado.d = F1.d * F2.d;
        } else {
            resultado.n = (F1.n - F2.n);
            resultado.d = F1.d;
        }
        return resultado;
    }

    public Fraccion simplificacion(Fraccion resultado) {
        int i = 2;
        while (i <= resultado.n && i <= resultado.d) {
            if (resultado.n % i == 0 && resultado.d % i == 0) {
                resultado.n = resultado.n / i;
                resultado.d = resultado.d / i;
            } else {
                i++;
            }
        }

        return resultado;
    }

    public Fraccion multiplicacion(Fraccion F1, Fraccion F2) {
        if (F1.d == 0) {
            F1.d = 1;
        }
        if (F2.d == 0) {
            F2.d = 1;
        }
        Fraccion resultado;
        resultado = new Fraccion();//referencia accede a el new objectcomo puntero no se copian los datos pierdes 1 rrewrite(->ref=ref2)
        resultado.n = (F1.n * F2.n);
        resultado.d = (F1.d * F2.d);
        simplificacion(resultado);
        return resultado;

    }

    public Fraccion division(Fraccion F1, Fraccion F2) {
        Fraccion resultado;
        resultado = new Fraccion();
        int fin =0;

        if (F2.n != 0) {
            resultado.n = (F1.n * F2.d);
        } else {
            resultado.n = F1.n;
            resultado.d = F1.d;
           fin =1;
        }
        if (fin!=1){
        if (F1.n != 0) {
            resultado.d = (F1.d * F2.n);
        } else {
           
            
            resultado.n = F2.n;
              resultado.d = F2.d;

        }
        }
        return resultado;

    }
}
