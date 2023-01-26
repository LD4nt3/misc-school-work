/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_a;

/**
 *
 * @author che_d
 */
public class Imagine_ops {
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
    public void setOps(int a) {
    this.a = a;
    this.ia = a;    
    this.x = a;
    }
    public Imagine_ops() { 
        setOps(0);
    }
    
        public Imagine_ops suma( int d[]) {
        Imagine_ops resultado,A,B;
        resultado = new Imagine_ops();
         A = new Imagine_ops();
          B = new Imagine_ops();
            A.a=d[0];
         A.ia=d[1];
           B.a=d[2];
         B.ia=d[3];
        resultado.a = A.a + B.a;
        resultado.ia = A.ia + B.ia;
        return resultado;

    }

    public Imagine_ops resta( int d[]) {
        Imagine_ops resultado,A,B;
        resultado = new Imagine_ops();
         A = new Imagine_ops();
          B = new Imagine_ops();
            A.a=d[0];
         A.ia=d[1];
           B.a=d[2];
         B.ia=d[3];
        resultado.a = A.a - B.a;
        resultado.ia = A.ia - B.ia;
        return resultado;
    }

    public Imagine_ops multiplicacion(int d[]) {
         Imagine_ops resultado,A,B;
        resultado = new Imagine_ops();
         A = new Imagine_ops();
          B = new Imagine_ops();
            A.a=d[0];
         A.ia=d[1];
           B.a=d[2];
         B.ia=d[3];
        resultado = new Imagine_ops();//regla
        resultado.a = ((A.a * B.a) - (A.ia * B.ia));
        resultado.ia = ((A.a * B.ia) + (A.ia * B.a));
        return resultado;
    }

    public Imagine_ops division(int d[]) {
             Imagine_ops resultado,A,B;
        resultado = new Imagine_ops();
         A = new Imagine_ops();
          B = new Imagine_ops();
            A.a=d[0];
         A.ia=d[1];
           B.a=d[2];
         B.ia=d[3];
        resultado = new Imagine_ops();//regla a=a b=ai c=b d=bi 
        resultado.a = ((A.a * B.a) + (A.ia * B.ia));//n
        resultado.x = ((B.a * B.a) + (B.ia * B.ia));//d
        resultado.ia =((A.ia* B.a)-(B.ia*A.a));//ni  
        return resultado;

    }
}
