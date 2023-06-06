/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package luis.cursojava.aula46;

/**
 *
 * @author luisb
 */
public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

    void abrirConexao();

    void fecharConexao();
}
