public class Pessoa{

        public String nome;
        public String cpf;
        public String rg;
        public String telefone;
        public String telCont;
        public String endereco;

        public Pessoa(){
            this.nome = "Guilherme";
            this.cpf = "Cpf";
            this.rg = "RG";
            this.telefone = "Telefone";
            this.telCont = "Telefone contato";
            this.endereco = "Endereço";
        }

        public Pessoa(String nome, String cpf,String rg,String telefone,String telCont,String endereço){
            this.nome = nome;
            this.cpf = cpf;
            this.rg = rg;
            this.telefone = telefone;
            this.telCont = telCont;
            this.endereco = endereco;
        }

        public Pessoa(String nome,String telefone){
            this.nome = nome;
            this.cpf = "";
            this.rg = rg;
            this.telefone = telefone;
            this.telCont = telCont;
            this.endereco = endereco;
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

        public void setRG(String rg){
            this.rg = rg;
        }
        public String getRG(){
            return rg;
        }

        public void setTelefone(String telefone){
            this.telefone =  telefone;
        }
        public String getTelefone(){
            return telefone;
        }

        public void setTelCont(String telCont){
            this.telCont =  telCont;
        }
        public String getTelCont(){
            return telCont;
        }

        public void setEndereco(String endereco){
            this.endereco =  endereco;
        }
        public String getEndereco(){
            return endereco;
        }
}
