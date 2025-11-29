import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {

    private final List<Command> historico = new ArrayList<>();

    public void executar(Command comando) {
        comando.execute();
        historico.add(comando);
    }

    public void salvarHistorico() {
        StringBuilder sb = new StringBuilder();

        for (Command c : historico) {
            c.store(sb);  
        }

        try (FileWriter fw = new FileWriter("historico.txt")) {
            fw.write(sb.toString());  
        } catch (IOException e) {
            System.out.println("Erro ao salvar histórico: " + e.getMessage()); 
        }
    }

    public void restaurar() {
        for (Command c : historico) {
            c.load();  
        }
    }
}
