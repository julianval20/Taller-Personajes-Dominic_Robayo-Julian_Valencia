package personajes.elfos;

import personajes.abstractos.Armadura;

public class ArmaduraElfica implements Armadura {
    @Override
    public String getNombre() { return "Armadura ligera élfica"; }
    @Override
    public String getDescripcion() { return "Confeccionada con materiales élficos, ofrece protección sin sacrificar agilidad."; }
}
