package iphone;

import iphone.navegador.INavegadorInternet;
import iphone.navegador.NavegadorInternet;
import iphone.reprodutor.IReprodutorMusical;
import iphone.reprodutor.ReprodutorMusical;
import iphone.telefone.ITelefone;
import iphone.telefone.Telefone;

public class IPhone {
    private IReprodutorMusical reprodutorMusical;
    private ITelefone telefone;
    private INavegadorInternet navegadorInternet;

    public IPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.telefone = new Telefone();
        this.navegadorInternet = new NavegadorInternet();
    }

    public IReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public ITelefone getTelefone() {
        return telefone;
    }

    public INavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }
}
