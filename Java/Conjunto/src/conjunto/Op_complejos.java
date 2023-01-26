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
public class Op_complejos {

    private int a, ia;//(a + ai)*(b + bi)
    private int x;
    
   public int getA() {
        return a;
    }
      public int getiA() {
        return ia;
    }
         public int getX() {
        return x;
    }
    public void setOp1(int a) {
        this.a = a;

    }

    public void setOp2(int a) {
        this.ia = a;

    }

    public void setOp3(int a) {
        this.x = a;

    }

    public Op_complejos() {
        setOp1(0);
        setOp2(0);
        setOp3(0);
    }

    public Op_complejos suma(Op_complejos A, Op_complejos B) {
        Op_complejos resultado;
        resultado = new Op_complejos();
        resultado.a = A.a + B.a;
        resultado.ia = A.ia + B.ia;
        return resultado;

    }

    public Op_complejos resta(Op_complejos A, Op_complejos B) {
        Op_complejos resultado;
        resultado = new Op_complejos();
        resultado.a = A.a - B.a;
        resultado.ia = A.ia - B.ia;
        return resultado;
    }

    public Op_complejos multiplicacion(Op_complejos A, Op_complejos B) {
        Op_complejos resultado;
        resultado = new Op_complejos();//regla
        resultado.a = ((A.a * B.a) - (A.ia * B.ia));
        resultado.ia = ((A.a * B.ia) + (A.ia * B.a));
        return resultado;
    }

    public Op_complejos division(Op_complejos A, Op_complejos B) {
        Op_complejos resultado;
        resultado = new Op_complejos();//regla
        resultado.ia = ((B.a * B.a) + (B.ia * B.ia))/2;//d
        resultado.a = ((A.a * B.a) + (A.ia * B.ia))/2;//n
        resultado.x = ((A.ia * B.a) - (A.a * B.ia))-1;//ni  
        return resultado;

    }

 
}