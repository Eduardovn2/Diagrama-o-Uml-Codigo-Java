package Funcoes.ReprodutorMusical;

public interface PausarMusica {

    //Implementação dos metodos definidos nas interfaces que representam a abstração.
    public default void pausar(){
        System.out.println("Pausando musica.");
    };
}
