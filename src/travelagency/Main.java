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
        while (!exit) { //Se crea un ciclo para repetir el menú las veces que el usuario lo desee

            try { //Se coloca un Try catch para intentar capturar las posibles fallas
                
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

                switch (opMainMenu) { //Se crea un switch para cada una de las posibles opciones del menú

                    case 1:

                        System.out.println("**Seleccione la acción que desea realizar**");
                        System.out.println("1. Insertar");
                        System.out.println("2. Eliminar");
                        System.out.println("3. Buscar");
                        System.out.println("4. Modificar");
                        System.out.println("5. Ver");
                        int opRecruitmentMenu = scan.nextInt();
                        System.out.println("");

                        switch (opRecruitmentMenu) { //Se crea un switch para cada una de las posibles opciones del menú

                            case 1:

                                System.out.println("Ingrese la cantidad de personas a registrar: ");
                                int amountOfPeople = scan.nextInt();
                                registration = new Person[amountOfPeople];

                                for (int i = 0; i < registration.length; i++) {
                                    registration[i] = createPerson(); //Se llama el metodo para crear personas
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
                                removePerson(); //Se llama el metodo para eliminar personas
                                break;

                            case 3:
                                searchPerson(); //Se llama el metodo para buscar personas
                                break;

                            case 4:
                                modifyPerson(); //Se llama el metodo para modificar personas

                                break;

                            case 5: //Case para ver las personas registradas
                                
                                System.out.println("***Personas registradas***");
                                
                                //Se imprime el registro de personas 
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
                System.out.println("El valor ingresado es un dato erroneo");
  
            }
        }

    }

    public static Person[] callRegistration() { //Se crea el metodo llamar registro
        Person[] test = registration;
        return test;

    }

    public static Person createPerson() { //Se crea el metodo cretePersons para el registro de las personas
        System.out.println("");
        System.out.println("Digite los datos de la persona a registrar");
        Scanner scan = new Scanner(System.in);

        //Se solicitan y leen los datos necesarios para crear el usuario de la persona
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

        //Se crea una instacnia donde se guardan los atrubutos anteriormente solicitados
        Administrative admin = new Administrative(position, identification, name,
                lastName, direction, telephone, schedule);

        return admin; //Se retorna la instancia

    }

    public static void removePerson() { //Se crea el metodo removePerson para eliminar a alguna persona del registro

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite la cedula de la persona que desea eliminar");
        String identification = scan.next();

        for (int j = 0; j < registration.length; j++) { //Se crea un ciclo para recorrer el registo
//            int a = Integer.parseInt(identification); 
            if (identification.equals(registration[j].getIdentification())) { //Se crea una condición para eliminar al numero de cedula seleccionado
                registration[j] = null;

//               
//                System.out.println("Persona eliminada");
//                System.out.println(registration[j].getCedula()+ "correcto");
            } else {
                System.out.println("La persona no se encontro en la base de datos");
            }

        }

    }

    public static void searchPerson() { //Se crea el metodo searchPerson para buscar a una persona

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite la cedula de la persona que desea buscar");
        String identification = scan.nextLine();

        for (int j = 0; j < registration.length; j++) { //Se crea un ciclo para recorrer el registo

            if (identification.equals(registration[j].getIdentification())) { //Se crea una condición para buscar al numero de cedula seleccionado
                System.out.println("La persona se encuentra en el registro ");

                System.out.println("El nombre de la persona es " + registration[j].getName());
                System.out.println("El apellido de la persona es " + registration[j].getLastName());

            } else {
                System.out.println("La persona no se encuentra registrada");
            }

        }

    }

    public static void modifyPerson() { //Se crea el metodo modifyPerson para modificar alguna persona

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite la cedula de la persona que desea modificar");
        String identification = scan.next();

        for (int j = 0; j < registration.length; j++) {//Se crea un ciclo para recorrer el registo
            if (identification.equals(registration[j].getIdentification())) { //Se crea una condición para modificar la persona seleccionada
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
