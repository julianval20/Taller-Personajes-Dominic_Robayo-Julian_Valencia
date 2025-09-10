package personajes.orcos;

import personajes.abstractos.*;

public class FabricaOrcos implements FabricaPersonajes {
    @Override public Cuerpo crearCuerpo() { return new CuerpoOrco(); }
    @Override public Armadura crearArmadura() { return new ArmaduraOrca(); }
    @Override public Montura crearMontura() { return new MonturaOrca(); }
    @Override public Arma crearArma() { return new ArmaOrca(); }
}
