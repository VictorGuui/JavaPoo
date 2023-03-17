public class TestaBanco{
    public static void main(String[] args) {
        Cliente victor= new Cliente();
        victor.nome = "Victor Guilherme Branco";
        victor.cpf = "474.611.218-55";
        victor.profissao = "Programador";
        
        Conta contaDoVictor = new Conta();
        contaDoVictor.deposita(100);

        //associa o cliente victor a conta contaDoVictor
        contaDoVictor.titular = victor;
        System.out.println(contaDoVictor.titular.nome);
        System.out.println(contaDoVictor.titular);
        System.out.println(victor);
       
    }
}