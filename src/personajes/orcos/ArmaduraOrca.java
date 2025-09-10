package personajes.orcos;

import personajes.abstractos.Armadura;

public class ArmaduraOrca implements Armadura {
    @Override
    public String getNombre() { return "Armadura de Huesos y Hierro"; }
    @Override
    public String getDescripcion() { return "Pesada y tosca, hecha con restos de enemigos y metal reciclado."; }
}
