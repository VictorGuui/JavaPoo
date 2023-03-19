public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        segundaConta.agencia = 192;
        System.out.println("Agora esta conta esta na agencia "+segundaConta.agencia);

        System.out.println("referenciar: " + primeiraConta);

        if(primeiraConta == segundaConta){
            System.out.println();
        }

        
    }

}