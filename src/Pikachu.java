public class Pikachu extends Pokemon implements IElectrico {

    //Constructor
    public Pikachu(){

    }

    //Métodos que extiende de la clase abstracta Pokemon (clase madre)
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque Placaje");

    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Arañazo");

    }

    @Override
    protected void atacarMordico() {
        System.out.println("Hola soy Pikachu y este es mi ataque Mordisco");

    }


    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impactrueno");

    }

    @Override
    public void puñoTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Puño trueno");

    }

    @Override
    public void atacarOndaVoltio() {
        System.out.println("Hola soy Pikachu y este es mi ataque Onda voltio");

    }
}

