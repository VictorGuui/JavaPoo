public class TestaValores {
    public static void main(String[] args) {
       
        Conta conta = new Conta(1337,24226);
        // System.out.println(conta.);


        System.out.println(conta.getAgencia() );

        conta.setAgencia(1232123);

        Conta conta2 = new Conta(1337, 15384);
        Conta conta3 = new Conta(1336, 124562);

        System.out.println(Conta.getTotal());
        System.out.println(conta2.getTotal());

    }
}
