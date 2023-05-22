/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luis.cursojava.aula34.exercicios;

/**
 *
 * @author luisb
 */
public class TesteConversaoUnidades {

    public static void main(String[] args) {
        int a = 1;

        System.out.println(ConversaoUnidadesDeArea.metroPes(2));
        System.out.println(ConversaoUnidadesDeArea.peCentimetro(a));
        System.out.println(ConversaoUnidadesDeArea.milhaAcres(a));
        System.out.println(ConversaoUnidadesDeArea.acrePes(a));

        System.out.println(ConversaoUnidadesDeVolume.litroCentimetro(a));
        System.out.println(ConversaoUnidadesDeVolume.metroLitros(a));
        System.out.println(ConversaoUnidadesDeVolume.metroPes(a));
        System.out.println(ConversaoUnidadesDeVolume.galaoAmericanoParaPolegadas(a));
        System.out.println(ConversaoUnidadesDeVolume.galaoAmericanoParaLitro(a));

        ConversaoUnidadesDeTempo.minutoSegundo((short) a);
        ConversaoUnidadesDeTempo.horaMinutos((short) a);
        ConversaoUnidadesDeTempo.diaHoras((short) a);
        ConversaoUnidadesDeTempo.semanasDias((short) a);
        ConversaoUnidadesDeTempo.mesDias((short) a);
        ConversaoUnidadesDeTempo.anoDias((short) a);

    }
}
