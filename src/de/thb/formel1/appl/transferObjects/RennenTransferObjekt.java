package de.thb.formel1.appl.transferObjects;

import java.io.Serializable;
import java.util.Date;


/**
 * F�r das Transferobjekt wurden �ffentliche Attribute gew�hlt.
 * Der Kontruktor k�nnte wegfallen, hilft aber bei der schnellen Objekterzeugung
 * 
 * Transferobjekte sollten immer serialisierbar sein!
 * 
 * @author Susanne Busse
 * @version 0.1 
 * @since 03.04.2019
 * 
 */

public class RennenTransferObjekt implements Serializable{


	private static final long serialVersionUID = 8717044998189634615L;
	public Date datum;
	public String rennstrecke;
	public String land;
	
	
	public RennenTransferObjekt(Date datum, String rennstrecke, String land) {
		this.datum = datum;
		this.rennstrecke = rennstrecke;
		this.land = land;
	}

}
