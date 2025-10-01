package LSP;

public class Gato extends Mamifero{

    @Override
    public void comer() {
        System.out.println("hora del ricocat");
    }

    @Override
    public void nadar() {
        throw new ArithmeticException("no me baño");
    }

    
    
}
