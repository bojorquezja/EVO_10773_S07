
/**
 *
 * inyeccion de dependencia + inversion de dependencia
 */
public class Carro3 {
    public Carro3(Motor m, Puerta p1) {
        m.arrancar();
        p1.abrir();
    }
}
