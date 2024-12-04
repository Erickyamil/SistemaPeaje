import sistemaPeaje.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Peaje peaje = new Peaje("La lizama", "Santander");
        Camion camion1 = new Camion("PKI-889", 2);
        peaje.añadirVehiculo(camion1);
        peaje.calcularPeaje(camion1);
        Camion camion2 = new Camion("KLM-123",3);
        peaje.añadirVehiculo(camion2);
        peaje.calcularPeaje(camion2);
        Camion camion3 = new Camion("PQI-234",4);
        peaje.añadirVehiculo(camion3);
        peaje.calcularPeaje(camion3);
        Moto moto1 = new Moto("ABC-123");
        peaje.añadirVehiculo(moto1);
        peaje.calcularPeaje(moto1);
        Moto moto2 = new Moto("XYZ-000");
        peaje.añadirVehiculo(moto2);
        peaje.calcularPeaje(moto2);
        Carro carro1 = new Carro("WVC-389");
        peaje.añadirVehiculo(carro1);
        peaje.calcularPeaje(carro1);
        Carro carro2 = new Carro("QWE-543");
        peaje.añadirVehiculo(carro2);
        peaje.calcularPeaje(carro2);
        peaje.imprimir();
    }
}
