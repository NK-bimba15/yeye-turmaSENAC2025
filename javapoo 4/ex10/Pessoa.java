package ex10;

/**
 *
 * @author ADM
 */
public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract void apresentar();
}

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Professor: " + nome + " | Disciplina: " + disciplina);
    }
}

class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Aluno: " + nome + " | Curso: " + curso);
    }
}

class Funcionario extends Pessoa {
    private String setor;

    public Funcionario(String nome, String setor) {
        super(nome);
        this.setor = setor;
    }

    @Override
    public void apresentar() {
        System.out.println("Funcionário: " + nome + " | Setor: " + setor);
    }
}

