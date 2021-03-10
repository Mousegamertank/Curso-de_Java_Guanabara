package aula06b;

public interface Controlador {
    public abstract void Ligar();
    public abstract void Desligar();
    public abstract void AbrirMenu();
    public abstract void FechaMenu();
    public abstract void MaisVolume();
    public abstract void MenosVolume();
    public abstract void LigarMudo();
    public abstract void DesligarMudo();
    public abstract void Play();
    public abstract void Pause();

}
/***
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
*/