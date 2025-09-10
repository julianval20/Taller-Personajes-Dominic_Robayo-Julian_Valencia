package personajes.elfos;

import personajes.abstractos.Cuerpo;

public class CuerpoElfo implements Cuerpo {
    @Override
    public String getNombre() { return "Cuerpo de Elfo"; }
    @Override
    public String getDescripcion() { return "Ágil y esbelto, con gran resistencia mágica y longevidad."; }
}
