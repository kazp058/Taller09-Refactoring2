import java.util.ArrayList;
import java.util.List;

public class SistemaAtencionMedico {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<ServicioMedico> serviciosMedicos;

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        serviciosMedicos.add(servicioMedico);
    }

    public void agendarConsulta(Paciente paciente, Consulta consulta){
        double costoConsulta = consulta.getServicioMedico().getCosto();
        int edadPaciente = paciente.getEdad();
        costoConsulta = calcularValorFinalConsulta(consulta,paciente);
        System.out.println("Se han cobrado "+ costoConsulta+ " dolares de su tarjeta de credito");
        paciente.historialMedico.getConsultas().add(consulta); //Hacer esto es incorrecto
    }

    public double calcularValorFinalConsulta(Consulta consulta, Paciente paciente){
        double valorARestar = 0;
        double costoConsulta = consulta.getServicioMedico().getCosto();
        if(edadPaciente>=65){
            valorARestar = costoConsulta*0.25; //0.25 es el descuento para adultos mayores
        }
        return costoConsulta - valorARestar;
    }

    public Object obtener(Class classObject, name){
        if(classObject == null) return null;
        if(classObject.class == Paciente.class
        || classObject.class == ServicioMedico.class
        || classObject.class == Medico.class){
            if (classObject.getNombre().equals(name))
                return result;
        }
        return null;
    } 
}
