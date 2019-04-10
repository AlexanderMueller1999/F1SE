
package de.thb.formel1.dao;

import java.util.List;

import de.thb.formel1.appl.transferObjects.RennenTransferObjekt;

/** 
 * Ist ein Interface f�r die Ermittlung von Medikamentartikeldaten
 *  Entspricht dem Entwurfsmuster Fassade
 * 
 * @author Susanne Busse
 * @version 0.1 
 * @since 03.04.2019
 * 
 */
public interface RennenDAOInterface {
	
	/**
	 * gibt die Menge aller Rennen mit Namen der Rennstrecke und des Landes zur�ck
	 * @return Rennen als Transferobjekte
	 */
	public List<RennenTransferObjekt> getAll();
	
	
	/**
	 * gibt die Menge aller Rennen einer bestimmten Saison zur�ck.
	 * @param jahr Jahr einer Saison
	 * @return Liste aller zugeordneten Rennen als Transferobjekte
	 */
	public List<RennenTransferObjekt> getBySaison(int jahr) ;


}
