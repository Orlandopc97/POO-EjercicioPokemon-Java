public class Bulbasaur extends Pokemon implements IPlanta  {

    //Constructor
    public Bulbasaur(){

    }

    //Métodos que extiende de la clase abstracta Pokemon (clase madre)
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordico() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Mordisco");
    }

    //Métodos que se implementan de la interfaz del tipo del pokemon(IPlanta)
    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Paralizar");
    }

    @Override
    public void atacarHojasNavaja() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque Hojas Navaja");
    }
}
