import java.util.ArrayList;
import java.util.Collections;

public class Tarefa_coleções {
    public static void main(String[] args) {
        ArrayList<String> listaNome=new ArrayList();
        listaNome.add("Pâmela");
        listaNome.add("Alexandre");
        listaNome.add("kaik");
        listaNome.add("Gustavo");
        Collections.sort(listaNome);

        System.out.println(listaNome);



    }
}
