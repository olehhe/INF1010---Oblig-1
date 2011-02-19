package inf1010.assignment;

import java.util.Iterator;
import org.testng.annotations.*;
import static org.testng.Assert.*;


@Test
public class HumanTest {

	///////////////////////////////////////////////////////////////////////////
	//
	// Nedenfor finner du 2 test-metoder som er halvferdige. Fjern kommentaren
	// rundt test-metodene, og følg instruksjonene i enden av hver av
	// test-metodene for å fullføre testene.
	//
	// I eksemplene nedenfor regner vi med at du har laget en Human-klasse med
	// en konstruktør som ser slik ut:
	//
	//     Human(String name)
	//
	// Altså må du endre eksemplene slik at de passer til din Human-klasse.
	//
	// Testene viser bruk av assertTrue() og assertEquals(). Hvis du ønsker å
	// benytte andre assert*-metoder, eller vil se dokumentasjonen, se:
	// http://testng.org/javadocs/org/testng/Assert.html
	//
	// Merk at det eneste som er nytt med denne koden er at det står
	// @Test over metodene. Det er bare for at testsystemet skal kunne skille
	// test-metoder fra vanlige metoder. Ellers er det bare helt vanlig
	// javakode. Hver av disse @Test metodene kjøres uavhengig av hverandre.
	//
	// Under metodene som allerede finnes, skal du lage 3 testmetoder som 
	// tester funksjonaliteten for å:
	//    - registrere venner
	//    - avregistrere venner
	//    - sjekke om et vesen har en gitt Creature som venn.
	// Navnene på disse metodene velger du selv. For at de skal 
	// kjøres må de annoteres med @Test slik som med compareTo og iterator.
	//
	///////////////////////////////////////////////////////////////////////////



	/* ------------------- Slett denne linja ----------------------

	@Test
	public void compareTo() {
		Creature superman = new Human("Superman");
		Creature batman = new Human("Batman");
		Creature superman_wannabe = new Human("Superman");

		// Slik kan du teste om resultatet fra compareTo stemmer:
		assertTrue(superman.compareTo(superman_wannabe) == 0);

		// Lag tester for de andre to mulige utfallene av compareTo()
	}

	
	@Test
	public void iterator() {
		Creature superman = new Human("Superman");
		Creature batman = new Human("Batman");

		// Her regner vi med at din metode for å registrere venner på et
		// vesen heter registerFriend(). Dette må du endre hvis du har
		// valgt et annet navn på metoden.
		superman.registerFriend(batman);

		// Tester at første element i iteratoren til superman er batman:
		Iterator<Creature> it = superman.iterator();
		assertEquals(it.next(), batman);

		// Utvid denne testen slik at superman har minst 3 venner,
		// og test at iteratoren inneholder alle vennene.
	}
	
	------------------- Slett denne linja ---------------------- */


}
