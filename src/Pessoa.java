import java.util.Scanner;

public class Pessoa {
    public String nome;
    public String cpf;
    public long rg;
    public long telefone;
    public long telefoneFamiliar;
    public String endereco;
    Scanner tcd = new Scanner(System.in);

    public void digite () {
        System.out.println("Digite seu nome:");
        nome = tcd.nextLine();
        System.out.println("Digite seu CPF:");
        cpf = tcd.nextLine();
        System.out.println("Digite seu RG:");
        rg = tcd.nextLong();
        System.out.println("Telefones para contato:");
        telefone = tcd.nextLong();
        telefoneFamiliar = tcd.nextLong();
        System.out.println("Digite seu endereço:");
        endereco = tcd.nextLine();

        System.out.println("Informações do cliente: Nome : "+ nome + " CPF: " + cpf+ " RG: "+rg+ " Telefones 1-"+
                telefone+" 2-"+telefoneFamiliar+" endereço: "+endereco);
    }
}
