/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author diven
 */
public class Principal {
    public static void main(String[] args){
        ArrayList<Colecao> colecao = new ArrayList();
        ArrayList<Caixa> caixa = new ArrayList();
        ArrayList<Revista> revista = new ArrayList();
        ArrayList<Amigo> amigo = new ArrayList();
        ArrayList<Emprestimo> emprestimo = new ArrayList();
        
        colecao.add(new Colecao("Demolidor"));
        colecao.add(new Colecao("Homem-Aranha"));
        colecao.add(new Colecao("Justiceiro"));
        colecao.add(new Colecao("Vingadores"));
        colecao.add(new Colecao("X-Men"));
        
        caixa.add(new Caixa("Azul", "111111", 1));
        caixa.add(new Caixa("Violeta", "222222", 2));
        caixa.add(new Caixa("Amarela", "333333", 3));
        caixa.add(new Caixa("Rosa", "444444", 4));
        caixa.add(new Caixa("Verde", "555555", 5));
        
        revista.add(new Revista(colecao.get(0), 1000, 2000, "1° Andar", caixa.get(0)));
        revista.add(new Revista(colecao.get(1), 2000, 2001, "2° Andar", caixa.get(1)));
        revista.add(new Revista(colecao.get(2), 3000, 2002, "3° Andar", caixa.get(2)));
        revista.add(new Revista(colecao.get(3), 4000, 2003, "4° Andar", caixa.get(3)));
        revista.add(new Revista(colecao.get(4), 5000, 2004, "5° Andar", caixa.get(4)));
        
        amigo.add(new Amigo("Joao", "08005355", "Rua Das Margaridas"));
        amigo.add(new Amigo("Maria", "08005454", "Rua Maracuja"));
        amigo.add(new Amigo("Sereia", "08005787", "Rua Pera"));
        amigo.add(new Amigo("Marcos", "08005545", "Rua Uva"));
        amigo.add(new Amigo("Fabio", "08002000", "Rua Banana"));
        
        Calendar calendar = Calendar.getInstance();
        Date dataEmprestimo = calendar.getTime();    
        calendar.add(Calendar.DATE, 1);
        Date dataDevolucao = calendar.getTime();
        
        emprestimo.add(new Emprestimo(amigo.get(0), revista.get(0), dataEmprestimo, dataDevolucao));  
        emprestimo.add(new Emprestimo(amigo.get(1), revista.get(1), dataEmprestimo, dataDevolucao));
        emprestimo.add(new Emprestimo(amigo.get(2), revista.get(2), dataEmprestimo, dataDevolucao));
        emprestimo.add(new Emprestimo(amigo.get(3), revista.get(3), dataEmprestimo, dataDevolucao));
        emprestimo.add(new Emprestimo(amigo.get(4), revista.get(4), dataEmprestimo, dataDevolucao));
        
        for (int i=0; i<emprestimo.size(); i++){
            System.out.println(emprestimo.get(i));
            break;
        } 
        //Colecao c = new Colecao("vaca");
        //Caixa ca = new Caixa("no armario",10,"00000000","azul");
        //Revista r = new Revista(c, 500,2000, ca);
        /*Amigo a = new Amigo("Joao","08005235","rua aba");
        System.out.println(a);
        System.out.println(r);
        Emprestimo e = new Emprestimo(new Date(),"Wed Dec 04 17:16:47 GFT 2020");
        System.out.println(e);*/    }
}
