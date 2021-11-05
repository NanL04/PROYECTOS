/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelagency;

import daughterClasses.Administrative;
import daughterClasses.Pago;
import java.util.Scanner;
import superclasess.Person;
import static travelagency.Main.registro;

/**
 *
 * @author jazmi
 */
public class Main {
    
    static Person registro[];
    Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("");
            System.out.println("***Bienvemido al Sistema de recursos Humanos***");
            System.out.println("");
            System.out.println("A continuación seleccione una las opciones del menú");
            System.out.println("1. Contratación de personal");
            System.out.println("2. Pago de planilla");
            System.out.println("3. Salir");
            Scanner scan = new Scanner(System.in);
            int opMenuPrincipal = scan.nextInt();
            System.out.println("");

            switch (opMenuPrincipal) {

                case 1:

                    System.out.println("**Seleccione la acción que desea realizar**");
                    System.out.println("1. Insertar");
                    System.out.println("2. Eliminar");
                    System.out.println("3. Buscar");
                    System.out.println("4. Modificar");
                    System.out.println("5. Ver");
                    int opMenuContratacion = scan.nextInt();
                    System.out.println("");

                    switch (opMenuContratacion) {

                        case 1:

                            System.out.println("Ingrese la cantidad de personas a registrar: ");
                            int cantidadPersona = scan.nextInt();
                            registro = new Person[cantidadPersona];

                            for (int i = 0; i < registro.length; i++) {
                                registro[i] = crearPersona();
                            }

                            System.out.println("");
                            System.out.println("***Personas registradas***");

                            for (int i = 0; i < registro.length; i++) {
                                if (registro[i] instanceof Administrative) {
                                    Administrative administrative = (Administrative) registro[i];
                                    System.out.println(administrative);
                                }

                            }
                            break;

                        case 2:
                                //ELIMINAR
                            
                            for (int i = 0; i < registro.length; i++) {
//                                registro[i] = eliminarPersona();
                            }
                            break;
                            
                        case 3:
                                //BUSCAR
                            break;
                            
                        case 4: 
                                //MODIFICAR
                            break;
                            
                        case 5: //VER
                            System.out.println("***Personas registradas***");

                            for (int i = 0; i < registro.length; i++) {
                                if (registro[i] instanceof Administrative) {
                                    Administrative administrative = (Administrative) registro[i];
                                    System.out.println(administrative);
                                }

                            }
                            break;

                    }

                    break;
                    
                case 2:
                    Pago pg = new Pago();
                    pg.setVisible(true);
                    break;
                case 3:
                      System.exit(0);
                    break;

            }

        }
    }
    public static Person[] llamarRegistro(){
        Person[] prueba = registro;
        return prueba;
        
    }

    public static Person crearPersona() {
        System.out.println("");
        System.out.println("Digite los datos de la persona a registrar");
        Scanner scan = new Scanner(System.in);

        System.out.println("Cedula: ");
        String cedula = scan.next();
        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Apellido: ");
        String apellido = scan.next();
        System.out.println("Dirección: ");
        String direccion = scan.next();
        System.out.println("Teléfono: ");
        String telefono = scan.next();
        System.out.println("Horario: ");
        String horario = scan.next();
        System.out.println("Puesto: ");
        String puesto = scan.next();
        System.out.println("");
        Administrative admin = new Administrative(puesto, cedula, nombre,
                apellido, direccion, telefono, horario);

        return admin;

    }
//    public static Person eliminarPersona() {
//       
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Digite el nombre de la persona que desea eliminar");
//        String cedula = scan.next();
//        for (int j=0; j< registro.length; j++){
//            if (cedula == registro[j]){
//            }
//           
//        return null;
//
//    }
// 
//
//}
}