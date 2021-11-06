/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelagency;

import daughterClasses.Administrative;
import Formularios.Paying;
import java.util.Scanner;
import javafx.scene.control.Alert;
import superclasess.Person;
import static travelagency.Main.registration;

/**
 *
 * @author jazmi
 */
public class Main {

    static Person[] registration;
    Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {

            try {
                System.out.println("");
                System.out.println("***Bienvenido al Sistema de recursos Humanos***");
                System.out.println("");
                System.out.println("A continuación seleccione una las opciones del menú");
                System.out.println("1. Contratación de personal");
                System.out.println("2. Pago de planilla");
                System.out.println("3. Salir");
                Scanner scan = new Scanner(System.in);
                int opMainMenu = scan.nextInt();
                System.out.println("");

                switch (opMainMenu) {

                    case 1:

                        System.out.println("**Seleccione la acción que desea realizar**");
                        System.out.println("1. Insertar");
                        System.out.println("2. Eliminar");
                        System.out.println("3. Buscar");
                        System.out.println("4. Modificar");
                        System.out.println("5. Ver");
                        int opRecruitmentMenu = scan.nextInt();
                        System.out.println("");

                        switch (opRecruitmentMenu) {

                            case 1:

                                System.out.println("Ingrese la cantidad de personas a registrar: ");
                                int amountOfPeople = scan.nextInt();
                                registration = new Person[amountOfPeople];

                                for (int i = 0; i < registration.length; i++) {
                                    registration[i] = createPerson();
                                }

                                System.out.println("");
                                System.out.println("***Personas registradas***");

                                for (int i = 0; i < registration.length; i++) {
                                    if (registration[i] instanceof Administrative) {
                                        Administrative administrative = (Administrative) registration[i];
                                        System.out.println(administrative);
                                        System.out.println("FFFFFFFFFFFFFFFFF");
                                    }

                                }
                                break;

                            case 2:
                                removePerson();
                                break;

                            case 3:
                                searchPerson();
                                break;

                            case 4:
                                modifyPerson();

                                break;

                            case 5: //VER
                                System.out.println("***Personas registradas***");

                                for (int i = 0; i < registration.length; i++) {
                                    if (registration[i] instanceof Administrative) {
                                        Administrative administrative = (Administrative) registration[i];
                                        System.out.println(administrative);
                                    }

                                }
                                break;

                        }

                        break;

                    case 2:
                        Paying pg = new Paying();
                        pg.setVisible(true);
                        break;
                    case 3:
                        System.exit(0);
                        break;

                }
            } catch (Exception e) {
                System.out.println("El valor ingresado es u dato erroneo");
  
            }
        }

    }

    public static Person[] callRegistration() {
        Person[] test = registration;
        return test;

    }

    public static Person createPerson() {
        System.out.println("");
        System.out.println("Digite los datos de la persona a registrar");
        Scanner scan = new Scanner(System.in);

        System.out.println("Cedula: ");
        String identification = scan.next();
        System.out.println("Nombre: ");
        String name = scan.next();
        System.out.println("Apellido: ");
        String lastName = scan.next();
        System.out.println("Dirección: ");
        String direction = scan.next();
        System.out.println("Teléfono: ");
        String telephone = scan.next();
        System.out.println("Horario: ");
        String schedule = scan.next();
        System.out.println("Puesto: ");
        String position = scan.next();
        System.out.println("");

        Administrative admin = new Administrative(position, identification, name,
                lastName, direction, telephone, schedule);

        return admin;

    }

    public static void removePerson() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite la cedula de la persona que desea eliminar");
        String identification = scan.next();

        for (int j = 0; j < registration.length; j++) {
            int a = Integer.parseInt(identification);
            if (identification.equals(registration[j].getIdentification())) {
                registration[j] = null;

//               
//                System.out.println("Persona eliminada");
//                System.out.println(registration[j].getCedula()+ "correcto");
            } else {
                System.out.println("La persona no se encontro en la base de datos");
            }

        }

    }

    public static void searchPerson() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite la cedula de la persona que desea buscar");
        String identification = scan.nextLine();

        for (int j = 0; j < registration.length; j++) {

            if (identification.equals(registration[j].getIdentification())) {
                System.out.println("La persona se encuentra en el registro ");

                System.out.println("El nombre de la persona es " + registration[j].getName());
                System.out.println("El apellido de la persona es " + registration[j].getLastName());

            } else {
                System.out.println("La persona no se encuentra registrada");
            }

        }

    }

    public static void modifyPerson() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite la cedula de la persona que desea modificar");
        String identification = scan.next();

        for (int j = 0; j < registration.length; j++) {
            if (identification.equals(registration[j].getIdentification())) {
                System.out.println("Digite el nuevo nombre de la persona que desea modificar");
                String name = scan.next();
                System.out.println("Digite el nuevo apellido de la persona que desea modificar");
                String lastName = scan.next();
                registration[j].setName(name);
                registration[j].setLastName(lastName);

            } else {
                System.out.println("La persona no fue encontrada");
            }

        }

    }

}
