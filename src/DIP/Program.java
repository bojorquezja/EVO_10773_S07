package DIP;

public class Program {
    public static void main(String[] args) {
        //Carro c1 = new Carro();
        //Carro2 c2 = new Carro2(new MotorElectrico(), new PuertaNormal());
        Carro3 c3 = new Carro3(new MotorGasolina(), new PuertaNormal());
    }
}
