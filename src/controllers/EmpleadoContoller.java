package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private HashMap<Integer, Empleado> empleados;

    public EmpleadoContoller() {
       empleados = new HashMap<>();
    }

    public boolean addEmpleado(Empleado empleado){
        if(empleado == null	|| empleados.containsKey(empleado.getId())){
            return false;
        }
        empleados.put(empleado.getId(), empleado);

        return true;
    }

    public Empleado getEmpleado(int id){
        return empleados.get(id);
    }

    public void displayEmpleado(){
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getKey() + " " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadoNombre(){
        for(Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()){
            System.out.println(empleadoEntry.getKey() + " " + empleadoEntry.getValue());
        }
    }
}