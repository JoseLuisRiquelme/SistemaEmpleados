package cl.praxis.model;

public class EmpleadoTiempoParcial extends Empleado{

    private double salarioPorHora;
    private int numeroHorasTrabajadas;

    public EmpleadoTiempoParcial() {

    }

    public EmpleadoTiempoParcial(String nombre, String id, double salario, double salarioPorHora, int numeroHorasTrabajadas) {
        super(nombre, id, salario);
        this.salarioPorHora = salarioPorHora;
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

   /*@Override
    public double calcularSalario(double salarioPorHora,int numeroHorasTrabajadas) {

        double salarioCalculado= salarioPorHora*numeroHorasTrabajadas;
        return salarioCalculado;
    }*/

    @Override
    public double calcularSalario() {
        return salarioPorHora*numeroHorasTrabajadas;
    }
}
