package Tarefa_Coleções_2;

import java.util.ArrayList;
import java.util.Collections;

public class Tarefa_Coleções_2 {
    public static void main(String[] args) {
        ArrayList<String> listaNomeMasculino=new ArrayList();
        ArrayList<String> listaNomeFemenino= new ArrayList();
        listaNomeFemenino.add("Pâmela-F");
        listaNomeMasculino.add("Alexandre-M");
        listaNomeMasculino.add("kaik-M");
        listaNomeMasculino.add("Gustavo-M");
        listaNomeFemenino.add("Maria-M");
        Collections.sort(listaNomeMasculino);
        Collections.sort(listaNomeFemenino);

        System.out.println("Masculino: " + listaNomeMasculino);
        System.out.println("Femenino: " + listaNomeFemenino);

    }
}
