package personajes.humanos;

import personajes.abstractos.*;

public class FabricaHumanos implements FabricaPersonajes {
    @Override public Cuerpo crearCuerpo() { return new CuerpoHumano(); }
    @Override public Armadura crearArmadura() { return new ArmaduraHumana(); }
    @Override public Montura crearMontura() { return new MonturaHumana(); }
    @Override public Arma crearArma() { return new ArmaHumana(); }
}
