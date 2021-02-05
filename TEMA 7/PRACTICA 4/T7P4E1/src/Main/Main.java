package Main;

import Clase.Cliente;
import Clase.Cuenta;
import Clase.PagoRecibo;
import Clase.Transferencia;
import Vista.Inicio;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1gdaw05
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Cliente> listaClientes;
    private Cliente clienteActual;
    
    public static void main(String[] args) {
        try
        {
            listaClientes = new ArrayList();
            datosPrueba();
            abrirInicio();
        }
        catch(Exception e)
        {
            error("ERROR: " + e.getClass() + " " + e.getMessage());
        }
    }
    
    public static void error(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static void datosPrueba() throws Exception{
        listaClientes.add(new Cliente("Pepe", "1234567A", 123456));
        listaClientes.add(new Cliente("IronMan", "7654321B", 654321));
        listaClientes.add(new Cliente("ShinChan", "1122334C", 112233));
        listaClientes.add(new Cliente("Masaho", "1112223", 111222));
        
        listaClientes.get(0).addCuenta(new Cuenta(123456789, 1255.5));
        listaClientes.get(0).addCuenta(new Cuenta(987654321, 1468.5));
        
        listaClientes.get(1).addCuenta(new Cuenta(111222333, 5447));
        listaClientes.get(1).addCuenta(new Cuenta(44455566, 7444));
                
        listaClientes.get(2).addCuenta(new Cuenta(777444777, 6546));
                
        listaClientes.get(3).addCuenta(new Cuenta(123123123, 5555));
        
        listaClientes.get(0).getListaCuentas().get(0).addMovimiento(new Transferencia("Pepe", LocalDate.parse("17/05/2020"), 200)); //formatter para la fecha hara falta
        listaClientes.get(0).getListaCuentas().get(0).addMovimiento(new Transferencia("Adolfo", LocalDate.parse("23/06/2020"), 150));
        listaClientes.get(0).getListaCuentas().get(0).addMovimiento(new PagoRecibo("12345678-A", LocalDate.parse("25/07/2020"), 58));
        listaClientes.get(0).getListaCuentas().get(0).addMovimiento(new Transferencia("Paula", LocalDate.parse("30/09/2020"), 312));
        listaClientes.get(0).getListaCuentas().get(0).addMovimiento(new Transferencia("Jimena", LocalDate.parse("25/12/2020"), 120));
                
        listaClientes.get(0).getListaCuentas().get(1).addMovimiento(new Transferencia("Urko", LocalDate.parse("04/04/2019"), 900));
        listaClientes.get(0).getListaCuentas().get(1).addMovimiento(new PagoRecibo("22115544-Z", LocalDate.parse("25/08/2019"), 68));
        listaClientes.get(0).getListaCuentas().get(1).addMovimiento(new Transferencia("Nahia", LocalDate.parse("13/09/2019"), 500));
        listaClientes.get(0).getListaCuentas().get(1).addMovimiento(new Transferencia("Alan", LocalDate.parse("11/11/2019"), 1000));
                
        listaClientes.get(1).getListaCuentas().get(0).addMovimiento(new Transferencia("Pedro", LocalDate.parse("12/12/2019"), 24));
        listaClientes.get(1).getListaCuentas().get(0).addMovimiento(new Transferencia("Guilito", LocalDate.parse("20/12/2019"), 62));
        listaClientes.get(1).getListaCuentas().get(0).addMovimiento(new PagoRecibo("23232323-W", LocalDate.parse("23/12/2020"), 500));
                
        listaClientes.get(1).getListaCuentas().get(1).addMovimiento(new Transferencia("Julio", LocalDate.parse("22/02/2019"), 1212));
        listaClientes.get(1).getListaCuentas().get(1).addMovimiento(new Transferencia("Miguel", LocalDate.parse("23/03/2019"), 44));
                
        listaClientes.get(2).getListaCuentas().get(0).addMovimiento(new Transferencia("Andre", LocalDate.parse("10/10/2020"), 200));
                
        listaClientes.get(3).getListaCuentas().get(0).addMovimiento(new Transferencia("Ana", LocalDate.parse("30/01/2020"), 310));
        listaClientes.get(3).getListaCuentas().get(0).addMovimiento(new PagoRecibo("41414141-H", LocalDate.parse("12/02/2020"), 21));
        listaClientes.get(3).getListaCuentas().get(0).addMovimiento(new PagoRecibo("77447744-J", LocalDate.parse("23/03/2020"), 211));
        listaClientes.get(3).getListaCuentas().get(0).addMovimiento(new Transferencia("Pedro", LocalDate.parse("12/04/2020"), 444));
        listaClientes.get(3).getListaCuentas().get(0).addMovimiento(new Transferencia("Juan", LocalDate.parse("24/05/2020"), 555));
    }
    
    public static void abrirInicio() throws Exception{
        Inicio init = new Inicio();
        init.setVisible(true);
    }
    
}
