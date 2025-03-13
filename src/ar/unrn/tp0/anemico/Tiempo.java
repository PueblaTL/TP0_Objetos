package ar.unrn.tp0.anemico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class Tiempo { 
    private LocalDateTime tiempo;

    public Tiempo() {
        this.tiempo = LocalDateTime.now();
    }

    public void obtenerFechaLarga() { 
    	this.tiempo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
 
    public void obtenerFechaCorta() {
    	this.tiempo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
