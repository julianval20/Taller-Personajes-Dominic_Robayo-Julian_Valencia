package personajes.humanos;

import personajes.abstractos.Cuerpo;

public class CuerpoHumano implements Cuerpo {
    @Override
    public String getNombre() { return "Cuerpo de Humano"; }
    @Override
    public String getDescripcion() { return "Versátil y adaptable, con gran capacidad de aprendizaje."; }
}
