/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula56;

/**
 *
 * @author luisb
 */
public enum TipoDocumento {
    CPF {
        @Override
        public String geraNumTeste() {
            return GeraCpfCnpj.cpf();
        }
    }, CNPJ {
        @Override
        public String geraNumTeste() {
            return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraNumTeste();
}
