/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula56;

/**
 *
 * @author luisb
 */
public class Main {

    public static void main(String[] args) {
//        for (TipoDocumento doc : TipoDocumento.values()) {
//            System.out.println(doc + " - " + doc.geraNumTeste());
//        }

        Pessoa pf = new Pessoa();

        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.setNumeroDocumento(pf.getTipoDocumento().geraNumTeste());
        System.out.println(pf);

        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(TipoDocumento.CNPJ);
        pj.setNumeroDocumento(pj.getTipoDocumento().geraNumTeste());
        System.out.println(pj);
    }
}
