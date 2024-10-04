public class metodoOrdenamiento {
    public int[] sortBubbleAva(int[] arreglo){
        int n = arreglo.length;
        boolean in;
        for (int i = 0; i < n; i++){
            in = false;
            System.out.println("Pasada "+i);
            for(int j = 0; j<n-1-i;j++){
                System.out.println("j="+j+" [j]="+arreglo[j] + "j+1="+j+1+" [j+1]="+ arreglo[j+1]);
                if (arreglo[j]>arreglo[j+1]) {
                    System.out.println("Si hay cambio");
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    in = true;
                }

            }if(!in){   
                break;
            }       
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
    }
    
}
