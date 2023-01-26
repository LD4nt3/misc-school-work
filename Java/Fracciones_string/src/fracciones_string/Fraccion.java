/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones_string;

/**
 *
 * @author che_d
 */
public class Fraccion {

    private String FS;//obligar a ingresar las dos   variables
    private int n, d, n2, d2;
    public int rs, rd;
    public String mostrar = "", mostrard = "",suf="";
    public String[] Ss = new String[10];

    public void setFraccionS(String x) {

        //System.out.println(X.S);
        this.FS = x;
    }

    public void setFraccion(int n, int d, int n2, int d2) {

        //System.out.println(X.S);
        this.n = n;
        this.d = d;
        this.n2 = n2;
        this.d2 = d2;

    }

    public Fraccion() {
        setFraccionS("un medio mas un medio");
        setFraccion(1, 1, 1, 1);
    }

    public int calcular(Valores arreglo[], Fraccion F1) {

        int pos = 0, op = 0, j = 0, Rn = 0, Rd = 0, Rn2 = 0, Rd2 = 0, i = 0, plur = 0;
        int error = 0;
//error no se encotro algun numerador o denominador en la fraccion

        String[] datoS = F1.FS.split(" ");
        while (j < 4) {//obtener primera fraccion

            for (i = 0; i < datoS.length; i++) {

                if (datoS[i].equals(arreglo[48 + j].S)) {
                    pos = i;
                    op = arreglo[48 + j].valor;

                }

            }
            j++;
        }

        if (op > -1) {
            error = 1;
            System.out.println(op);
            //System.out.println("error no se tiene la operacion	a realizar");
        } else {

            j = 0;
int fin=0;
            //numerador
            while (j < 37) {
                for (i = 0; i < pos; i++) {
                    //j sea menor hasta donde se forme 99 y no tomar los ultmios numero del denominador empezar
                       if ((datoS[i].equalsIgnoreCase(arreglo[62].S))&&fin==0) {
                        Rn = Rn + arreglo[62].valor;
                        fin=1;
                        
                       }
                    if (datoS[i].equalsIgnoreCase(arreglo[j].S)) {
                        Rn = Rn + arreglo[j].valor;
                        if ((datoS[i].equalsIgnoreCase("un") && i == 0)||(datoS[i].equalsIgnoreCase("uno") && i == 0)) {//un signififca s final x=1 entonces en denominador agrega mas s avo if else avos
                            plur = 1;
                        }

                    }

                }
                j++;
            }

            //denominador
            j = 10;
            while (j < 38) {

                for (i = 0; i < pos; i++) {//j sea menor hasta donde se forme 99 y no tomar los ultmios numero del denominador empezar
                    if (plur != 0) {
                        if ((datoS[i].equalsIgnoreCase(arreglo[j].S + "avo")) || (datoS[i].equalsIgnoreCase(arreglo[j].S + "vo"))) {
                            Rd = Rd + arreglo[j].valor;
                        } else {
                            for (int k = 1; k < 10; k++) {
                                if (datoS[i].equalsIgnoreCase(arreglo[j].S + "i" + arreglo[k].S + "avo")) {
                                    Rd = Rd + arreglo[j].valor + arreglo[k].valor;
                                }
                            }
                        }

                    } else {
                        if ((datoS[i].equalsIgnoreCase(arreglo[j].S + "avos")) || (datoS[i].equalsIgnoreCase(arreglo[j].S + "vos"))) {
                            Rd = Rd + arreglo[j].valor;

                        } else {
                            for (int k = 1; k < 10; k++) {
                                if (datoS[i].equalsIgnoreCase(arreglo[j].S + "i" + arreglo[k].S + "avos")) {
                                    Rd = Rd + arreglo[j].valor + arreglo[k].valor;
                                }
                            }
                        }
                    }
                }
                j++;
            }
            j = 52;

            while (j < 60) {

                for (i = 0; i < pos; i++) {//j sea menor hasta donde se forme 99 y no tomar los ultmios numero del denominador empezar
                    if (plur != 0) {
                        if (datoS[i].equalsIgnoreCase(arreglo[j].S)) {
                            Rd = Rd + arreglo[j].valor;

                        }
                    } else {
                        if (datoS[i].equalsIgnoreCase(arreglo[j].S + "s")) {
                            Rd = Rd + arreglo[j].valor;
                        }
                    }
                }
                j++;
            }
fin=0;
            //obtener segunda fraccion
            j = 0;
            //numerador
            plur = 0;
            while (j < 37) {
                for (i = pos; i < datoS.length; i++) {//j sea menor hasta donde se forme 99 y no tomar los ultmios numero del denominador empezar
                        if ((datoS[i].equalsIgnoreCase(arreglo[62].S))&&fin==0) {
                        Rn2 = Rn2 + arreglo[62].valor;
                        fin=1;
                        
                       }
                    if (datoS[i].equalsIgnoreCase(arreglo[j].S)) {
                        Rn2 = Rn2 + arreglo[j].valor;
                        if ((datoS[i].equalsIgnoreCase("un") && i ==pos+1)||(datoS[i].equalsIgnoreCase("uno") && i == pos+1)) {//un signififca s final x=1 entonces en denominador agrega mas s avo if else avos
                            plur = 1;
                        }
                    }
                }
                j++;
            }

            //denominador
            j = 10;

            while (j < 38) {

                for (i = pos; i < datoS.length; i++) {//j sea menor hasta donde se forme 99 y no tomar los ultmios numero del denominador empezar
                    if (plur != 0) {
                        if ((datoS[i].equalsIgnoreCase(arreglo[j].S + "avo")) || (datoS[i].equalsIgnoreCase(arreglo[j].S + "vo"))) {
                            Rd2 = Rd2 + arreglo[j].valor;
                        } else {
                            for (int k = 1; k < 10; k++) {
                                if (datoS[i].equalsIgnoreCase(arreglo[j].S + "i" + arreglo[k].S + "avo")) {
                                    Rd2 = Rd2 + arreglo[j].valor + arreglo[k].valor;
                                }
                            }
                        }

                    } else {
                        if ((datoS[i].equalsIgnoreCase(arreglo[j].S + "avos")) || (datoS[i].equalsIgnoreCase(arreglo[j].S + "vos"))) {
                            Rd2 = Rd2 + arreglo[j].valor;

                        } else {
                            for (int k = 1; k < 10; k++) {
                                if (datoS[i].equalsIgnoreCase(arreglo[j].S + "i" + arreglo[k].S + "avos")) {
                                    Rd2 = Rd2 + arreglo[j].valor + arreglo[k].valor;
                                }
                            }
                        }
                    }
                }
                j++;

            }
            j = 52;
            while (j < 60) {

                for (i = pos; i < datoS.length; i++) {//j sea menor hasta donde se forme 99 y no tomar los ultmios numero del denominador empezar
                    if (plur != 0) {
                        if (datoS[i].equalsIgnoreCase(arreglo[j].S)) {
                            Rd2 = Rd2 + arreglo[j].valor;

                        }
                    } else {
                        if (datoS[i].equalsIgnoreCase(arreglo[j].S + "s")) {
                            Rd2 = Rd2 + arreglo[j].valor;
                        }
                    }
                }
                j++;
            }
        }
        if (Rd2 == 0 || Rd == 0) {
            error = 2;
        }
        if (Rd == 0) {
            Rd = 1;
        }
        if (Rd2 == 0) {
            Rd2 = 1;
        }

        F1.n = Rn;
        F1.n2 = Rn2;
        F1.d = Rd;
        F1.d2 = Rd2;

        System.out.println(op);

        if (op == -1) {
            suma(F1, arreglo);
        }
        if (op == -2) {
            resta(F1, arreglo);
        }
        if (op == -3) {
            multiplicacion(F1, arreglo);
        }
        if (op == -4) {
            division(F1, arreglo);
        }

        return (error);

    }

