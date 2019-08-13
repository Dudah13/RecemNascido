/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoRecemNascido;
import javax.swing.JOptionPane;
import modelo.RecemNascido;
import tela.manutencao.ManutencaoRecemNascido;

/**
 *
 * @author Administrador
 */
public class ControladorRecemNascido {

public static void inserir(ManutencaoRecemNascido man){
        RecemNascido objeto = new RecemNascido();
        objeto.setPeso(man.jtfPeso.getText());
        objeto.setNome_mae(man.jtfNomeMae.getText());
         objeto.setNumero_quarto(man.jtfNumeroquarto.getText());
         objeto.setSexo(man.jtfsexo.getText());
        
        boolean resultado = DaoRecemNascido.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    private static class RecemNasido extends RecemNascido {

        public RecemNasido() {
        }
    }
public static void alterar(ManutencaoRecemNascido man){
        RecemNascido objeto = new RecemNascido();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome_mae(man.jtfNomeMae.getText());
        objeto.setPeso(man.jtfPeso.getText());
        objeto.setNumero_quarto(man.jtfNumeroquarto.getText());
        objeto.setSexo(man.jtfsexo.getText());
        
        boolean resultado = DaoRecemNascido.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
public static void excluir(ManutencaoRecemNascido man){
        RecemNascido objeto = new RecemNascido();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = DaoRecemNascido.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
