package ec.carper.altioracorp.model;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
public class OrdenDetalle extends Identifiable{

    @ManyToOne
    private Orden orden;
    
    @ManyToOne(fetch=FetchType.LAZY) 
    @DescriptionsList @NoCreate @NoModify //@ReadOnly
    private Articulo articulo;

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

}
