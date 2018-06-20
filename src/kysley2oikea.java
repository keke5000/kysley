
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class kysley2oikea {

        private int pisteet;
        private int kysymykset;
        private Scanner lukija;
        private List<Kysymys2> kysymyslista;
        //private Kysymys2 kysymys2;

        public kysley2oikea() {
            //int pisteet, int kysymykset, Scanner lukija, List<Kysymys2> kysymyslista, Kysymys2 kysymys2
            this.pisteet = 0;
            this.kysymykset = 0;
            this.lukija = new Scanner(System.in);
            this.kysymyslista = new ArrayList<>();
           // this.kysymys2 = kysymys2;
        }


        public void kaynnistaKysley2(){


            //int pisteet = 0;
            //int kysymykset = 0;

            //Scanner lukija = new Scanner(System.in);

            //List<Kysymys2> kysymyslista = new ArrayList<>();
            kysymyslista.add(new Kysymys2("Binääriluku 101101 on sama kuin luku", "45", "101", "44", "89"));
            kysymyslista.add(new Kysymys2("Mikä seuraavista luokista on oikein nimetty?", "FilesReader", "false", "Files Reader", "3Files"));
            kysymyslista.add(new Kysymys2("Mikä on sopiva tyyppi muuttujalle, jos käsiteltävät luvut ovat satoja miljoonia?", "long", "double","String","char"));
            kysymyslista.add(new Kysymys2("Mikä näistä kelpaa muuttujan tyypiksi?","boolean","let","var","const"));
            kysymyslista.add(new Kysymys2("Minkä nimisessä tiedostossa määritellään julkinen luokka Tuote?","Tuote.java","Tuote.class","tuote.class","Tuote.Tuote"));
            Collections.shuffle(kysymyslista);

            System.out.println("Kysymyspeli");
            System.out.println();
            System.out.print("Säännöt: ");
            System.out.println("Sinulta kysytään neljä kysymystä. Kaikkiin kysymyksiin on vain yksi oikea vastaus.");
            System.out.println("Oikeasta vastauksesta saa yhden pisteen, tyhjästä vastauksesta 0 ja väärästä -1.");
            System.out.println("Huomioi, että kirjoitat isot ja pienet kirjaimet oikein!");
            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println();

            for (Kysymys2 kysymys2: kysymyslista) {

                kysymys2.kysy();
                kysymykset++;
                System.out.print("Vastauksesi: ");
                String vastaus = lukija.nextLine();
                System.out.println();

                if (kysymykset == 4) break;

                if (vastaus.equals(kysymys2.getOikeaVastaus())) pisteet++;

                else if (pisteet > 0 && vastaus.length() > 0) pisteet -= 1;

                else if (vastaus.isEmpty()) continue;
            }


            System.out.println("Pisteet: " + pisteet + "/" + kysymykset);
        }
    }


