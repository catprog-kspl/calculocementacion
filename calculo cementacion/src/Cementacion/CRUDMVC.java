
package Cementacion;

import Controlador.CtrlDatos;
import Modelo.Datos;
import Vista.FrmCapturaDatos;
import Vista.FrmDatosAlumnos;
import Vista.FrmDatosFinal;
import Vista.FrmMenu;



public class CRUDMVC {


    public static void main(String[] args) {
     FrmCapturaDatos frmD = new FrmCapturaDatos();
     FrmDatosFinal frmF = new FrmDatosFinal();
     FrmMenu frmM = new FrmMenu();
     FrmDatosAlumnos frmDA = new FrmDatosAlumnos();
     Datos mod = new Datos();
     CtrlDatos ctrlD = new CtrlDatos(mod, frmD, frmF, frmM, frmDA);
     ctrlD.iniciarMenu();
       
        
    }
    
}
