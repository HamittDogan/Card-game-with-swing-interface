package kartoyunu;

import java.util.ArrayList;

public class kullanıcı extends oyuncu {

    public kullanıcı() {
    }

    public kullanıcı(String oyuncuId, String oyuncuIsim, int skor, ArrayList<futbolcu> futbolcular, ArrayList<Basketbolcu> basketbolcular) {
        super(oyuncuId, oyuncuIsim, skor, futbolcular, basketbolcular);

    }

    public int kartSec(int index) {
        super.kartSec();

        if (getFutbolcular().get(index).kartKullanildiMi() == false) {
            return index;
        } else {
            System.out.println("Kartı daha once kullandınız.");
            return -5;
        }

    }

    public int kartSec(int x, int index) {
        super.kartSec();

        if (getBasketbolcular().get(index).kartKullanildiMi() == false) {
            return index;
        } else {
            System.out.println("Kartı daha once kullandınız.");
            return -5;
        }

    }

}
