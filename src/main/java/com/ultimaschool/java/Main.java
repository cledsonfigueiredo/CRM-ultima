package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente clienteF = new Cliente("Rafa","Figueira", "dias",
                "31555265834", "10/01/1985",  'f',  "rafa@vida.com",
                 "Av Brasil", "(11) 9999-9999");

        System.out.println(clienteF.toString());

        Cliente clienteM = new Cliente("Rebeca","Figueredo", "dias",
                "364152689", "10/01/1983",  'F', "jafa@vida.com",
                 "Av Brasil", "(11) 9999-9999");



        System.out.println(clienteM.toString());
    }
}