// Komentārs - programmas koda daļa, kas palīdz programmas izstrādātājiem labāk izprast koda darbības principus.
// Programmas darbības laikā komentāri netiek ņemti vērā. 

// - Vienas rindas komentārs

/* 
 * Vairāku
 * rindu
 * komentārs
 *  */ 
 

package lv.jak.cvetkovs.sintakse;  //pakotne - klases atrašanās vieta projektā

// import komanda- komandrinda, kas nodrošina citas klases vai pakotnes piesaisti šai klasei.
// Tādā veidā tiek nodrošinātas dažādu funkciju izmantošanas iespējas šajā klasē, piemēram,
// datu ievade no tastatūras.
/*
 * Iespējamās pieraksta formas:
 * import <pakotne>.<klase>;
 * import <pakotne>.*
 */ 
import java.util.Scanner;

// JAVA klases daļa - galvenā programmēšanas daļa
// Klases nosaukums
/*
 * Sintakses nosacījumi uz klases nosaukumu
 *       1. Klases nosaukums sākas ar lielo burtu
 *       2. Ja klases nosaukums satur vairākus vārdus, katrs vārds sākas ar lielo burtu
 *       3. Nosaukums var saturēt TIKAI BURTUS un CIPARUS
 *       4. Ja klases nosaukums satur vairākus vārdus, tos ar atstarpēm NEATDALA!!!
 */
public class Sintakse {
	// Klases ķermenis - šajā daļā aprakstītais koda fragments ir pieejams visai klasei,
	// izņēmuma nosacījums - aprakstītās lietas ir redzamas tikai tai daļai koda, kas atrodas zemāk!
	// !!! NEDRĪKST rakstīt funkcionālus procesus, izņemots vērtības piešķiršanu vai objekta izveidi!
	
	// Mainīgie - programmēšanas valodas pamatelements 
	/* 
	 * Sintakses nosacījumi uz mainīgā nosaukumu
	 *     1. Mainīgā nosaukums sākas ar mazo burtu
	 *     2. Ja mainīgā nosaukums satur vairākus vārdus, pirmais vārds ar mazo, katrs nākamais vārds ar lielo burtu
	 *     3. Ja mainīgā nosaukums satur vairākus vārdus, tos ar atstarpēm NEATDALA!!! 
	 *     4. Nosaukums var saturēt TIKAI BURTUS un CIPARUS!!!
	 *     
	 *     Izņemuma gadījumi:
	 *        1.
	 *        2.
	 */
	// Mainīgā izveidošana
	/* Pieraksta forma:
	 *     --> ja iepriekš mainīgais NAV izveidots: <datuTips> <mainigaNosaukums>;
	 */
	int veselsSkaitlis;
	
	
    // metodes MAIN - galvenā metode.
	/* 
	 * MAIN metode: 
	 *      1. Uz projektu jābūt VISMAZ 1 MAIN metodei
	 *      2. Metodes pieraksts ir TIEŠI tāds, kāds redzams zemāk pierakstā 
	 */
	
	public static void main(String[] args) {
        // metodes ķermenis - aprakstam algoritmu, kuru vēlamies izpildīt  
	}
	
	
// Klases ķermenis ir beidzies	
} 
// !!! NEKO ŠEIT NEDRĪKST RAKSTĪT.