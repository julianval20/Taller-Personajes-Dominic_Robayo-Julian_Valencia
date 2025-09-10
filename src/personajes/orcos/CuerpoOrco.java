package personajes.orcos;

import personajes.abstractos.Cuerpo;

public class CuerpoOrco implements Cuerpo {
    @Override
    public String getNombre() { return "Cuerpo de Orco"; }
    @Override
    public String getDescripcion() { return "Musculoso y resistente, preparado para el combate brutal."; }
}
