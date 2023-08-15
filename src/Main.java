public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        Piloto piloto1 = new Piloto();

        Balao balao1 = new Balao();

        pessoa1.setNome("Fabricio");
        pessoa1.setCpf("23456789012");
        pessoa1.setRG("123456789");
        pessoa1.setTelefone("119123456789");
        pessoa1.setTelCont("119234567890");
        pessoa1.setEndereco("Jardim Belval");

        pessoa2.setNome("Thiago");
        pessoa2.setCpf("34567890123");
        pessoa2.setRG("234567890");
        pessoa2.setTelefone("11945678901");
        pessoa2.setTelCont("11956789012");
        pessoa2.setEndereco("Jardim Belval");

        piloto1.setNome("Rubens");
        piloto1.setCpf("45678901234");
        piloto1.setNumeroRegistro("02");

        balao1.setIdent("Lazer");
        balao1.setRegistro("111");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());
        System.out.println(piloto1.getNome());
        System.out.println(balao1.getIdent());
    }
}