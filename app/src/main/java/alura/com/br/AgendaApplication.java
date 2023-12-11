package alura.com.br;

import android.app.Application;

import alura.com.br.dao.AlunoDAO;
import alura.com.br.ui.activity.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Thiago", "22222222", "abc@abc.com"));
        dao.salva(new Aluno("Aluno 2", "33333333", "def@abc.com"));
    }
}
