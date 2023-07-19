/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula36.V2;

/**
 *
 * @author luisb
 */
public class Teste {

    public static void main(String[] args) {

        Contato c = new Contato();

        c.setNome("Luis");
        //c.setTelefone("11 9999-9999");
        //c.setEndereco("Rua da Chapeuzinho");

        // Endereço
        Endereco end = new Endereco();

        end.setNomeRua("Rua da Chapeuzinho");
        end.setNumero("n/a");
        end.setComplemento("Na frente da vovózinha");
        end.setCidade("Tão Tão Distante");
        end.setEstado("Mundo da Lua");
        end.setCep("05645-040");

        c.setEndereco(end);

        if (c.getEndereco() != null && c != null) {
            System.out.println(c.getEndereco().getNomeRua());
            System.out.println(c.getEndereco().getComplemento());
            System.out.println(c.getEndereco().getCep());
            System.out.println(c.getEndereco().getNumero());
            System.out.println(c.getEndereco().getEstado());
            System.out.println("");
        }

        //Telefone
        Telefone tele = new Telefone();

        tele.setTipo("Celular");
        tele.setDdd("11");
        tele.setNumero("9999-9999");

        Telefone tele2 = new Telefone();

        tele2.setTipo("Casa");
        tele2.setDdd("11");
        tele2.setNumero("8888-9999");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tele;
        telefones[1] = tele2;

        c.setTelefones(telefones);

        if (c != null && c.getTelefones() != null) {
            for (Telefone telefone : c.getTelefones()) {
                System.out.println(telefone.getDdd() + " " + telefone.getNumero());
                System.out.println(telefone.getTipo());
                System.out.println("");
            }
        }

        System.out.println(c.getNome());
        // System.out.println(c.getTelefone());

    }

}
