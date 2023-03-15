/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heisenberg
 */
public class ListaPacientes {
    
    private static final List<Pacientes> lista = new ArrayList();
    
    public static List<Pacientes> Listar(){
        return lista;
    }
    
    public static void Adicionar(Pacientes paciente){
        lista.add(paciente);
    }
    
    public static Pacientes getPaciente(int id){
        return lista.get(id);
    }
    
    public static void AtualizarRegistro(Pacientes paciente, int pos){
         lista.set(pos, paciente);
    }
    
}
