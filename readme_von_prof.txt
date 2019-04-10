/**
 * Grobstruktur des Projekts:
 * - src/		Quellcode (inkl. GUI, Persistenzschicht und deren Konfiguration)
 * - database/	Skripte zum Anlegen, F�llen und L�schen der MySQL(!)-Datenbank
 * - lib/ 		Ben�tigte Libraries f�r EclipseLink und JDBC (mysql-... f�r MySQL)
 *
 * Anleitung:
 * - Anlegen der MySQL-Datenbank
 *   Zugang zur MySQL-DB �ber Workbench oder phpMyAdmin (Browser) - vgl. Infoseite
 *   in Moodle.
 *   Skripte create-....sql und insert-....sql im eigenen MySQL-Bereich ausf�hren. 
 *   Hinweis zum create-Skript: das erste Kommando 'DELIMITER ...' ist NUR in der
 *    Workbench auszuf�hren, in phpMyAdmin diese Zeile weglassen und im Formular
 *    als Begrenzer das ;; eintragen!
 *   Sollte noch kein Bereich existieren, da Datenbanken1 nicht im WS18/19 besucht 
 *   wurde, bitte bei Frau Busse melden.
 *   Hinweis an diejenigen, die einen lokal installierten MySQL-Server unter
 *    Windows nutzen: der Server muss die Tabellen case-sensitive anlegen, d.h.
 *    nicht alles in Gro�buchstaben umwandeln. Bei Problemen die Servervariable
 *    lower_case_table_names im Options File umsetzen.
 *
 * - Konfiguration der Persistenzschicht
 *   Die Konfigurationsdatei src/META-INF/persistence.xml muss angepasst werden. 
 *   Es sind (weiter unten) die Properties user und password f�r die von
 *   Ihnen gew�hlten DB anzupassen. Bei MySQL muss dar�ber hinaus auch die
 *   Property url angepasst werden: ganz hinten steht der Datenbankname - bei
 *   den DBs an der TH ist dies immer USER_db
 *
 * - Classpath um die passenden libs erweitern
 *   Falls noch nicht drin, hinzuf�gen:
 *    - die jars unter lib/eclipselink... und
 *    - MySQL: lib/jdbc/mysql-...jar 
  *
 * - Ausfuehren des Prototyps
 *   Das Hauptprogramm der Schichtenarchitektur ist zu finden in de.fhb.formel1.gui.controller:
 *   Start.java
 *   Ausf�hren als Java Application...
 *   Es kann beim ersten Starten etwas l�nger dauern! Es geht dann aber 
 *   ein Fenster auf, in dem eine Saison ausgesucht werden kann, zu der die 
 *   bereits geplanten Rennen angezeigt werden sollen.
 *   Etwaige Fehler, die mit der Datenbankanbindung zu tun haben, treten gleich
 *   beim Start auf, wenn die Persistenzschicht initialisiert wird.
 * 
 * - Die Persistenzschicht wurde generiert, wobei MySQL als Basis verwendet wurde, und
 *   weitestgehend so belassen. Daher bitte nicht �ber manch seltsame Methodennamen
 *   wundern. Es wurde bisher auch nur die Beispielapplikation getestet. Daher kann es sein,
 *   dass es bei Aufrufen anderer Methoden der Persistenzschichten zu Fehlern in EclipseLink kommt.
 *   In diesem Fall hilft Frau Busse gern weiter.
 *   Die Beispielapplikation sollte aber, wie gesagt, in jedem Fall laufen.
 *   
 * Gutes Gelingen!
  
 * @author Susanne Busse, Gabriele Schmidt
 */