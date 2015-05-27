/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bliotek;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nuno
 */
public class novoUtilizador {

    public ArrayList<utilizador> uti = new ArrayList<utilizador>();
    public int contador;
    //public String user;
    public String password;

    public void novoUtilizador() {
        
    }

    public void listaAlunos() {
        for (int i = 0; i < uti.size(); i++) {//

            System.out.println("ola" + uti);

        }
    }

    public int login(String utilizador) {
       
        for (int i = 0; i < uti.size(); i++) {//
             
            if (uti.get(i).getNome().compareTo(utilizador) == 0) {
                return 1;}            
            }
        return 0;
    }

    public int listaTotalAlunos() {
        return uti.size();
    }
    public void registaUtilizador(utilizador uti){
        
        
         System.out.println("Valores inseridos com sucesso"+uti.getNome());
        Connection connection = conecao.getConnection();
        
        try{
            PreparedStatement preparedStatement =
                        connection.prepareStatement("INSERT INTO LOGIN (ID, UTILIZADOR,PASSWORD) VALUES(?, ?, ?)");
            preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, uti.getNome());
                preparedStatement.setString(3, uti.getPassword());
                preparedStatement.executeUpdate();
            System.out.println("Valores inseridos com sucesso"+uti.getNome());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

        

    


