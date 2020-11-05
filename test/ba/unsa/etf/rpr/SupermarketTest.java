package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
@Test
    public void testDodajArtikl(){
    Supermarket s = new Supermarket();
    assertEquals(true,s.dodajArtikl(new Artikl("Biciklo", 1000, "1")));

}

@Test
    public void testIzbaciArtiklSKodom1(){
    Supermarket s = new Supermarket();
    s.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
    s.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
    assertEquals(null,s.izbaciArtiklSaKodom("3"));

}
@Test
    public void testIzbaciArtiklSKodom2(){
    Supermarket s = new Supermarket();
    s.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
    s.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
    assertEquals(new Artikl("Biciklo", 1000, "2"),s.izbaciArtiklSaKodom("2"));
}

}