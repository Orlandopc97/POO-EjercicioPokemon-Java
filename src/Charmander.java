public class Charmander extends Pokemon implements IFuego{


    //Constructor
    public Charmander(){

    }

    //Métodos que extiende de la clase abstracta Pokemon (clase madre)
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque Placaje");

    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Charmander y este es mi ataque Arañazo");

    }

    @Override
    protected void atacarMordico() {
        System.out.println("Hola soy Charmander y este es mi ataque Mordisco");

    }

    @Override
    public void atacarPuñoFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Puño Fuego");

    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y este es mi ataque Lanzallamas");

    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque Ascuas");

    }
}
