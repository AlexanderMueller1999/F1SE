package de.thb.formel1.appl.transferObjects;

import java.io.Serializable;

/**
 * 
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
public class SaisonTransferObjekt implements Serializable {
	
	private static final long serialVersionUID = 8493791221976527371L;
	public int jahr;

}
