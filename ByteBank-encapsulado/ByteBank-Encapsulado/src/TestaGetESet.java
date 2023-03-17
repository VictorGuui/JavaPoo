public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);
        
        System.out.println(conta.getNumero());

        Cliente victor = new Cliente();
        victor.setNome ("Victor Guilherme Branco");
        conta.setTitular(victor);
        System.out.println(conta.getTitular().getNome());
    
        conta.getTitular().setProfissao("Programador");
        //Agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());

        System.out.println(titularDaConta);
        System.out.println(victor);
        System.out.println(conta.getTitular());


    }
}
