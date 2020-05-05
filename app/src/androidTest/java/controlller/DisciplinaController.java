package controlller;

import java.util.ArrayList;
import java.util.List;

import model.Disciplina;

public class DisciplinaController {

    private Disciplina disciplina;
    private List<Disciplina> listaDisciplinas;

    public DisciplinaController() {
        disciplina = new Disciplina();
        listaDisciplinas = new ArrayList<>();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void cadastrar(){
        listaDisciplinas.add(disciplina);
    }
}
