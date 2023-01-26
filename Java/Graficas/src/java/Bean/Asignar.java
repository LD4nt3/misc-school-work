/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.ObtDatos;
import Model.ObjTabla;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import org.primefaces.model.chart.BarChartModel;

/**
 *
 * @author Rembrandt
 */
@Named("Asignar")
@ViewScoped
public class Asignar {
    private BarChartModel barModel;
    
 public BarChartModel getBarModel() {
        return barModel;
    }
 
 public void setBarModel (BarChartModel barModel)
 {
     this.barModel = barModel;
 }
 public void listar()
 {
     ObtDatos dao;
     List<ObjTabla> lista;
     try {
        dao = new ObtDatos();
        lista = dao.listar();
        graficar(lista);
         } catch (Exception e)
         {
             
         }
     finally{
         
     }
 }
 
     private void graficar(List<Respuestas> lista)
     {
         barModel = new BarChartModel();
         
         for(Respuestas res : lista)
         {
             barModel.set(res.getRespuesta(), res.get());//lA CANTIDAD DE RESPUESTA QUE HAY 'X'
         }
         barModel.setTitle("Resultado");
         barModel.setLegendPosition("w");
         
     }
 }

