package personajes.enanos;

import personajes.abstractos.Montura;

public class MonturaEnana implements Montura {
    @Override
    public String getNombre() { return "Jabalí de Batalla"; }
    @Override
    public String getDescripcion() { return "Un animal fuerte y agresivo, entrenado para embestir enemigos."; }
}
