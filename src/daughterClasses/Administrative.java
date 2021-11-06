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
    private String position;

    public Administrative(String position, String identification, String name, String lastName, String direction, String telephone, String schedule) {
        super(identification, name, lastName, direction, telephone, schedule);
        this.position = position;
    }



@Override
    public String toString() {
        return super.toString()+"\nPuesto: "+this.getPosition();
    }



    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

}
