
package Controlador;
import Modelo.Datos;
import Vista.FrmCapturaDatos;
import Vista.FrmDatosAlumnos;
import Vista.FrmDatosFinal;
import Vista.FrmMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class CtrlDatos implements ActionListener{
    private Datos mod;
    private FrmCapturaDatos frmD;
    private FrmDatosFinal frmF;
    private FrmMenu frmM;
    private FrmDatosAlumnos frmDA;
    float pi=3.1416f;
    float pulgada=2.54f;
    public CtrlDatos(Datos mod, FrmCapturaDatos frmD, FrmDatosFinal frmF, FrmMenu  frmM, FrmDatosAlumnos frmDA){
        this.mod=mod;
        this.frmF=frmF;
        this.frmD=frmD;
        this.frmM=frmM;
        this.frmDA=frmDA;
        this.frmD.btnCalcular.addActionListener(this);
        this.frmD.btnRegresar.addActionListener(this);
        this.frmD.btnSalir.addActionListener(this);
        this.frmF.btnRegresar.addActionListener(this);
        this.frmF.btnSalir.addActionListener(this);
        this.frmM.btnRealizarCalculo.addActionListener(this);
        this.frmM.btnAc.addActionListener(this);
        this.frmM.btnSalir.addActionListener(this);
        this.frmDA.btnRegresarDa.addActionListener(this);
 
        
    }

    @Override
    public void actionPerformed(ActionEvent e){
       if(e.getSource()== frmD.btnCalcular) {
           if(frmD.txtDiametroB.getText().isEmpty()) {
               JOptionPane.showMessageDialog(frmD, "Ingrese el valor del diámetro de la barrena","Sistema",JOptionPane.ERROR_MESSAGE);
               frmD.txtDiametroB.requestFocus();
           }else if(!validarNumeros(frmD.txtDiametroB.getText().trim())){
               JOptionPane.showMessageDialog(frmD, "Ingrese el valor de tipo numérico del diámetro de la barrena","Sistema",JOptionPane.ERROR_MESSAGE);     
               frmD.txtDiametroB.requestFocus();
           }else if(frmD.txtDiametroE.getText().isEmpty()){
            JOptionPane.showMessageDialog(frmD, "Ingrese el valor del diametro Externo","Sistema",JOptionPane.ERROR_MESSAGE);
           frmD.txtDiametroE.requestFocus();
           }else if(!validarNumeros(frmD.txtDiametroE.getText().trim())){
               JOptionPane.showMessageDialog(frmD, "Ingrese el valor de tipo numérico del diámetro externo","Sistema",JOptionPane.ERROR_MESSAGE);   
               frmD.txtDiametroE.requestFocus();
           }else if(frmD.txtDiametroInterno.getText().isEmpty()){
               JOptionPane.showMessageDialog(frmD, "Ingrese el valor del diametro interno","Sistema",JOptionPane.ERROR_MESSAGE);
               frmD.txtDiametroInterno.requestFocus();
           }else if(!validarNumeros(frmD.txtDiametroInterno.getText().trim())){
               JOptionPane.showMessageDialog(frmD, "Ingrese el valor de tipo numérico del diámetro interno","Sistema",JOptionPane.ERROR_MESSAGE);   
               frmD.txtDiametroInterno.requestFocus();
           }else if(frmD.txtAlturaTapon.getText().isEmpty()){
                JOptionPane.showMessageDialog(frmD, "Ingrese el valor de la altura del tapón","Sistema",JOptionPane.ERROR_MESSAGE);
                frmD.txtAlturaTapon.requestFocus();
           }else if(!validarNumeros(frmD.txtAlturaTapon.getText().trim())){
               JOptionPane.showMessageDialog(frmD, "Ingrese el valor de tipo numérico de la altura del tapón","Sistema",JOptionPane.ERROR_MESSAGE);   
               frmD.txtAlturaTapon.requestFocus();
           }else if(frmD.txtAlturaFondo.getText().isEmpty()){
              JOptionPane.showMessageDialog(frmD, "Ingrese el valor de la altura del fondo","Sistema",JOptionPane.ERROR_MESSAGE); 
              frmD.txtAlturaFondo.requestFocus();
           }else if(!validarNumeros(frmD.txtAlturaFondo.getText().trim())){
               JOptionPane.showMessageDialog(frmD, "Ingrese el valor de tipo numérico de la altura de fondo","Sistema",JOptionPane.ERROR_MESSAGE);   
               frmD.txtAlturaFondo.requestFocus();
           }else if(frmD.txtAsentamiento.getText().isEmpty()){
               JOptionPane.showMessageDialog(frmD, "Ingrese el valor de la altura del asentamiento","Sistema",JOptionPane.ERROR_MESSAGE);
               frmD.txtAsentamiento.requestFocus();
           }else if(!validarNumeros(frmD.txtAsentamiento.getText().trim())){
               JOptionPane.showMessageDialog(frmD, "Ingrese el valor de tipo numérico de la altura del asentamiento","Sistema",JOptionPane.ERROR_MESSAGE);   
               frmD.txtAsentamiento.requestFocus();
           }else{
               
           
            mod.setDiametroBarrena(Float.parseFloat(frmD.txtDiametroB.getText()));
            mod.setDiametroExterno(Float.parseFloat(frmD.txtDiametroE.getText()));
            mod.setDiametroInt(Float.parseFloat(frmD.txtDiametroInterno.getText()));
            mod.setAlturaTapon(Float.parseFloat(frmD.txtAlturaTapon.getText()));
            mod.setAlturaFondo(Float.parseFloat(frmD.txtAlturaFondo.getText()));
            mod.setAsentamiento(Float.parseFloat(frmD.txtAsentamiento.getText()));
    
            iniciarDatosFinal();
            frmD.dispose();
           }
            
       }
        if(e.getSource()== frmM.btnRealizarCalculo){
           iniciarCaptura();
         
       }
         if(e.getSource()== frmM.btnAc){
           iniciarDA();
         
       }
       
      if(e.getSource()== frmD.btnRegresar) {
          int rpta = JOptionPane.showConfirmDialog(frmD, "¿Desea regresar a menu?","Sistema",JOptionPane.INFORMATION_MESSAGE);
                        if(rpta==JOptionPane.YES_OPTION){
        frmM.setSize(466,570);
        frmM.setResizable(false);
        frmM.setVisible(true);
        frmM.setLocationRelativeTo(null);
        frmD.dispose();
        limpiar(); 
                
                }
      }
      if(e.getSource()== frmDA.btnRegresarDa) {
          int rpta = JOptionPane.showConfirmDialog(frmD, "¿Desea regresar a menu?","Sistema",JOptionPane.INFORMATION_MESSAGE);
                        if(rpta==JOptionPane.YES_OPTION){
        frmM.setSize(466,570);
        frmM.setResizable(false);
        frmM.setVisible(true);
        frmM.setLocationRelativeTo(null);
        frmDA.dispose();
        limpiar();
                        }
      }
       if(e.getSource()== frmF.btnRegresar) {
           int rpta = JOptionPane.showConfirmDialog(frmF, "¿Desea regresar a menu?","Sistema",JOptionPane.INFORMATION_MESSAGE);
                        if(rpta==JOptionPane.YES_OPTION){
        frmD.setSize(990,530);
        frmD.setResizable(false);
        frmD.setVisible(true);
        frmD.setLocationRelativeTo(null);
        limpiar();
       frmF.dispose();
                        }
       }
         
      if(e.getSource()== frmD.btnSalir) {
          int rpta = JOptionPane.showConfirmDialog(frmD, "¿Desea salir del programa?","Sistema",JOptionPane.INFORMATION_MESSAGE);
                        if(rpta==JOptionPane.YES_OPTION){
                              frmD.dispose();   
                        }
       }
      
      
       if(e.getSource()== frmF.btnSalir){
           int rpta = JOptionPane.showConfirmDialog(frmF, "¿Desea salir del programa?","Sistema",JOptionPane.INFORMATION_MESSAGE);
                        if(rpta==JOptionPane.YES_OPTION){
                              frmF.dispose();
                        }
       }
       if(e.getSource()== frmM.btnSalir){
           int rpta = JOptionPane.showConfirmDialog(frmM, "¿Desea salir del programa?","Sistema",JOptionPane.INFORMATION_MESSAGE);
                        if(rpta==JOptionPane.YES_OPTION){
                              frmM.dispose();
                        }
       }
    }
    public void limpiar(){
          frmD.txtAlturaFondo.setText(null);
          frmD.txtAlturaTapon.setText(null);
          frmD.txtAsentamiento.setText(null);
          frmD.txtDiametroB.setText(null);
          frmD.txtDiametroE.setText(null);
          frmD.txtDiametroInterno.setText(null);
      }      
    public float calculoV1(){
     float  diametroIntM= (((mod.getDiametroInt())/2) * pulgada)/100;
    mod.setV1(((diametroIntM * diametroIntM)*pi)*mod.getAlturaTapon());
    return mod.getV1();
    }
    public float calculoV2(){
   float  diametroBar2= ((mod.getDiametroBarrena()/2) * pulgada)/100 ;
     mod.setV2(((diametroBar2 * diametroBar2)*pi)*mod.getAlturaFondo());
     return mod.getV2();
    }
    public float calculoV3(){
float  diametroBar2= ((mod.getDiametroBarrena()/2) * pulgada)/100 ;
    mod.setV3(((diametroBar2 * diametroBar2)*pi)*mod.getAsentamiento());
    return mod.getV3();
    }
    public float calculoV4(){
     
    float  diametroEx= ((mod.getDiametroExterno()/2) * pulgada)/100 ;
    mod.setV4((((diametroEx * diametroEx)*pi)*(mod.getAsentamiento()+mod.getAlturaFondo())));
    return mod.getV4();
    }
    public float calculoV5(){
    mod.setV5(mod.getV3()-mod.getV4());
    return mod.getV5();
    }
    public float calculoVT(){
    mod.setVT(mod.getV1()+mod.getV2()+mod.getV5());
    return mod.getVT();
    }   
    public float calculoEXC(){

       float valor;
       valor = mod.getVT()*0.20f;
       mod.setExc(mod.getVT() + valor);

       return mod.getExc();
    }
    public void iniciarDatosFinal(){

  DecimalFormat formato1 = new DecimalFormat("#.0000");
             frmF.setSize(1040,570);
             frmF.setResizable(false);
             frmF.setVisible(true);
             frmF.setLocationRelativeTo(null);   

             frmF.txtV1.setText(formato1.format(calculoV1()));
             frmF.txtV2.setText(formato1.format(calculoV2()));
             frmF.txtV3.setText(formato1.format(calculoV3()));
             frmF.txtV4.setText(formato1.format(calculoV4()));
             frmF.txtV5.setText(formato1.format(calculoV5()));
             frmF.txtVT.setText(formato1.format(calculoVT()));
             frmF.txtVE.setText(formato1.format(calculoEXC()));

             frmD.dispose();
 }
    public void iniciarMenu(){
         frmM.setSize(466,570);
         frmM.setResizable(false);
         frmM.setVisible(true);
         frmM.setLocationRelativeTo(null);
    }
    public void iniciarDA(){
        frmDA.setSize(435, 520);
        frmDA.setResizable(false);
        frmDA.setVisible(true);
        frmDA.setLocationRelativeTo(null);
        frmM.dispose();
   }
        public void iniciarCaptura(){
        frmD.setSize(990,530);
        frmD.setResizable(false);
        frmD.setVisible(true);
        frmD.setLocationRelativeTo(null);

        frmM.dispose();
    }
    public static boolean validarNumeros(String datos){
               return datos.matches("[0.00-9.99]*");
              
          }
}
   
    


