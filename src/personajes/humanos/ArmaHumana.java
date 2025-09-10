package personajes.humanos;

import personajes.abstractos.Arma;

public class ArmaHumana implements Arma {
    @Override
    public String getNombre() { return "Espada de Acero"; }
    @Override
    public String getDescripcion() { return "Arma equilibrada, ideal para ataque y defensa."; }
}
