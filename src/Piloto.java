public class Piloto {

    public String nome;
    public String cpf;
    public String numeroRegistro;
    public Piloto(){
        this.nome = "Renan";
        this.cpf = "12345678901";
        this.numeroRegistro = "01";
    }

    public Piloto(String nome, String cpf, String numeroRegistro){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
    }

    public Piloto(String nome){
        this.nome = "Renan";
        this.cpf = "indisponivel";
        this.numeroRegistro = "indisponivel";
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf =  cpf;
    }
    public String getCpf(){
        return cpf;
    }

    public void setNumeroRegistro(String numeroRegistro){ this.numeroRegistro = numeroRegistro;}
    public String getNumeroRegistro(){ return numeroRegistro;}
}
