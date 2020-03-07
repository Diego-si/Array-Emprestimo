/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author diven
 */
public class Emprestimo {
    private ArrayList<Amigo> amigo = new ArrayList();
    private ArrayList<Revista> revista = new ArrayList();
    private Date dataEmprestimo ;
    private Date dataDevolucao;

    public Emprestimo(Amigo amigo,Revista revista ,Date dataEmprestimo, Date dataDevolucao) {
        this.amigo.add(amigo);
        this.revista.add(revista);
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    Emprestimo(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    @Override
    public String toString() {
        return "Emprestimo{\n" + " amigo=" + amigo + ",\n revista=" + revista + ",\n dataEmprestimo=" + dataEmprestimo + ",\n dataDevolucao=" + dataDevolucao + "\n"+'}';
    }
}
