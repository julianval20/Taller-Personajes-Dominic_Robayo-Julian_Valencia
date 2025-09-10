package personajes.elfos;

import personajes.abstractos.Montura;

public class MonturaElfica implements Montura {
    @Override
    public String getNombre() { return "Gran Águila"; }
    @Override
    public String getDescripcion() { return "Una majestuosa criatura alada que permite atacar desde el aire."; }
}
