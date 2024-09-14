/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula56;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {

        /*for (TipoDocumento doc : TipoDocumento.values()) {
            System.out.println(doc + " - " + doc.geraNumeroTeste());

        }*/
        Pessoa pessoa = new Pessoa();

        pessoa.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pessoa.setNumeroDocumento(pessoa.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoa);

        pessoa.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pessoa.setNumeroDocumento(pessoa.getTipoDocumento().geraNumeroTeste());
        System.out.println(pessoa);

    }
}
