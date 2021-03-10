package aula06b;

public class Main {
    public static void main (String[] args){
        ControleRemoto c = new ControleRemoto();
        c.Ligar();
        c.AbrirMenu();
        c.LigarMudo();
        c.AbrirMenu();
        c.FechaMenu();
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
 *  -----------
 *  H - HERANÇA
 *
 *  ---------------
 * P - POLIFORMISMO
 *
 * -------------
 * A - ABSTRAÇÃO
 */
