/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bliotek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

/**
 *
 * @author Nuno
 */
public class Bliotek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
     Connection connection = conecao.getConnection();
    

     
        novoUtilizador nUti = new novoUtilizador();
        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(converter);
        String ch = "";
        String curso = "";
        boolean ok = false;
        int num = 0;
         
        while (num < 5) {   
            //nUti.listaAlunos();
            System.out.println("O nº de alunos é" + nUti.listaTotalAlunos());
               System.out.println("Pff introduza o seu nome");
            ch = in.readLine();
            System.out.println("PFF introduza o seu curso");
            curso = in.readLine();
            //nUti.login(ch);
            int log = nUti.login(ch);
            if(log == 1){
                System.out.println(log);
            }else
                System.out.println("não");
        }
    }

}
