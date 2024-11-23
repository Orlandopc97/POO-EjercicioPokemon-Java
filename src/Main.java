public class Main {
    public static void main(String[] args) {

        //Crear los objetos pokemon
        Squirtle squirtle1 = new Squirtle();
        Charmander charmander1 = new Charmander();
        Pikachu pikachu1 = new Pikachu();
        Bulbasaur bulbasaur1 = new Bulbasaur();


        squirtle1.atacarArañazo();
        squirtle1.atacarHidrobomba();

        charmander1.atacarArañazo();
        charmander1.atacarLanzallamas();

        bulbasaur1.atacarArañazo();
        bulbasaur1.atacarDrenaje();

        pikachu1.atacarArañazo();
        pikachu1.atacarImpactrueno();

    }
}

/*
    Cuando utilizar CLASES ABSTRACTAS y las INTERFACES
        -que hace = interfaz
        -que es = clase abstracta

 */