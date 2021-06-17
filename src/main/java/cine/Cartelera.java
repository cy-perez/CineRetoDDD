package cine;

import cine.values.*;
import co.com.sofka.domain.generic.Entity;

public class Cartelera extends Entity <CarteleraId> {

    private Horario horario;
    private Pelicula pelicula;
    private Formato formato;
    private Precio precio;

    public Cartelera (CarteleraId entityId, Horario horario, Pelicula pelicula, Formato formato, Precio precio){
        super(entityId);
        this.horario = horario;
        this.pelicula = pelicula;
        this.formato = formato;
        this.precio = precio;

    }

    public void modificarHorario(Horario horario){
        this.horario = horario;
    }

    public void modificarPelicula(Pelicula pelicula){
        this.pelicula = pelicula;
    }

    public void modificarFormatoDePelicula(Formato formato){
        this.formato = formato;
    }

    public void modificarPrecioDePelicula(Precio precio){
        this.precio = precio;
    }
}
