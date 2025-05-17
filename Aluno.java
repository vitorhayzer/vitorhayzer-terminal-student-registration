import java.util.Scanner;

public class Aluno {
    int matricula, grupo, subturma, senha;
    String nome;

    public Aluno(String nome, int senha, int subturma, int grupo, int matricula) {
        this.nome = nome;
        this.senha = senha;
        this.grupo = grupo;
        this.subturma = subturma;
        this.matricula = matricula;
    }

    public String mostraAluno() {
        return "[matricula->" + matricula + " ,nome->" + nome
                + " ,grupo->" + grupo + " ,subturma->" + subturma + " ,senha->" + senha + "]";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        // Preenchendo o array
        for (int i = 0; i < 3; i++) {
            System.out.println("\nCadastro do Aluno " + (i+1));
            
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();

            System.out.print("Digite a subturma: ");
            int subturma = scanner.nextInt();

            System.out.print("Digite o grupo: ");
            int grupo = scanner.nextInt();

            System.out.print("Digite a matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            alunos[i] = new Aluno(nome, senha, subturma, grupo, matricula);
        }

        // Exibindo os alunos com número de ordem
        System.out.println("\nLista de Alunos:");
        for (int l = 0; l < 3; l++) {
            System.out.println("Aluno " + (l+1) + ": " + alunos[l].mostraAluno());
        }

        scanner.close();
    }
}