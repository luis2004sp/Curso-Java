/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula52.exercicio;

/**
 *
 * @author luisb
 */
public class Agenda {

    private Contato[] contatos;

    public Agenda() {

    }

    public Agenda(int quantidade) {
        contatos = new Contato[quantidade];
    }

    
    public void adicionarContatos(Contato c){
        
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] == null){
                contatos[i] = c;
                break;
            }
            
        }
    }
    
    public void consulta(){
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
    
}
