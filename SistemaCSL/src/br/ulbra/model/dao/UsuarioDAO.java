package br.ulbra.model.dao;

import br.ulbra.connection.ConnectionFactory;
import br.ulbra.entity.Usuario;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class UsuarioDAO {

  Connection con;
   
    public UsuarioDAO() {
        con = ConnectionFactory.getConnection();
    }
   
    //MÉTODOS CRIADOS PARA FAZER PESQUISAS NO BANCO DE DADOS
//EM ORDEM DE CADASTRO TODOS

    /**
     *
     * @return
     */
     public ArrayList<Usuario> read() {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setId(Integer.parseInt(rs.getString("id")));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
            
              
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }

//PESQUISA PELO LOGIN

    public ArrayList<Usuario> readForDesc(String login) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login LIKE ?");
            stmt.setString(1, "%"+login+"%");
           
            rs = stmt.executeQuery();

            while (rs.next()) {

               Usuario usuario= new Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setLogin(rs.getString("login"));
              
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return usuarios;

    }
    
    
    
//MÉTODO CRIADO PARA INSERIR USUÁRIO NO BANCO DE DADOS
    public void create(Usuario u) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario (login,senha) VALUES (?,?)");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());
          

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

// MÉTODO CRIADO PARA EXCLUIR DO BANCO DE DADOS

 public void delete(Usuario u) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE id = ?");
            stmt.setInt(1, u.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

//MÉTODO CRIADO PARA MODIFICAR NO BANCO DE DADOS

 public void update(Usuario u) {

        PreparedStatement stmt = null;

        try {
         
            stmt = con.prepareStatement("UPDATE usuario SET login = ? , senha= ? WHERE id = ?");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }





    public boolean checkLogin(String login, String senha) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {

              
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }


}
