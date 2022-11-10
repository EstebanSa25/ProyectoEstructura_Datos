
package proyecto_estructura;

import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import proyecto_estructura.Medicamentos;
/**
 *
 * @author PC-Programar
 */
public class Pacientes {
     Medicamentos _medicamentos=new Medicamentos();
//    Medicamentos _medicamentos =new Medicamentos();
    String nombre;
    int Medicamentos_Paciente=0;
    LinkedList<String>Pacientes = new LinkedList<String>();
     public LinkedList<String>Medicinas = new LinkedList<String>();
    public Pacientes (){
    this.nombre="";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _Nombre) {
        this.nombre = nombre;
    }

    public LinkedList<String> getPacientes() {
        return Pacientes;
    }

    public void setPacientes(LinkedList<String> Pacientes) {
        this.Pacientes = Pacientes;
    }
       public void AgregarPaciente(String nombre,LinkedList Medicinas){
           if(Pacientes.contains(nombre)){
           }
         Pacientes.add(nombre+": "+Medicinas+"\n");
    }   

    public LinkedList<String> getMedicinas() {
        return Medicinas;
    }

    public void setMedicinas(LinkedList<String> Medicinas) {
        this.Medicinas = Medicinas;
    }
       
       
       
  public LinkedList<String> IngresarMedicamentos(LinkedList Medicamento_receta) {
        String menu = "s";
        do {
            String medicina = JOptionPane.showInputDialog("Ingrese el medicamento\nDisponibles: "+Medicamento_receta);
            String busqueda = medicina;
		boolean existe = Medicamento_receta.contains(busqueda);
                if(existe==false){
                   JOptionPane.showMessageDialog(null,"El elemento no existe");
                }else{
                 if(Medicinas.contains(medicina)){
                 JOptionPane.showMessageDialog(null,"Ya este medicamento se le asigno a este paciente");
                 }else{
                 Medicinas.add(medicina);
                 
                 }
                  menu = JOptionPane.showInputDialog("Desea ingresar otro medicamento s - n");
        } 
        }while (menu.equals("s"));
        return (LinkedList<String>) Medicinas;
    }
   public LinkedList<String> BorrarMedicamentos() {
        int num1;
          String conc="";
         for (int i = 0; i < Medicinas.size(); i++) {  
             conc+="\n";
                conc+=i+" - "+Medicinas.get(i);
                }
         num1=Integer.parseInt(JOptionPane.showInputDialog(conc+"\nDigite el numero del medicamento que desea borrar"));
         Medicinas.remove(num1);
         return (LinkedList<String>) Medicinas;
    }
    
}
