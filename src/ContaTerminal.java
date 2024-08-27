import java.util.Scanner;

public class ContaTerminal{
   
    public static void main(String[] args) {

        String nomeCliente = " Alfredo Lopes";
        String tipoConta = "Conta corrente";
        int numeroConta= 1050;
        double saldoConta = 20;

        System.out.println("******************************");
        System.out.println("\nNome do Cliente : " + nomeCliente);
        System.out.println("\nNumero da conta Cliente : " + numeroConta);
        System.out.println("Tipo de Conta : " + tipoConta);
        System.out.println("\n******************************");

        String menu = """
                Digite uma Opção :
                1 - Consualtar seu saldo!
                2 - Fazer uma tranferencia!
                3 - Realizar um deposito!
                4 - Pagar boleto!
                5 - Sair 
              
                """;

        @SuppressWarnings("resource")
        Scanner leituraDados = new Scanner(System.in);


        int opcao = 0;
        while (opcao != 5 ){
            System.out.println(menu);
            opcao = leituraDados.nextInt();

            if (opcao == 1){
                System.out.println("\nNome do Cliente : " + nomeCliente +"\nNumero da Conta: "+ numeroConta +
                "\nSeu saldo atual e : "+ saldoConta );

            } else if (opcao == 2) {
                System.out.println("\nQual valor deseja Tranferir ?" + "\nSeu saldo atua e : " + saldoConta);
                 double valor = leituraDados.nextDouble();

                  if (valor > saldoConta){
                     System.out.println("Não há saldo suficiente para concluir a tresferencia !" + " Seu saldo atua e : " + saldoConta + "\nNumero da Conta: "+ numeroConta + "\nNome do Cliente : " + nomeCliente );
                  }else {
                     saldoConta -= valor;
                     System.out.println("Saldo em conta : " + saldoConta + "\nNumero da Conta: "+ numeroConta + "\nNome do Cliente : " + nomeCliente  );
                 }

            } else if (opcao == 3 ) {
                System.out.println("valor recebido : "  );
                double valor = leituraDados.nextDouble();

                saldoConta += valor;
                System.out.println( "\nSaldo em conta : " + saldoConta + "\nNumero da Conta: "+ numeroConta  + "\nNome do Cliente : " + nomeCliente );


            } else if (opcao == 4) {
                System.out.println("Qual o valor do Boleto ?");
                double valor = leituraDados.nextDouble();

                if (valor > saldoConta){
                    System.out.println("\nNão há saldo suficiente para concluir o pagamento !" + "\nSeu saldo atua e : " + saldoConta +"\nNumero da Conta: "+ numeroConta + "\nNome do Cliente : " + nomeCliente );
                }else {
                    saldoConta -= valor;
                    System.out.println("\nSaldo em conta : "+ saldoConta + "\nNumero da Conta: "+ numeroConta  + "\nNome do Cliente : " + nomeCliente);

                }


            }else if (opcao != 5) {
                System.out.println("Opção digitada e invalida !");
            }else {
                System.out.println(opcao);

            }

        }
    }
}
