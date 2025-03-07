import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("===== Cadastro de Conta Bancária =====");

        boolean flag = false;
        int numeroConta;
        while(!flag){
            System.out.println("Digite o número da sua conta:");
            try{
                numeroConta = scanner.nextInt();
                conta.setNumero(numeroConta);
                flag = true;
            }catch(InputMismatchException e){
                System.out.println("Erro: entrada inválida. Digite um número.");
            }finally {
                scanner.nextLine();
                System.out.println();
            }
        }

        flag = false;
        String agencia;
        while(!flag){
            System.out.println("Digite o código da sua agência (ex: 1234 ou 1234-5):");
            agencia = scanner.nextLine();
            if(agencia.matches("\\d{4}(-\\d)?")){
                conta.setAgencia(agencia);
                flag = true;
            }else{
                System.out.println("Código inválido! Tente novamente.");
            }
            System.out.println();
        }

        flag = false;
        String nomeCliente;
        while(!flag){
            System.out.println("Digite o seu nome completo:");
            nomeCliente = scanner.nextLine();
            if(nomeCliente.matches("^[A-Za-zÀ-ÖØ-öø-ÿ' ]+$")){
                conta.setNomeCliente(nomeCliente.trim().toUpperCase());
                flag = true;
            }else{
                System.out.println("Digite seu nome sem números ou caracteres especiais! Tente novamente.");
            }
            System.out.println();
        }

        flag = false;
        double saldo;
        while(!flag){
            System.out.println("Digite o saldo atual da sua conta:");
            try{
                saldo = scanner.nextDouble();
                conta.setSaldo(saldo);
                flag = true;
            }catch(InputMismatchException e){
                System.out.println("Erro: entrada inválida. Digite um número decimal separado por ','.");
            }finally {
                scanner.nextLine();
                System.out.println();
            }
        }

        conta.contaCriada();
    }

}
