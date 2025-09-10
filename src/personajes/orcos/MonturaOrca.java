package personajes.orcos;

import personajes.abstractos.Montura;

public class MonturaOrca implements Montura {
    @Override
    public String getNombre() { return "Lobo Gigante"; }
    @Override
    public String getDescripcion() { return "Feroz y veloz, criado para la guerra y la caza."; }
}
