package Funcoes.ReprodutorMusical;

public interface TocarMusica {
    public default void tocar(){
        System.out.println("Tocando musica.");
    };
}
