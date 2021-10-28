/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelagency;

import daughterClasses.Administrative;
import java.util.Scanner;
import superclasess.Person;

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
        
        System.out.println("******Bienvemido al Sistema de recursos Humanos******");
        System.out.println("");
        System.out.println("A continuación seleccione una las opciones del menú");
        System.out.println("1. Contratación");
        System.out.println("2. Pago de planilla");
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
                        System.out.println("***Personas***");
                        
                        for (int i = 0; i < registro.length; i++) {
                            if (registro[i] instanceof Administrative) {
                                Administrative administrative = (Administrative) registro[i];
                                System.out.println(administrative.getPuesto());
                            }

                        }
                        break;
                        
              
                }

                break;

    }
        
    }
    
    

    public static Person crearPersona() {

        System.out.println("1. Crear Administrativo ");
        System.out.println("2. Crear ");
        Scanner scan = new Scanner(System.in);
        int opCrearPersona = scan.nextInt();

        switch (opCrearPersona) {

            case 1: {
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

                Administrative admin = new Administrative(puesto, cedula, nombre,
                        apellido, direccion, telefono, horario);

                return admin;

            
            
            }
            default:
                System.out.println("Ingrese una opción correcta");
                break;

        }

        return null;
    }

}
