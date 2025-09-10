package personajes.enanos;

import personajes.abstractos.Cuerpo;

public class CuerpoEnano implements Cuerpo {
    @Override
    public String getNombre() { return "Cuerpo de Enano"; }
    @Override
    public String getDescripcion() { return "Bajo y robusto, resistente a la fatiga y experto minero."; }
}
