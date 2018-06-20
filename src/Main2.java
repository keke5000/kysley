import kayttis.Kayttoliittyma;
import kysymykset.Kysymys;
import kysymykset.Kysymystenlukija;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        kysely1oikea kysely = new kysely1oikea();
        kysely.kysymysOhjelma();

//        kysley2oikea kysely2 = new kysley2oikea();
//        kysely2.kaynnistaKysley2();


//        Kysymystenlukija kys = new Kysymystenlukija(); // kysymysten lukijasta luodaan olio
//        List<Kysymys> kysymykset = kys.kysymyslista(); // kysymyslukkija oliosta luodaan main - metodissa lista
//        Kayttoliittyma kl = new Kayttoliittyma(kysymykset); // käyttöliittymälle annetaan parametriksi kysymykset
//        kl.kaynnista();
    }
}