/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daughterClasses;

import superclasess.Person;

/**
 *
 * @author jazmi
 */
public class Administrative extends Person {
    private String puesto;

    public Administrative(String puesto, String cedula, String nombre, String apellido, String direccion, String telefono, String horario) {
        super(cedula, nombre, apellido, direccion, telefono, horario);
        this.puesto = puesto;
    }



@Override
    public String toString() {
        return super.toString()+"\nPuesto: "+this.getPuesto();
    }



    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
