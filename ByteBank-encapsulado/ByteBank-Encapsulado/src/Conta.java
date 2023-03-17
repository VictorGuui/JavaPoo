public class Conta{

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta. total++;
        //System.out.println("O total de contas é :"+ Conta.total) ;
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("Criação de conta "+ this.numero);
    } 

    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >=valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean tranfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
            return false;
        }

        public double GetSaldo(){
            return this.saldo;
        }

        public int getNumero(){
            return this.numero;
        }

        public void setNumero(int numero){
            if(numero <= 0){
                System.out.println("Nâo pode valor <= 0");
                return;
            }
            this.numero = numero;
            //se necessario eu posso falar com IF se vai ser de 0 a 100 por exemplo 
            //Mostrar msg de erro tbm entre outras coisas/validações
        }
        public int getAgencia() {
            return agencia;
        }
        public void setAgencia(int agencia){
            if(agencia <=0){
            System.out.println("Não é possivel realizar transições negativas");
            return;
            }
            this.agencia = agencia;
        }
        public void setTitular(Cliente titular){
            this.titular = titular;
        } 
        public Cliente getTitular(){
            return titular;
        }
            
        public static int getTotal(){
            return Conta.total;
        }

    }
