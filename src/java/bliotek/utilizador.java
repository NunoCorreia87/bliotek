/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bliotek;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import servlet.NewServlet;
/**
 *
 * @author Nuno
 */
public class utilizador {
 private String nome;
    private String password;
    private int idade;
    public utilizador utilizador;
    
   

    public utilizador() {
       
      
        System.out.println("olaaa"+nome);
    }
 public String getNome() {
        return nome;
    }
    public String getPassword() {
        return password;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String curto) {
        this.password = curto;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
   public String toString(){ 
return "Name: " + nome + "\n" + "User Type: " + password + "\n";
}
}
