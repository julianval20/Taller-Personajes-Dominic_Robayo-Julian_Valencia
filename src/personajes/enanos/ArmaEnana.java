package personajes.enanos;

import personajes.abstractos.Arma;

public class ArmaEnana implements Arma {
    @Override
    public String getNombre() { return "Martillo de Guerra"; }
    @Override
    public String getDescripcion() { return "Poderoso y contundente, capaz de destruir armaduras y muros."; }
}
