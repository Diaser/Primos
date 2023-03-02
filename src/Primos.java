public class Primos {
    boolean esPrimo = true;
    int numeroOriginal;

    Primos(int numeroOriginal){
      this.numeroOriginal = numeroOriginal;
    }


    public void imprimirPrimos(int numero){

        int aux = numero-1;
        if (aux == 1)
            return;
        if(( numeroOriginal % aux ) == 0) {
            esPrimo = false;
        }
        else imprimirPrimos(numero -1);
        if (esPrimo==true)
            System.out.println("Es primo: " + numero);
    }
}
