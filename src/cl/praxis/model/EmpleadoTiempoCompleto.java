package cl.praxis.model;

public class EmpleadoTiempoCompleto extends Empleado{


    public EmpleadoTiempoCompleto() {

    }

    public EmpleadoTiempoCompleto(String nombre, String id, double salario) {
        super(nombre, id, salario);
    }


    @Override
    public double calcularSalario() {
        return salario;
    }

}
