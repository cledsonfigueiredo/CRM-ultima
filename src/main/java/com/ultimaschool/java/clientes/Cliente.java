package com.ultimaschool.java.clientes;

public class Cliente {
    private String cpf;
    private String email;
    private String nomeCompleto;
    private char genero;

    public Cliente(String cpf,String email,String nomeCompleto,char genero){
        this.cpf = cpf;
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.genero = genero;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String novoCpf){
        this.cpf = novoCpf;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
   private String tratamentoGenero(){
        if (getGenero()== 'M'){
            return "Sr.";

        } else if (getGenero() == 'f'){

            return "Sra.";
        } else {
            return "";
        }
    }

    public String toString(){
        return "Sra." +getNomeCompleto() + " " +
                getCpf() + "e e-email " +
                getEmail() + " " +
                getGenero();
    }
}
