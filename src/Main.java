import java.util.Scanner;

import classeParametrizada.Parametriz;

public class Main {

    public static void main(String[] args) throws Exception {

        Parametriz para = new Parametriz<>();
        Scanner input = new Scanner(System.in);

        // cadastrar,size,listar,verificarPosicao,adicionarPorPosicao,removerPorPosicao,procurarContas;

        int escolha;

        boolean repeticao = true;
        do {
            escolhas();
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Quantas Contas Deseja Gerar?");
                    int quantidade = input.nextInt();
                    gerarContas(quantidade, para);
                    break;

                case 2:
                    procurarPosicao(input, para);
                    break;

                case 3:
                    listar(para);
                    break;

                case 4:
                    removerPosicaoEspecifica(input, para);
                    break;

                case 5:
                    listar(para);
                    break;

                case 6:
                    repeticao = false;
                    System.out.println("Programa Finalizado!");
                    break;
                default:
                    System.out.println("Opção não existente!");
                    break;
            }
        } while (repeticao);

    }

    }

    }

    public static void gerarContas(int quantidade, Parametriz cadastro) {
        Contas conta;
        for (int i = 0; i < quantidade; i++) {
            conta = new Contas();
            conta.setNome("Nome" + i);
            conta.setValor(i);
            cadastro.cadastrar(conta);
        }
    }

    public static void procurarPosicao(Scanner input, Parametriz cadastro) throws Exception {
        System.out.println("Qual a posição deseja Procurar?\n");
        int posicao = input.nextInt();
        System.out.println(cadastro.procurarContas(posicao));
    }

    public static void removerPosicaoEspecifica(Scanner input, Parametriz cadastro) throws Exception {
        System.out.println("Qual Posição deseja apagar?");
        int posicao = input.nextInt();
        cadastro.removerPorPosicao(posicao);
    }

    public static void listar(Parametriz cadastro) {
        System.out.println(cadastro.toString());
    }

    public static void escolhas() {
        System.out.println("Escolha uma oção:");
        System.out.println("1-Cadastrar");
        System.out.println("2-Conferir Tamanho");
        System.out.println("3-Listar");
        System.out.println("4-Verificar Posição");
        System.out.println("5-Adicionar em determinada posição");
        System.out.println("6-Remover de determinada posição");
        System.out.println("7-Procurar conta");
        System.out.println("7-Sair do programa");
}
