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
public class Caixa {
    private String cor;
    private String identificacaoEtiqueta;
    private int numero;


    public Caixa(String cor, String identificacaoEtiqueta, int numero) {
        this.cor = cor;
        this.identificacaoEtiqueta = identificacaoEtiqueta;
        this.numero = numero;

    }
    
    @Override
    public String toString() {
        return "Caixa{" + "numero=" + numero + ", identificacaoEtiqueta=" + identificacaoEtiqueta + ", cor=" + cor + '}';
    }
    

}
