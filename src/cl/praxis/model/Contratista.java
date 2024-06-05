package cl.praxis.model;

public class Contratista extends Empleado{

    private double salarioPorProyecto;

    public Contratista() {

    }

    public Contratista(String nombre, String id, double salario, double salarioPorProyecto) {
        super(nombre, id, salario);
        this.salarioPorProyecto = salarioPorProyecto;
    }

    @Override
    public double calcularSalario() {
        return salarioPorProyecto;
    }
}
