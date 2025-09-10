// FabricaPersonajes.java
package personajes.abstractos;

public interface FabricaPersonajes {
    Cuerpo crearCuerpo();
    Armadura crearArmadura();
    Montura crearMontura();
    Arma crearArma();
}