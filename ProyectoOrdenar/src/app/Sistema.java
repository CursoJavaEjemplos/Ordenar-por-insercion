package app;

public class Sistema {
    
    private static int N = 5;
    private static Integer[] lista = new Integer[N];
  
    
    private static OrdenarInsertar oi = new OrdenarInsertar();
    private static Sistema sistema = new Sistema();
    public Sistema() {
        super();
    }

    public static void main(String[] args) {
        
        System.out.println(sistema.getClass().getName());
        
        int i = 0; 
        
        for(i=0; i<N; i++){
            lista[i] = new Integer(0);
        }
        
        for(i=0; i<N; i++){
          lista[i] = (int) Math.floor(Math.random() * 10);
          System.out.println("*" + lista[i]);
        }

        System.out.println(oi.getClass().getName());
        
        oi.getListaOrdenar(lista);
        
        for(i=0; i<N; i++){
           System.out.println(lista[i]);
        }
           
    }
   
}
