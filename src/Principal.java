import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> nomeDaLista = new ArrayList<>(Arrays.asList("vitor", "luan", "jose", "atilio"));
        ArrayList<Integer> outroNomeDaLista = new ArrayList<>(Arrays.asList(12, 20, 30, 50));
        ArrayList<Object> maisUmNomeDeLista = new ArrayList<>(Arrays.asList("B", "K", nomeDaLista, 10, 20, "J", outroNomeDaLista));

        ListaESubLista listTeste = new ListaESubLista(maisUmNomeDeLista);


        listTeste.metodoTeste();

    }
}
