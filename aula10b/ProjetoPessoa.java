package aula10b;

public class ProjetoPessoa {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Pedro", 12, "M");
        Aluno p2 = new Aluno("Maria", 12, "F", true, "S.I");
        Professor p3 = new Professor("Claudio", 13, "M", "S.I", 12.8f);
        Funcionario p4 = new Funcionario("Fabiana", 15, "F", "Informatica", false);

        System.out.println("---------------");
        System.out.println(p1.Mostra());
        System.out.println("---------------");
        System.out.println(p2.Mostra());
        System.out.println("---------------");
        System.out.println(p3.Mostra());
        System.out.println("---------------");
        System.out.println(p4.Mostra());
    }
}
