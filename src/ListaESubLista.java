import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaESubLista {


    private ArrayList<Object> maisUmaOutraLista;

    public ListaESubLista(ArrayList<Object> maisUmaOutraLista) {
        this.maisUmaOutraLista = maisUmaOutraLista;
    }



    public void metodoTeste(){

        ArrayList<?> subLista = null;
        boolean condicaoLista = false;
        int i = 0;
        int novoIndice = 0;
        int condicaoDoFor = maisUmaOutraLista.size();
        for ( i = 0; i < condicaoDoFor; i++) {
            if (!condicaoLista) {
                System.out.println(maisUmaOutraLista.get(i));
                if (maisUmaOutraLista.get(i) instanceof ArrayList) {
                    Object subList = maisUmaOutraLista.get(i);
                    novoIndice = i + 1;
                    i = 0;
                    condicaoDoFor = ((ArrayList) subList).size();
                    subLista = (ArrayList<?>) subList;
                    condicaoLista = true;
                }
            }
            if (condicaoLista) {
                System.out.println(subLista.get(i));
                if (i == subLista.size() -1) {
                    i = novoIndice - 1;
                    condicaoDoFor = maisUmaOutraLista.size();
                    condicaoLista = false;
                }
            }


        }



   }
}

