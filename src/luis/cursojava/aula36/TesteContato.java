/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula36;

/**
 *
 * @author luisb
 */
public class TesteContato {

    public static void main(String[] args) {

        //Criando relacionamentos entre:
        Contato contato = new Contato();

        //Nome
        Nome nome = new Nome();
        
        nome.setPrimeiroNome("Luis Antonio");
        nome.setSegundoNome("Brugger Martinez");
        
        contato.setNome(nome);// integor as informações do nome em contato
        // se não for feito o objt contato não terá acesso as informações do nome

        //Endereço
        Endereco end = new Endereco();

        end.setNomeRua("Rua Antonio Zacharias Neto");
        end.setNumero("84");
        end.setCep("05798-020");
        end.setCidade("São Paulo");
        end.setEstado("São Paulo");

        contato.setEndereco(end); // integor as informações do endereço em contato

        //Telefone
        Telefone tele = new Telefone();
        tele.setTipo("Celular");
        tele.setDdd("11");
        tele.setNumero("95221-5437");

        Telefone tele2 = new Telefone();
        tele2.setTipo("Casa");
        tele2.setDdd("11");
        tele2.setNumero("5512-0072");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tele;
        telefones[1] = tele2;

        contato.setTelefones(telefones);// integor as informações do telefone em contato

        // output
        if(contato!=null && contato.getNome()!=null){
            System.out.println("Sr. "+contato.getNome().getSegundoNome());
        }
        
        if (contato != null && contato.getEndereco() != null) {
            System.out.println("");
            System.out.println("Rua: " + contato.getEndereco().getNomeRua());
            System.out.println("Nº: " + contato.getEndereco().getNumero());
            System.out.println("Cidade: " + contato.getEndereco().getCidade());
            System.out.println("CEP: " + contato.getEndereco().getCep());
            System.out.println("");
        }
        
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone telefone : contato.getTelefones()) {
                System.out.println(telefone.getDdd() + " " + telefone.getNumero()+'\n'+"Tipo: "+telefone.getTipo());
                System.out.println("");
            }
        }

    }
}
