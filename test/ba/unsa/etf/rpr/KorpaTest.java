package ba.unsa.etf.rpr;

 import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
@Test
    public void testIzbacivanjaArtiklaSKodom(){

    Korpa k = new Korpa();
    k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
    k.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
    assertEquals(new Artikl("Biciklo", 1000, "2"), k.izbaciArtiklSaKodom("2"));

}

@Test
    public void testDodavanjaUKorpu(){
    Korpa k = new Korpa();

    boolean pom = k.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
    assertEquals(true,pom);

}

}