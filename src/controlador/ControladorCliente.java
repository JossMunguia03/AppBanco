/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Tarjeta;

/**
 *
 * @author Fer Quijano
 * 
 */
public class ControladorCliente {
    private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private static int codigoAuto = 1;
    
    
    public static Cliente buscar(int codigo){
        
        for(Cliente cliente: listaClientes){
           if(cliente.getIdCliente()== codigo)
               return cliente;
        }
        return null;
    }
    
    
    public static Cliente buscar(String nombre){
        
        for(Cliente cliente: listaClientes){
           if(cliente.getNombre().toLowerCase().contains(nombre))
               return cliente;
        }
        return null;
    }
    
   
    public static int buscar(Cliente cliente){
        return listaClientes.indexOf(cliente);
    }
    
    
    public static void agregar(String nombre, String direccion,
                    String email, Double saldo, long celular, Tarjeta tarjeta){
     // llama el constructor de la clase cliente con el codigo autogenerado
     // y lo postincrementa (++)
        Cliente clienteNuevo = new Cliente(
                codigoAuto++, nombre, direccion, email, saldo, celular, tarjeta
        );
        listaClientes.add(clienteNuevo);
    }
    
    
    public static void editar(int id,Cliente cliente){
    
        listaClientes.set(id, cliente);
    }
    
    
    public static String[] listar(){
        String[] clientes = new String[listaClientes.size()];
        int id = 0;
        // for mejorado o foreach
        for(Cliente cliente: listaClientes){
          clientes[id] = cliente.getNombre();
          id++;
        }
        return clientes;
    }

    
    public static void eliminar(Cliente cliente) {
        listaClientes.remove(cliente);
    }
    
    
}
