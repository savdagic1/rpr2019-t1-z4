package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int stvarniBrojArtikala=0;

    public boolean dodajArtikl(Artikl a) {

           if(stvarniBrojArtikala<50){
               artikli[stvarniBrojArtikala] = new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
               stvarniBrojArtikala++;
               return true;
           }

        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        for(int i = 0; i < stvarniBrojArtikala; i++){

            if(artikli[i].getKod().equals(kod)){
                Artikl pomArtikl = new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(), artikli[i].getKod());
                for(int j = i+1; j<stvarniBrojArtikala; j++){
                    artikli[j-1] = artikli[j];
                }
                artikli[stvarniBrojArtikala] = null;
                stvarniBrojArtikala--;
                return pomArtikl;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int pomCijena = 0;
        for (int i = 0; i < artikli.length; i++) {
            pomCijena += artikli[i].getCijena();
        }
        return pomCijena;
    }
}
