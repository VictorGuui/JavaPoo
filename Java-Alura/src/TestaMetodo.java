public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoVictor= new Conta();
        contaDoVictor.saldo = 100;
        contaDoVictor.deposita(50);
        System.out.println(contaDoVictor.saldo);

        boolean conseguiuRetirar= contaDoVictor.saca(20);
        System.out.println(contaDoVictor.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        boolean sucessoTransferencia = contaDaMarcela.tranfere(300, contaDoVictor);
        if(sucessoTransferencia){
            System.out.println("Transferencia executada com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoVictor.saldo);

        contaDoVictor.titular = "Victor Guilherme Branco";
        System.out.println(contaDoVictor.titular);
    }
}
