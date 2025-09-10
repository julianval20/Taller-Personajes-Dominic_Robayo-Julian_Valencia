package personajes.humanos;

import personajes.abstractos.Montura;

public class MonturaHumana implements Montura {
    @Override
    public String getNombre() { return "Caballo de Guerra"; }
    @Override
    public String getDescripcion() { return "Rápido y leal, usado por los caballeros en combate."; }
}
