package DIP;


/**
 *
 * Inyeccion de dependencia
 */
public class Carro2 {
    public Carro2(MotorGasolina m, PuertaAlaGaviota p1) {
        m.arrancar();
        p1.abrir();
    }
}
