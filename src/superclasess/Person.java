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
    
        // Se crean los atrubutos principales de la clase persona
        private String identification; //nos permite guardar la identifación de la persona
        private String name; //nos permite guardar el nombre de la persona
        private String lastName; //nos permite guardar el apellido de la persona
        private String direction; //nos permite guardar la dirección de la persona
        private String telephone; //nos permite guardar lel telefono de la persona
        private String schedule; //nos permite guardar el horario de la persona

        /**
         * Sirve para guardar los datos de identification, name, lastName,direction,telephone y schedule
         * @param identification
         * @param name
         * @param lastName
         * @param direction
         * @param telephone
         * @param schedule 
         */
    public Person(String identification, String name, String lastName, String direction,
            String telephone, String schedule) {
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.direction = direction;
        this.telephone = telephone;
        this.schedule = schedule;
    }

    public Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        /**
         * @return the identification
         */
        public String getIdentification() {
            return identification;
        }

        /**
         * @param identification the identification to set
         */
        public void setIdentification(String identification) {
            this.identification = identification;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return the lastName
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * @param lastName the lastName to set
         */
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        /**
         * @return the direction
         */
        public String getDirection() {
            return direction;
        }

        /**
         * @param direction the direction to set
         */
        public void setDirection(String direction) {
            this.direction = direction;
        }

        /**
         * @return the telephone
         */
        public String getTelephone() {
            return telephone;
        }

        /**
         * @param telephone the telephone to set
         */
        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        /**
         * @return the schedule
         */
        public String getSchedule() {
            return schedule;
        }

        /**
         * @param schedule the schedule to set
         */
        public void setSchedule(String schedule) {
            this.schedule = schedule;
        }

        @Override // Se escriben los textos y las variables que se quieren imprimir
        public String toString() {
            return "\nNombre: " + this.name+ "\nApellido: "+this.lastName  
                    +"\nCédula: " + this.identification + "\nDirección: " + this.direction +
                    "\nTelefono: " + this.telephone + "\nHorario: " + this.schedule;
        }
}

