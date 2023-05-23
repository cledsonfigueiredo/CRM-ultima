package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("315.658.652-04","Rafaela.com", "Rafaela dias",
                'F');

        System.out.println(cliente.toString());
        Cliente clienteM = new Cliente("315.658.652-04","Rafael.com", "Rafael dias",
                'M');
        System.out.println(clienteM.toString());
    }
}