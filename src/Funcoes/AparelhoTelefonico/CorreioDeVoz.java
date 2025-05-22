package Funcoes.AparelhoTelefonico;

public interface CorreioDeVoz{

    //Implementação dos metodos definidos nas interfaces que representam a abstração.
    public default void iniciarCorreioDeVoz(){
        System.out.println("Iniciando Correio de Voz gravada.");
    }
}
