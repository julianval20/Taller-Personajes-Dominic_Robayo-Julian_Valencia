package personajes.enanos;

import personajes.abstractos.Armadura;

public class ArmaduraEnana implements Armadura {
    @Override
    public String getNombre() { return "Armadura Reforzada Enana"; }
    @Override
    public String getDescripcion() { return "Construida en las forjas subterráneas, extremadamente duradera."; }
}
