import kayttis.Kayttoliittyma;
import kysymykset.Kysymys;
import kysymykset.Kysymystenlukija;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Kysymystenlukija kys = new Kysymystenlukija(); // kysymysten lukijasta luodaan olio
        List<Kysymys> kysymykset = kys.kysymyslista(); // kysymyslukkija oliosta luodaan main - metodissa lista
        Kayttoliittyma kl = new Kayttoliittyma(kysymykset); // käyttöliittymälle annetaan parametriksi kysymykset
        kl.kaynnista();
    }
}


//Perustoiminnallisuus
//        Toteuta ohjelma, jossa on yli 10 kysymystä ja kysy niistä satunnaisessa järjestyksessä
//        Ohjelma antaa yksi kerrallaan käyttäjälle kysymyksen/väitteen ja siihen muutaman vaihtoehdon, joista yksi on oikein.
//        Tämän jälkeen luetaan käyttäjän vastaus. Lopuksi kerrotaan käyttäjän saamat pisteet.
//
//        Toteutus

//Pääohjelma on silmukka, joka käy läpi 10 kysymystä yksi kerrallaan ja lukee käyttäjän vastauksen,
//        lopuksi tulostus.Kysymykset talletetaan esimerkiksi listaan,
//        se on helppo sekoittaa satunnaiseen järjestykseen ja ottaa siitä kymmenen ensimmäistä.
//        Listan alkiona Kysymys-luokan olioita. Kysymys-luokan voi rakentaa esimerkiksi seuraavien jäsenten pohjalta:

// kysymykset toteutettu tiedostoon