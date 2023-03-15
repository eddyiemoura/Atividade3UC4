/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Heisenberg
 */
public class Pacientes {
    private String nome;
    private String telefone;
    private String cpf;
    private String data;
    private String ePaciente;
    private String consultaR;
    private String observacoes;
    
    public Pacientes(){
        
    }


    public Pacientes(String nome, String telefone, String cpf, String data, String ePaciente, String consultaR, String observacoes) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data = data;
        this.ePaciente = ePaciente;
        this.consultaR = consultaR;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getePaciente() {
        return ePaciente;
    }

    public void setePaciente(String ePaciente) {
        this.ePaciente = ePaciente;
    }

    public String getConsultaR() {
        return consultaR;
    }

    public void setConsultaR(String consultaR) {
        this.consultaR = consultaR;
    }
    
    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    
}
