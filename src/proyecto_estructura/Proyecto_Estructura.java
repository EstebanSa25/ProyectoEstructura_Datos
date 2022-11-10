/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_estructura;
import java.util.LinkedList;
import java.util.Set;
import proyecto_estructura.Medicamentos;
import proyecto_estructura.Pacientes;
import javax.swing.JOptionPane;
/**
 *
 * @author PC-Programar
 */
public class Proyecto_Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String>Paciente_medicamento = new LinkedList<String>();
        Pacientes _pacientes =new Pacientes();
        String Nombre;
        Medicamentos _medicamentos=new Medicamentos();
     int menu=0;
                        
        do{
           menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenid@"+_pacientes.getNombre()+"\nSelecciona una opcion:\n1-Registrar Paciente\n2-Insertar medicamento al sistema\n3-Mostrar medicamentos disponibles\n4-solicitar medicamentos\n5-Lista de medicamentos del paciente\n6-Eliminar medicamento\n7-Mostrar Pacientes\n8-Salir"));
           switch(menu){//switch
               
               case 1:
               _pacientes.Medicinas.clear(); 
              Nombre=(JOptionPane.showInputDialog("Ingrese el nombre del paciente"));
                _pacientes.nombre=Nombre;
                   break;
                           
               case 2:
                   _medicamentos.AgregarMedicamentos();
                   break;
               case 3:
                   JOptionPane.showMessageDialog(null,"Medicamentos disponibles: "+_medicamentos.Medicamentos);
                   break;
               case 4:
                   _pacientes.IngresarMedicamentos(_medicamentos.Medicamentos);
                   _pacientes.AgregarPaciente(_pacientes.getNombre(),_pacientes.getMedicinas());
                   break;
               case 5:
               JOptionPane.showMessageDialog(null,_pacientes.Medicinas);
                 
                   break;
               case 6:
                      _pacientes.BorrarMedicamentos();
                   break;
               case 7:
                   if(_pacientes.Pacientes.size()==0){
                       JOptionPane.showMessageDialog(null,_pacientes.getNombre()+" No tiene medicamentos \no no se ha registrado un paciente");
                       
                   }else{
                    JOptionPane.showMessageDialog(null,_pacientes.Pacientes);
                   }
 
                   
                   break;
               case 8:
                   System.exit(0);
                   break;
                   
               
           }//switch
        }while(menu!=8);
        
    }//main
    
}//class
