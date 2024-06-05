package cl.praxis.model;

public class ProcesadorEmpleados {

    public void procesar(Empleado empleado){
        empleado.mostrarDetalles();
        double salario = empleado.calcularSalario();
        System.out.println("Salario Calculado: "+salario);

    }
}
