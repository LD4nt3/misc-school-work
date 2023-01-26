/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import org.primefaces.model.chart.PieChartModel;

@Named(value = "Beangrafica")
@Dependent
public class Beangrafica {
private PieChartModel model;

public  Beangrafica() {
model = new PieChartModel();

model.setTitle("Grafica pastel");
model.setLegendPosition("w");
model.setFill(false);
model.setShowDataLabels(true);
model.setDiameter(150);
}
public PieChartModel getModel() {
return model;

}

}
        /*int no = 0, si = 0, p, a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0;

        for (int i = 0; i < arr.Valores.length; i++) {
            model = new PieChartModel();
            model.setTitle("Grafica pastel");
            model.setLegendPosition("w");
            model.setFill(false);
            model.setShowDataLabels(true);
            model.setDiameter(150);
            p = arr.Valores.length;// quizas problema de datos puede que regrese nada

            for (int l = 0; l < p; l++) {
                if ("cerrada".equals(arr.Valores[i][l].Tip)) {
                    if ("si".equals(arr.Valores[i][l].Res)) {
                        si++;
                    } else {
                        no++;
                    }
                    if (l == (p - 1)) {
                        model.set("si", si);
                        model.set("no", no);
                    }
                }
                if ("escala".equals(arr.Valores[i][l].Tip)) {
                    if ("1".equals(arr.Valores[i][l].Res)) {
                        a1++;
                    }
                    if ("2".equals(arr.Valores[i][l].Res)) {
                        a2++;
                    }
                    if ("3".equals(arr.Valores[i][l].Res)) {
                        a3++;
                    }
                    if ("4".equals(arr.Valores[i][l].Res)) {
                        a4++;
                    }

                    if ("5".equals(arr.Valores[i][l].Res)) {
                        a5++;
                    }

                    if (l == (p - 1)) {
                        model.set("1", a1);
                        model.set("2", a2);
                        model.set("3", a3);
                        model.set("4", a4);
                        model.set("5", a5);

                    }
                }
                if ("multiple".equals(arr.Valores[i][l].Tip)) {

                    if (arr.Valores[i][l].Res.equals(arr.Op[i][0])) {
                        b1++;
                    }
                    if (arr.Valores[i][l].Res.equals(arr.Op[i][1])) {
                        b2++;
                    }
                    if (arr.Valores[i][l].Res.equals(arr.Op[i][2])) {
                        b3++;
                    }
                    if (arr.Valores[i][l].Res.equals(arr.Op[i][3])) {
                        b4++;
                    }
                    if (arr.Valores[i][l].Res.equals(arr.Op[i][4])) {
                        b5++;
                    }

                    if (l == (p - 1)) {
                        model.set(arr.Op[i][0], b1);
                        model.set(arr.Op[i][1], b2);
                        model.set(arr.Op[i][2], b3);
                        model.set(arr.Op[i][3], b4);
                        model.set(arr.Op[i][4], b5);
                    }
                }
            }
        }*/