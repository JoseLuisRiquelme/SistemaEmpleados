import cl.praxis.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        empleados.add(new EmpleadoTiempoCompleto("Aurora","123",1500000));
        empleados.add(new EmpleadoTiempoParcial("Julian","563",700000,70000,30));
        empleados.add(new Contratista("Amanda","662",1300000,10000000));

        ProcesadorEmpleados procesador = new ProcesadorEmpleados();

        for(Empleado empleado:empleados){
            procesador.procesar(empleado);
        }

    }
}