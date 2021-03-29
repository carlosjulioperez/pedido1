package ec.carper.altioracorp.model;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
@Tab(properties="fecha, cliente.apellido, cliente.nombre")
public class Orden extends Identifiable {

	private LocalDate fecha;

    @ManyToOne(fetch=FetchType.LAZY) 
    @DescriptionsList @NoCreate @NoModify //@ReadOnly
    private Cliente cliente;

    @OneToMany (mappedBy="orden", cascade=CascadeType.ALL)
    private Collection<OrdenDetalle> detalle;

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Collection<OrdenDetalle> getDetalle() {
		return detalle;
	}

	public void setDetalle(Collection<OrdenDetalle> detalle) {
		this.detalle = detalle;
	}
    
}