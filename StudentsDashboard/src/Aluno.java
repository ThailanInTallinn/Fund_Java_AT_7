import java.util.Scanner;

public class Aluno {
    String nome;
    String matricula;
    float notaUm;
    float notaDois;
    float notaTres;

    public Aluno(String nome, String matricula, float notaUm, float notaDois, float notaTres) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
    }

    public float calcularMedia() {
        return (this.notaUm + this.notaDois + this.notaTres) / 3;
    }

    public boolean verificarAprovacao() {
        if(this.calcularMedia() >= 7) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String userName = sc.nextLine();
        System.out.print("Insira a sua matrícula: ");
        String matricula = sc.nextLine();
        System.out.print("Insira a primeira nota: ");
        float notaUm = sc.nextFloat();
        System.out.print("Insira a segunda nota: ");
        float notaDois = sc.nextFloat();
        System.out.print("Insira a terceira nota: ");
        float notaTres = sc.nextFloat();

        Aluno aluno = new Aluno(userName, matricula, notaUm, notaDois, notaTres);
        float media = aluno.calcularMedia();
        System.out.print(aluno.verificarAprovacao()? "Aprovado" : "Reprovado");
    }
}
