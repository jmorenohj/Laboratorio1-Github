public class ExponentiationJm {
    int potencia;
    int base;

    public void potenciar(){
        int iterador=1;
        for(int i=0;i<potencia;i++){
            iterador*=base;
        }
        System.out.println(iterador);
    }
}
