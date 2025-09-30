public class Carro {

    public Carro() {
        MotorGasolina m = new MotorGasolina();
        PuertaAlaGaviota p1 = new PuertaAlaGaviota();
        m.arrancar();
        p1.abrir();
    }
    
}
