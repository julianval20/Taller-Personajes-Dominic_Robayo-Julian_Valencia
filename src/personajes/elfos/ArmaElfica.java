package personajes.elfos;

import personajes.abstractos.Arma;

public class ArmaElfica implements Arma {
    @Override
    public String getNombre() { return "Arco Largo Élfico"; }
    @Override
    public String getDescripcion() { return "Preciso y letal a largas distancias, fabricado con maderas sagradas."; }
}
