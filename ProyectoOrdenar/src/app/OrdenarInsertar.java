package app;

public class OrdenarInsertar {
        
    public OrdenarInsertar() {
        super();
    }
    
    public void getListaOrdenar(Integer[] lista) {
        //Control
        listaOrdenar(lista);
    }    
    
    private void listaOrdenar(Integer[] lista) {
        //Código
        
        int valor=0, j=0, i=0;
        
        int N = lista.length;
        
        for(i=1; i<N; i++){
            valor=lista[i];
            j=i-1;
            while(j>=0 && lista[j]>valor){
                lista[j+1]=lista[j];
                j--;
            }
            lista[j+1]=valor;
        }
    }
    
    
}
