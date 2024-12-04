package sistemaPeaje;

public class Moto extends Vehiculo{
    static int valorPeaje = 5000;

    public Moto(String placa){
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
