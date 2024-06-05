package cl.praxis.model;

public abstract class Empleado {

    protected String nombre;
    protected String id;
    protected double salario;

    public Empleado()
    {

    }

    public Empleado(String nombre, String id, double salario)
    {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    public abstract double calcularSalario();
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", ID: " + id + ", Salario Base: " + salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


