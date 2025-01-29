import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller emCon = new EmpleadoContoller();
        boolean result = emCon.addEmpleado(new Empleado(1, "Pablo", "senor"));
        System.out.println("Ingreso: "+result);
        boolean result1 = emCon.addEmpleado(new Empleado(1, "Pablo", "senor"));
        System.out.println("Ingreso: "+result1);

        emCon.addEmpleado(new Empleado(1, "Pablo", "senior"));
        emCon.addEmpleado(new Empleado(2, "Juan", "senior"));
        emCon.addEmpleado(new Empleado(3, "Andres", "senior"));

        System.out.println("Lista de empleados");
        emCon.displayEmpleados();

        System.out.println("Solo Nombre:");
        emCon.displayEmpleadoNombre();

        System.out.println("Solo Llaves:");
        emCon.displayEmpleadoKey();

        System.out.println("Solo Empleados");
        emCon.displayEmpleados();
    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
