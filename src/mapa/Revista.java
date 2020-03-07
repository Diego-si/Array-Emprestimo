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
import java.util.ArrayList;

public class Revista {
    private ArrayList<Colecao> colecao = new ArrayList();
    private ArrayList<Caixa> caixa = new ArrayList();
    //private Colecao colecao;
    private int numeroEdicao;
    private int ano;
    private String quardada;
    
    //private Caixa caixa;
    
    
    public Revista(Colecao colecao, int numeroEdicao, int ano, String quardada, Caixa caixa ){
        this.colecao.add(colecao);
        this.numeroEdicao = numeroEdicao;
        this.ano = ano;
        this.quardada = quardada;
        this.caixa.add(caixa);
        
    }

    @Override
    public String toString() {
        return "Revista{\n" + " colecao=" + colecao +" numeroEdicao=" + numeroEdicao + ", ano=" + ano + ", Quardada=" + quardada + ",\n caixa=" + caixa + '}';
    }
    

}