    public void suma(Fraccion F1, Valores arreglo[]) {
        Fraccion resultado;
        System.out.println("suma");
        System.out.println(F1.n);
        System.out.println(F1.d);
        System.out.println(F1.n2);
        System.out.println(F1.d2);

        resultado = new Fraccion();//referencia accede a el new objectcomo puntero no se copian los datos pierdes 1 rrewrite(->ref=ref2)

        if (F1.d != F1.d2) {
            resultado.n = (F1.n * F1.d2) + (F1.n2 * F1.d);
            resultado.d = F1.d * F1.d2;
        } else {
            resultado.n = (F1.n + F1.n2);
            resultado.d = F1.d;
        }

        getN_D(resultado, arreglo);

    }

    public void resta(Fraccion F1, Valores arreglo[]) {
        Fraccion resultado;
        System.out.println("resta");
        System.out.println(F1.n);
        System.out.println(F1.d);
        System.out.println(F1.d2);
        resultado = new Fraccion();

        if (F1.d != F1.d2) {
            resultado.n = (F1.n * F1.d2) - (F1.n2 * F1.d);
            resultado.d = F1.d * F1.d2;
        } else {
            resultado.n = (F1.n - F1.n2);
            resultado.d = F1.d;
        }

        getN_D(resultado, arreglo);
    }

    public void simplificacion(Fraccion resultado, Valores arreglo[]) {
        int i = 2;
        while (i <= resultado.n && i <= resultado.d) {
            if (resultado.n % i == 0 && resultado.d % i == 0) {
                resultado.n = resultado.n / i;
                resultado.d = resultado.d / i;
            } else {
                i++;
            }
        }

        getN_D(resultado, arreglo);
    }

    public void multiplicacion(Fraccion F1, Valores arreglo[]) {
        Fraccion resultado;
        resultado = new Fraccion();//referencia accede a el new objectcomo puntero no se copian los datos pierdes 1 rrewrite(->ref=ref2)
        resultado.n = (F1.n * F1.n2);
        resultado.d = (F1.d * F1.d2);
        simplificacion(resultado, arreglo);

    }

