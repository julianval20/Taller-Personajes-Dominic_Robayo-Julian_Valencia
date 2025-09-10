package personajes.enanos;

import personajes.abstractos.*;

public class FabricaEnanos implements FabricaPersonajes {
    @Override public Cuerpo crearCuerpo() { return new CuerpoEnano(); }
    @Override public Armadura crearArmadura() { return new ArmaduraEnana(); }
    @Override public Montura crearMontura() { return new MonturaEnana(); }
    @Override public Arma crearArma() { return new ArmaEnana(); }
}
