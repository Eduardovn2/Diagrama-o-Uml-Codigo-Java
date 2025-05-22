// As interfaces e classes como ReprodutorMusical estão organizadas dentro do pacote "funcoes".
// O pacote "Iphone" contém a classe "usuarioEduardo", que é responsável por executar/testar essas funcionalidades.
// Isso ajuda a organizar o código: as funcionalidades ficam separadas das classes que as utilizam.

package Iphone;
//Importação dos pacotes que esta com class interfaces e implementações na main do pacote.
import Funcoes.AparelhoTelefonico.AparelhoTelefonico;
import Funcoes.NavegadorInternetSemLimites.Navegador;
import Funcoes.ReprodutorMusical.ReprodutorMusical;

public class usuarioEduardo{
    public static void main(String[] args) {
        //Criação de um objeto para executar os metodos implementados.
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.atenderLigacao();
        aparelhoTelefonico.iniciarCorreioDeVoz();
        aparelhoTelefonico.ligar();

        Navegador navegador = new Navegador();
        navegador.exibirPaginas();
        navegador.AdicionarAba();
        navegador.AdicionarAba();

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    }
}
