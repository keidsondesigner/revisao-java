package test;

import heranca.Aluno;
import heranca.Evento;
import heranca.LocalEvento;
import heranca.Professor;

public class AssociacaoTest {

  public static void main(String[] args) {

    Aluno aluno = new Aluno("Arthur", 16);
    Professor professor = new Professor("João Pedro", "Java");
    LocalEvento localEvento = new LocalEvento("Rua dos bobos, 0");
    Evento evento = new Evento("POO com Java", new Aluno[] {aluno}, localEvento);

    Evento[] eventosDisponiveis = {evento};

    professor.setEventos(eventosDisponiveis);

    professor.imprimir();
  }
}
