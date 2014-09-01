package es.gobcantabria.aplicaciones.controlSuma.business.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TR_INVENTARIO_PERSONA database table.
 * 
 */
@Embeddable
public class InventarioPersonaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="INV_X_INVENTARIO", insertable=false, updatable=false)
	private long invXInventario;

	@Column(name="PER_X_PERSONA", insertable=false, updatable=false)
	private long perXPersona;

	public InventarioPersonaPK() {
	}
	public long getInvXInventario() {
		return this.invXInventario;
	}
	public void setInvXInventario(long invXInventario) {
		this.invXInventario = invXInventario;
	}
	public long getPerXPersona() {
		return this.perXPersona;
	}
	public void setPerXPersona(long perXPersona) {
		this.perXPersona = perXPersona;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InventarioPersonaPK)) {
			return false;
		}
		InventarioPersonaPK castOther = (InventarioPersonaPK)other;
		return 
			(this.invXInventario == castOther.invXInventario)
			&& (this.perXPersona == castOther.perXPersona);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.invXInventario ^ (this.invXInventario >>> 32)));
		hash = hash * prime + ((int) (this.perXPersona ^ (this.perXPersona >>> 32)));
		
		return hash;
	}
}