/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

/**
 *
 * @author diven
 */
public class Amigo {
    private String nome;
    private String telefone;
    private String localAmigo;
    
    public Amigo(String nome, String telefone,String localAmigo){
        this.nome = nome;
        this.telefone = telefone;
        this.localAmigo = localAmigo;
    }

    @Override
    public String toString() {
        return "Amigo{" + "nome=" + nome + ", telefone=" + telefone + ", localAmigo=" + localAmigo + '}';
    }
}
