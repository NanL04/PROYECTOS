/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superclasess;

/**
 *
 * @author jazmi
 */

public class Person {

        private String cedula;
        private String nombre;
        private String apellido;
        private String direccion;
        private String telefono;
        private String horario;

    public Person(String cedula, String nombre, String apellido, String direccion,
            String telefono, String horario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
    }

    public Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        /**
         * @return the cedula
         */
        public String getCedula() {
            return cedula;
        }

        /**
         * @param cedula the cedula to set
         */
        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        /**
         * @return the nombre
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * @param nombre the nombre to set
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * @return the apellido
         */
        public String getApellido() {
            return apellido;
        }

        /**
         * @param apellido the apellido to set
         */
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        /**
         * @return the direccion
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * @param direccion the direccion to set
         */
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        /**
         * @return the telefono
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * @param telefono the telefono to set
         */
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        /**
         * @return the horario
         */
        public String getHorario() {
            return horario;
        }

        /**
         * @param horario the horario to set
         */
        public void setHorario(String horario) {
            this.horario = horario;
        }

        @Override
        public String toString() {
            return "\nNombre: " + this.nombre+ "\nApellido: "+this.apellido  
                    +"\nCédula: " + this.cedula + "\nDirección: " + this.direccion +
                    "\nTelefono: " + this.telefono + "\nHorario: " + this.horario;
        }
}

