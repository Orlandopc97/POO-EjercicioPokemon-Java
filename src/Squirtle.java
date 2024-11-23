public class Squirtle extends Pokemon implements IAgua {



    //Constructor
    public Squirtle(){

    }

    //Métodos que extiende de la clase abstracta Pokemon (clase madre)
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque Placaje");

    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque Arañazo");

    }

    @Override
    protected void atacarMordico() {
        System.out.println("Hola soy Squirtle y este es mi ataque Mordisco");

    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque Hidrobomba");

    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque Burbujas");

    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque Pistola agua");

    }
}
