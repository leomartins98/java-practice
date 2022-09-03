package ProvaLeonardoMartins;

public class Aluno {
    int matricula;
    String nome;
    double nota1;
    double nota2;
    double notatrab;
    boolean monitor;
    Aluno nomeMonitor;

    public Aluno(int matricula, String nome, double nota1, double nota2, double notatrab, boolean monitor, Aluno nomeMonitor) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notatrab = notatrab;
        this.monitor = monitor;
        this.nomeMonitor = nomeMonitor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotatrab() {
        return notatrab;
    }

    public void setNotatrab(double notatrab) {
        this.notatrab = notatrab;
    }
    
    public void calcNotas (double nota1, double nota2, double notatrab){
        double notaTotal = ((2.5*nota1)+(2.5*nota2)+(2*notatrab))/7;
        System.out.println("Média: "+notaTotal);
        if (notaTotal>=8) {
            System.out.println(0);
        }
        else {
            provaFinal(notaTotal);
        }
    }
    
    public void provaFinal (double notaTotal) {
        double notaPF = 14-notaTotal;
        System.out.println("Nota que precisa para passar na PF:"+notaPF);
    }

    public void mostrarMonitor () {
        if (monitor){
            System.out.println(nomeMonitor.matricula);
            System.out.println(nomeMonitor.nome);
        }
        else {
            System.out.println("O aluno não tem monitor.");
        }
        }
    }


