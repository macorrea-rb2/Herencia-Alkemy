package com.alkemy.Grupo3.Entidades.SubEntidades;

import com.alkemy.Grupo3.Entidades.Empleado;
import com.alkemy.Grupo3.Interface.IEmpleado;


public class EmpleadoAsalariado extends Empleado implements IEmpleado {

    private double salarioFijo = 1000.0;


    public EmpleadoAsalariado(String nombre, String apellido, int edad, double ventasBrutas, String numeroSeguroSocial) {
        super(nombre, apellido, edad, ventasBrutas,  numeroSeguroSocial);
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double ingresos(){
        System.out.println("Salario para el empleado: ");
        System.out.println("Salario base: " + getSalarioFijo());
        System.out.println("Ventas: " + getVentasBrutas());
        if (getVentasBrutas() > 10000){
            setTarifaComision(getSalarioFijo() * 0.2);
        }
        System.out.println("Tarifa de comisión: " + getTarifaComision());
        setSalarioFijo(getSalarioFijo() + getTarifaComision());
        return getSalarioFijo();
    }

    @Override
    public String toString() {
        return "Empleado Asalariado = " +
                "nombre: '" + getNombre() + '\'' +
                ", apellido: '" + getApellido() + '\'' +
                ", edad: " + getEdad() +", " +
                ", Numero Social: '" + getNumeroSeguroSocial() + '\'' + " "+
                "Salario a devengar: $"  + ingresos() +
                '.';
    }





}
