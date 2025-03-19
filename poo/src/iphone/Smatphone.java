package iphone;

public class Smatphone {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.getNavegadorInternet().exibirPagina("www.google.com.br");
        iPhone.getNavegadorInternet().adicionarNovaAba();
        iPhone.getNavegadorInternet().atualizarPagina();

        iPhone.getReprodutorMusical().tocar();
        iPhone.getReprodutorMusical().selecionarMusica("Musica 1");
        iPhone.getReprodutorMusical().pausar();

        iPhone.getTelefone().ligar("9999-9999");
        iPhone.getTelefone().atender();
        iPhone.getTelefone().iniciarCorreioVoz();
    }
}
