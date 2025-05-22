package Funcoes.AparelhoTelefonico;

public interface AtenderLigacao{

    //Implementação dos metodos definidos nas interfaces que representam a abstração.
    public default void atenderLigacao(){
        System.out.println("Atendendo ligação.");
    }
}
