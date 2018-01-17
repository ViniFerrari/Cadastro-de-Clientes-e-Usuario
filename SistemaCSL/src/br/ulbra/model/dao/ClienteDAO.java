package br.ulbra.model.dao;

import br.ulbra.connection.ConnectionFactory;
import br.ulbra.entity.Cliente;
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
public class ClienteDAO {

  Connection con;
   
    public ClienteDAO() {
        con = ConnectionFactory.getConnection();
    }
   
    //MÉTODOS CRIADOS PARA FAZER PESQUISAS NO BANCO DE DADOS
//EM ORDEM DE CADASTRO TODOS

     public ArrayList<Cliente> read() {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbcliente");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                
                cliente.setId(rs.getInt("idcli"));
                cliente.setNomeCli(rs.getString("nomecli"));
                cliente.setCelularCli(rs.getString("celularcli"));
                cliente.setEmailCli(rs.getString("emailcli"));
                cliente.setCpfCli(rs.getString("cpfcli"));
                cliente.setRgCli(rs.getString("rgcli"));
                cliente.setLogradouro(rs.getString("logradourocli"));
                cliente.setNumCli(rs.getInt("numcli"));
                cliente.setBairroCli(rs.getString("bairrocli"));
                cliente.setCepCli(rs.getString("cepcli"));
                cliente.setCidadeCli(rs.getString("cidadecli"));
                cliente.setUfCli(rs.getString("ufcli"));
                cliente.setFoneCli(rs.getString("fonecli"));
              
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }

//PESQUISA PELO LOGIN

    public ArrayList<Cliente> readForDesc(String nomecli) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM tbcliente WHERE nomecli LIKE ?");
            stmt.setString(1, "%"+nomecli+"%");
           
            rs = stmt.executeQuery();

            while (rs.next()) {

               Cliente cliente= new Cliente();

                cliente.setId(rs.getInt("idcli"));
                cliente.setNomeCli(rs.getString("nomecli"));
                cliente.setCelularCli(rs.getString("celularcli"));
                cliente.setEmailCli(rs.getString("emailcli"));
              
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }
    
    
    
//MÉTODO CRIADO PARA INSERIR USUÁRIO NO BANCO DE DADOS
    public void create(Cliente c) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO tbcliente (nomecli,cpfcli,rgcli,logradourocli,numcli,bairrocli,"
            + "cepcli,cidadecli,ufcli,celularcli,fonecli,emailcli) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, c.getNomeCli());
            stmt.setString(2, c.getCpfCli());
            stmt.setString(3, c.getRgCli());
            stmt.setString(4, c.getLogradouro());
            stmt.setInt(5, c.getNumCli());
            stmt.setString(6, c.getBairroCli());
            stmt.setString(7, c.getCepCli());
            stmt.setString(8, c.getCidadeCli());
            stmt.setString(9, c.getUfCli());
            stmt.setString(10, c.getCelularCli());
            stmt.setString(11, c.getFoneCli());
            stmt.setString(12, c.getEmailCli());
            

            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

// MÉTODO CRIADO PARA EXCLUIR DO BANCO DE DADOS

 public void delete(Cliente c) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM tbcliente WHERE idcli = ?");
            stmt.setInt(1, c.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

//MÉTODO CRIADO PARA MODIFICAR NO BANCO DE DADOS

 public void update(Cliente c) {

        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE tbcliente SET nomecli = ? , cpfcli = ? ,rgcli = ?, logradourocli = ?, numcli = ?, bairrocli = ?, cepcli = ?,  cidadecli = ?, ufcli = ?, celularcli = ?, fonecli = ?, emailcli = ?  WHERE idcli = ?");
            
            stmt.setString(1, c.getNomeCli());
            stmt.setString(2, c.getCpfCli());
            stmt.setString(3, c.getRgCli());
            stmt.setString(4, c.getLogradouro());
            stmt.setInt(5, c.getNumCli());
            stmt.setString(6, c.getBairroCli());
            stmt.setString(7, c.getCepCli());
            stmt.setString(8, c.getCidadeCli());
            stmt.setString(9, c.getUfCli());
            stmt.setString(10, c.getCelularCli());
            stmt.setString(11, c.getFoneCli());
            stmt.setString(12, c.getEmailCli());
            stmt.setInt(13, c.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }


}