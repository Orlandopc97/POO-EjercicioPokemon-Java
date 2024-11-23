public abstract class Pokemon  {

    //Atributos en comun (caracteristicas)
    //Solo las clases hijas puedan tener acceso
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    //Método abstracto por que no tiene implementsacion, solo se define
    protected abstract void atacarPlacaje();
    protected abstract void atacarArañazo();
    protected abstract void atacarMordico();


}
//que hace = interfaz
//que es = clase abstracta
