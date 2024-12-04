package sistemaPeaje;

public class Carro extends Vehiculo{
    static int valorPeaje = 10000;

    public Carro(String placa){
        super(placa);
    }

    public int getValorPeaje(){
        return valorPeaje;
    }

    static void setValorPeaje(int valorPeaje){
        valorPeaje = valorPeaje;
    }

    void imprimir(){
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }
}
