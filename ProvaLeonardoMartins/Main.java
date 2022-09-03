package ProvaLeonardoMartins;
public class Main {
        public static void main(String[] args) throws Exception {
            Aluno Cuevas = new Aluno (002, "Cuevas", 10, 10, 10, false, null);
          // Aluno Leo = new Aluno(001, "Leonardo", 8, 7, 6, true, Cuevas);
           Cuevas.calcNotas(Cuevas.getNota1(), Cuevas.getNota2(), Cuevas.getNotatrab());
           Cuevas.mostrarMonitor();
        }
}