    public void division(Fraccion F1, Valores arreglo[]) {
        Fraccion resultado;
        resultado = new Fraccion();
          int fin =0;

        if (F1.n2 != 0) {
            resultado.n = (F1.n * F1.d2);
        } else {
            resultado.n = F1.n;
            resultado.d = F1.d;
           fin =1;
        }
        if (fin!=1){
        if (F1.n != 0) {
            resultado.d = (F1.d * F1.n2);
        } else {
           
            
            resultado.n = F1.n2;
              resultado.d = F1.d2;

        }
        }
      

        simplificacion(resultado, arreglo);

    }

    public void getN_D(Fraccion n, Valores arreglo[]) {//regresa variable  sout
        rs = n.n;
        rd = n.d;

        int arr[] = new int[8];

        int M = 0, C = 0, D = 0, U = 0, alert = 0,x=0;
        M = n.n / 1000;
        C = (n.n - (M * 1000)) / 100;
        D = (n.n - (C * 100 + M * 1000)) / 10;

        U = (n.n - (M * 1000 + C * 100 + D * 10));
        //numerador
        arr[0] = M;
        arr[1] = C * 100;
        arr[2] = D * 10;
        arr[3] = U;
        //denominador

        M = n.d / 1000;
        C = (n.d - (M * 1000)) / 100;
        D = (n.d - (C * 100 + M * 1000)) / 10;

        U = (n.d - (M * 1000 + C * 100 + D * 10));
        arr[4] = M;
        arr[5] = C * 100;
        arr[6] = D * 10;
        arr[7] = U;
        System.out.println("aa");
        for (int i = 0; i < 8; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("aa");
        int j = 1;
        while (j < 47) {
            for (int i = 0; i < 4; i++) {
                if (arreglo[j].valor == arr[i]) {
                    Ss[i] = arreglo[j].S;
                }
            }

            j++;
        }
        //denominador 

        if (M == 0 && C == 0 && D == 0) {
            j = 52;
            while (j < 60) {
                for (int i = 4; i < 8; i++) {
                    if (arreglo[j].valor == arr[i]) {
                        if (n.n != 1) {
                            Ss[i] = arreglo[j].S + "s";
                        } else {
                            Ss[i] = arreglo[j].S;
                        }
                    }
                }

                j++;
            }
        } else {
            j = 1;
            while (j < 47) {
                for (int i = 4; i < 8; i++) {
                    if (arreglo[j].valor == arr[i]) {

                        Ss[i] = arreglo[j].S;

                    }
                }

                j++;
            }
        }
        //numerador valor a string
        if (Ss[1] == "cien") {
            if (arr[2] != 0 || arr[3] != 0) {
                Ss[1] = "ciento";
            }
        }
        if (Ss[5] == "cien") {
            if (arr[6] != 0 || arr[7] != 0) {
                Ss[5] = "ciento";
            }
        }
        if (arr[0] != 0) {
            if (arr[0] != 1) {
                Ss[0] = Ss[0] + " mil ";
            } else {
                Ss[0] = " mil ";
            }
        }
        if (arr[4] != 0) {
            if (arr[4] != 1) {
                Ss[4] = Ss[4] + "mil";
            } else {
                Ss[4] = "mil";
            }
        }
        //caso 11 y 20
        x=arr[2]+arr[3];
        if(x>10&&x<29)
        {
            for (int i = 11; i < 30; i++) {
                if(x==arreglo[i].valor)
                Ss[2]=arreglo[i].S; 
                Ss[3]=null;
            }
           
        }
        else{
         if (arr[2] != 0 && arr[3] != 0) {
            Ss[2] = Ss[2] + " y";
        }
        }
        //denomiador
       
   
    
        if (Ss[4] != null || Ss[5] != null || Ss[6] != null || Ss[7] != null) {
              x=arr[6]+arr[7];
        if(x>10&&x<29)
        {
            for (int i = 11; i < 30; i++) {
                if(x==arreglo[i].valor)
                Ss[6]=arreglo[i].S; 
                Ss[7]=null;
            }
           
        }
            if (Ss[6] != "veinti") {
                if (arr[6] != 0 && arr[7] != 0) {
                    Ss[6] = Ss[6] + "i";
                }
            }
            //alerta si avo es prosible
            
            if (arr[4] != 0 || arr[5] != 0 || arr[6] != 0) {
                alert = 1;
            }
            
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0 && arr[3] == 1) {//avo, vo
                if (alert == 1) {
                    if (arr[6] < 30) {
                        suf= "avo";
                    } else {
                         suf="vo";
                    }
                }

            } else//avos, vos
            {   
                if (alert == 1) {
                    if (arr[6] < 30) {
                        suf= "avos";
                    } else {
                        suf= "vos";
                    }
                }
            }
        } else if (arr[3] == 1) {
            Ss[3] = Ss[3] + "o";
        }
        for (int i = 0; i < Ss.length / 2; i++) {
            if (Ss[i] != null) {

                mostrar = mostrar + Ss[i] + " ";

            }
            System.out.println("no");
        }

        for (int i = 4; i < Ss.length; i++) {
            if (Ss[i] != null) {

                mostrard = mostrard + Ss[i];

            }
        }

        /*
    for (int i = 0; i < Ss.length; i++) {
            System.out.println(Ss[i]);
        }
          
         */
       
    }

}
