
package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Paciente> _pacientes;

    public Clinica() {
        _pacientes = new ArrayList<>();
        
        _pacientes.add(new Paciente("Tomas","Gutierrez",20,10,false));
        _pacientes.add(new Paciente("Gastomn","Guiñ",30,10,true));
        _pacientes.add(new Paciente("Eze","Coly",40,20,false));
        _pacientes.add(new Paciente("Mateo","Messi",45,10,true));
        _pacientes.add(new Paciente("Angel","Di Maria",10,20,false));
        _pacientes.add(new Paciente("Miguel","Corra",45,10,true));
        _pacientes.add(new Paciente("Axel","Donofrio",12,15,true));
    }
    
    public void agregarPâciente(Paciente newPaciente){
        if(newPaciente != null){
            _pacientes.add(newPaciente);
        }
    }
    
    public Paciente[] obtenerTodos(){
        return _pacientes.toArray(new Paciente[_pacientes.size()]);
    }
    
    
    
}
