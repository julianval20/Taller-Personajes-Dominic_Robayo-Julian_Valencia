package personajes.orcos;

import personajes.abstractos.Arma;

public class ArmaOrca implements Arma {
    @Override
    public String getNombre() { return "Hacha de Guerra Doble"; }
    @Override
    public String getDescripcion() { return "Enorme y devastadora, ideal para destrozar escudos y armaduras."; }
}
