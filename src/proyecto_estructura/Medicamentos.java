package proyecto_estructura;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author PC-Programar
 */
public class Medicamentos {
   private String Nombre;
   LinkedList<String>Medicamentos = new LinkedList<String>();
 
 public Medicamentos (){
     this.Nombre=Nombre;
 }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public LinkedList<String> getMedicamentos() {
        return Medicamentos;
    }

    public void setMedicamentos(LinkedList<String> Medicamentos) {
        this.Medicamentos = Medicamentos;
    }
 public void AgregarMedicamentos(){
  this.Nombre=(JOptionPane.showInputDialog("Introduce el nombre del medicamento"));
 String busqueda = this.Nombre;
boolean existe = Medicamentos.contains(busqueda);
if(existe==true){
JOptionPane.showMessageDialog(null,"El elemento ya se registro");
}else{
Medicamentos.add(this.Nombre);
 this.setMedicamentos(Medicamentos);
 JOptionPane.showMessageDialog(null,"Medicamento registrado correctamente");
  
}
 
 }
 public int CantidadMedicamentos(){
 return Medicamentos.size()+1;
 }
}
