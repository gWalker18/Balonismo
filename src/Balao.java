public class Balao {

    public String ident;
    public String registro;

    public Balao(){
        this.ident = "112";
        this.registro = "indisponivel";
    }

    public Balao(String ident, String registro){
        this.ident = ident;
        this.registro = registro;
    }

    public Balao(String ident){
        this.ident = ident;
        this.registro = "indisponivel";
    }
    public void setIdent(String ident){
        this.ident = ident;
    }

    public String getIdent(){
        return ident;
    }

    public void setRegistro(String registro){
        this.registro = registro;
    }

    public String getRegistro(){
        return registro;
    }
}
