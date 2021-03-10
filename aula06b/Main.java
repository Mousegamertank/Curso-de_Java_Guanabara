package aula06b;

public class Main {
    public static void main (String[] args){
        
    }
}
/***
 * E - ENCAPSULAMENTO (Pilha), serve para protegem e criar um padrão(a forma de funcionamento de diferentes modelos não importa pois a forma de que tal trabalha se torna padronizado)
 *  Ocultar partes independetes da implementação permitindo construir partes invisiveis ao exterior (troca de informações dentro do objeto é chamado mensagem)
 *  fornece informações com interface(lista de serviço com o mundo exterior)[NÃO É OBRIGATORIO MAS É UMA BOA PRATICA]
 *  Vantagens de Encapsular -> mudanças se tornam invisiveis
 *  Reutilização de Codigo -> Para varios Objetos
 *  Reduzir efeitos colaterais -> permite uma interface padrão
 *
 *INTERFACE NÃO POSSUI ATRIBUTOS
 *  __________________________
 *  |   <<Interface>>        |
 *  |  Controlador           |
 *  |------------------------|
 *  |   + ligar()            |
 *  |   + desligar()         |
 *  |   + abrirMenu()        |
 *  |   + fecharMenu()       |
 *  |   + maisVolume()       |
 *  |   + menosVolume()      |
 *  |   + ligarMudo()        |
 *  |   + DesligarMudo()     |
 *  |   + Play               |
 *  |   + Pause              | <------|
 *  |________________________|        |
 *                                    |
 * ENCAPSULAMENTO DEIXA TUDO PRIVADO  |
 *  __________________________        |
 *  |   ControleRemoto       | --------
 *  |  - volume              |
 *  |  - ligado              |
 *  |  - tocando             |
 *  |------------------------|
 *  |   + ligar()            |
 *  |   + desligar()         |
 *  |   + abrirMenu()        |
 *  |   + fecharMenu()       |
 *  |   + maisVolume()       |
 *  |   + menosVolume()      |
 *  |   + ligarMudo()        |
 *  |   + DesligarMudo()     |
 *  |   + Play()             |
 *  |   + Pause()            |
 *  |  - setVolume           |
 *  |  - setLigado           |
 *  |  - setTocando          |
 *  |  - getVolume           |
 *  |  - getLigado           |
 *  |  - getTocando          |
 *  |________________________|
 *  *
 *  INTERFACE Controlador
 *  publico abstrado Metodo ligar()
 *  publico abstrado Metodo Desligar()
 *  publico abstrado Metodo abrirMenu()
 *  publico abstrado Metodo fecharMenu()
 *  publico abstrado Metodo maisVolume()
 *  publico abstrado Metodo ligarMudo()
 *  publico abstrado Metodo DesligarMudo()
 *  publico abstrado Metodo play()
 *  publico abstrado Metodo pause()
 *  FIMINTERFACE
 *
 *
 *  Classe -> int volume, boolean ligado, boolean tocando
 *  Constructor
 *      Volume = 50
 *      Ligado = falso
 *      Tocando = 50
 *
 *     Classe ControleRemoto Implementa Controlador
 *     AbrirMenu
 *      getLigado
 *      (Apresenta as informações), no volume usar um for pulando de 10 em 10 se o volume estiver em 80 (||||||||--)[apresentar desta forma]
 *      getTocando
 *     FecharMenu
 *      (Parar de mostrar)
 *     maisVolume()
 *          testa se a tv ta ligada
 *     menosVolume()
 *         testa se a tv ta ligada
 *     ligarMudo ()
 *          Ver se TV está ligada e se não está mudo
 *     DesligarMudo ()
 *          Ver se Tv está ligada e se está mudo
 *     Play ()
 *          Ligado e não estiver Tocando
 *     Pause ()
 *          Ligado e estiver Tocando
 *  -----------
 *  H - HERANÇA
 *
 *  ---------------
 * P - POLIFORMISMO
 *
 * -------------
 * A - ABSTRAÇÃO
 */
