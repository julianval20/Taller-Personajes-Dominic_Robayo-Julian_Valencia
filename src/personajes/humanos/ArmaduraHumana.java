package personajes.humanos;

import personajes.abstractos.Armadura;

public class ArmaduraHumana implements Armadura {
    @Override
    public String getNombre() { return "Armadura de Caballero Humano"; }
    @Override
    public String getDescripcion() { return "Forjada en acero, balanceada entre defensa y movilidad."; }
}
