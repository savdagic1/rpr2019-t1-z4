package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtiklTest {
@Test
    public void testKonstruktora(){
    Artikl a = new Artikl("Biciklo", 1000, "1");
    assertEquals(new Artikl("Biciklo", 1000, "1"), a);
}


}