package Funcoes.AparelhoTelefonico;

public interface realizarLigacao {
    public default void ligar(){

        //Implementação dos metodos definidos nas interfaces que representam a abstração.
        System.out.println("Realizando ligação.");
    }
}
