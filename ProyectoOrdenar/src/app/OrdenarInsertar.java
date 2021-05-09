package app;

public class OrdenarInsertar {
        
    public OrdenarInsertar() {
        super();
    }
    
    public void getListaOrdenar(Integer[] lista) {
        //Control
        insercion(lista);
    }    
    
    private void insercion(Integer[] A) {    //INICIO insercion (A: lista de elementos)
    //Algoritmo: ordenar por inserción
        int valor=0, j=0, i=0;               //
        int N = A.length;                    //
        
        for(i=1; i<N; i++){                  //  PARA (ENTERO i = 1; i < longitud(A); i++) :
            valor=A[i];                      //    ENTERO valor = A[i]
            j=i-1;                           //    ENTERO j = i-1
            while(j>=0 && A[j]>valor){       //    MIENTRAS (j >= 0 && A[j] > valor)
                A[j+1]=A[j];                 //      A[j+1] = A[j]
                j--;                         //      j--
            }                                //    FIN_MIENTRAS
            A[j+1]=valor;                    //    A[j+1] = valor
        }                                    //  FIN_PARA
    }                                        //FIN
}
