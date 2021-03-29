package ec.carper.altioracorp.model;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
@Tab(properties="apellido, nombre")
public class Cliente  extends Identifiable {
	
	@Column(length=50) @Required
	private String nombre;
	
	@Column(length=50) @Required
	private String apellido;

    @Hidden
    public String getDescripcion(){
        return apellido + " " + nombre;
    }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
