package personajes.elfos;

import personajes.abstractos.*;

public class FabricaElfos implements FabricaPersonajes {
    @Override public Cuerpo crearCuerpo() { return new CuerpoElfo(); }
    @Override public Armadura crearArmadura() { return new ArmaduraElfica(); }
    @Override public Montura crearMontura() { return new MonturaElfica(); }
    @Override public Arma crearArma() { return new ArmaElfica(); }
}
