package kartoyunu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

public class test {

    private int A;
    private int B;

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }
    //genel olarak butun futbolcuları tutan liste
    public ArrayList<futbolcu> futbolcular = new ArrayList<futbolcu>(8);
    //genel olarak butun basketbolcuları tutan liste
    public ArrayList<Basketbolcu> basketbolcular = new ArrayList<Basketbolcu>(8);
    //oyuncunun sahip oldugu futbolcu kartları
    public ArrayList<futbolcu> kart_futbolcu1 = new ArrayList<futbolcu>(4);
    public ArrayList<futbolcu> kart_futbolcu2 = new ArrayList<futbolcu>(4);
    //oyuncunun sahip oldugu Basketbolcu kartları
    public ArrayList<Basketbolcu> kart_basketbolcu1 = new ArrayList<Basketbolcu>(4);
    public ArrayList<Basketbolcu> kart_basketbolcu2 = new ArrayList<Basketbolcu>(4);

    public test(int a) {
        futbolcu futbolcu1 = new futbolcu("Cristiano Ronaldo", "Juventus", 90, 89, 93, "src\\img\\RONALDO.png");
        futbolcu futbolcu2 = new futbolcu("Lionel Messi", "Barselona", 95, 90, 98, "src\\img\\Messi.png");
        futbolcu futbolcu3 = new futbolcu("Zlatan İbrahimoviç", "Milan", 100, 90, 96, "src\\img\\Ibrahimovic.png");
        futbolcu futbolcu4 = new futbolcu("Arjen Robben", "Bayern ", 83, 93, 87, "src\\img\\Robben.png");
        futbolcu futbolcu5 = new futbolcu("Diego Maradona", "Napoli", 80, 90, 85, "src\\img\\MARADONA.png");
        futbolcu futbolcu6 = new futbolcu("Nascimento Pele", "Santos", 90, 80, 75, "src\\img\\PELE.png");
        futbolcu futbolcu7 = new futbolcu("Hakan Çalhanoğlu", "Milan", 80, 70, 85, "src\\img\\ÇALHANOĞLU.png");
        futbolcu futbolcu8 = new futbolcu("Merih Demiral", "Yozgatspor", 100, 100, 99, "src\\img\\DEMIRAL.png");

        Basketbolcu basketbolcu1 = new Basketbolcu("Stephen Curry", "golden state", 80, 90, 85, "src\\img\\Stephen.png");
        Basketbolcu basketbolcu2 = new Basketbolcu("Kobe Braynt", "lakers", 90, 85, 90, "src\\img\\Kobe.png");
        Basketbolcu basketbolcu3 = new Basketbolcu("Lebron James", "lakerss", 100, 100, 100, "src\\img\\Lebron James.png");
        Basketbolcu basketbolcu4 = new Basketbolcu("Michael jordan", "bulls", 80, 90, 85, "src\\img\\michael jordan.png");
        Basketbolcu basketbolcu5 = new Basketbolcu("Cedi Osman", "cleveland", 75, 85, 70, "src\\img\\cedi osman.png");
        Basketbolcu basketbolcu6 = new Basketbolcu("Ömer Aşık", "pelicans", 90, 80, 75, "src\\img\\Ömer Aşık.png");
        Basketbolcu basketbolcu7 = new Basketbolcu("Mehmet Okur", "orlando", 80, 70, 85, "src\\img\\mehmet okur.png");
        Basketbolcu basketbolcu8 = new Basketbolcu("Hidayet Turkoglu", "bayrampasa", 99, 93, 99, "src\\img\\hidayet türkoğlu.png");

        futbolcular.add(futbolcu1);
        futbolcular.add(futbolcu2);
        futbolcular.add(futbolcu3);
        futbolcular.add(futbolcu4);
        futbolcular.add(futbolcu5);
        futbolcular.add(futbolcu6);
        futbolcular.add(futbolcu7);
        futbolcular.add(futbolcu8);

        basketbolcular.add(basketbolcu1);
        basketbolcular.add(basketbolcu2);
        basketbolcular.add(basketbolcu3);
        basketbolcular.add(basketbolcu4);
        basketbolcular.add(basketbolcu5);
        basketbolcular.add(basketbolcu6);
        basketbolcular.add(basketbolcu7);
        basketbolcular.add(basketbolcu8);

        Collections.shuffle(futbolcular);
        Collections.shuffle(basketbolcular);
        //oyuncu 1'in sahip oldugu futbolcu kartlarına
        //genel olan futbolculardan ilk 4'ünü gönder

        kart_futbolcu1.add(futbolcular.get(0));
        kart_futbolcu1.add(futbolcular.get(1));
        kart_futbolcu1.add(futbolcular.get(2));
        kart_futbolcu1.add(futbolcular.get(3));

        //oyuncu 2'in sahip oldugu futbolcu kartlarına
        //genel olan futbolculardan son 4'ünü gönder
        kart_futbolcu2.add(futbolcular.get(4));
        kart_futbolcu2.add(futbolcular.get(5));
        kart_futbolcu2.add(futbolcular.get(6));
        kart_futbolcu2.add(futbolcular.get(7));

        //oyuncu 1'in sahip oldugu Basketbolcu kartlarına
        //genel olan basketbolculardan ilk 4'ünü gönder
        kart_basketbolcu1.add(0, basketbolcular.get(0));
        kart_basketbolcu1.add(1, basketbolcular.get(1));
        kart_basketbolcu1.add(2, basketbolcular.get(2));
        kart_basketbolcu1.add(3, basketbolcular.get(3));

        //oyuncu 2'in sahip oldugu Basketbolcu kartlarına
        //genel olan basketbolculardan son 4'ünü gönder
        kart_basketbolcu2.add(0, basketbolcular.get(4));
        kart_basketbolcu2.add(1, basketbolcular.get(5));
        kart_basketbolcu2.add(2, basketbolcular.get(6));
        kart_basketbolcu2.add(3, basketbolcular.get(7));

    }

    public void karsilastir(kullanıcı Kullanici, bilgisayar Bilgisayar, int index) {

        if (index == -5) {
            JOptionPane.showMessageDialog(null, "LÜTFEN FARKLI BİR KART SEÇİNİZ...", "KULLANILMIŞ KART ", JOptionPane.ERROR_MESSAGE);

        } else {
            System.out.print("Kulanıcının Kartı  -> " + Kullanici.getFutbolcular().get(index).getFutbolcuAdi() + ":");
            System.out.print("Penalti:" + Kullanici.getFutbolcular().get(index).getPenalti());
            System.out.print(" ,Serbest Vuruş:" + Kullanici.getFutbolcular().get(index).getSerbestAtis());
            System.out.println(" ,Kaleciyle Karşı Karşıya:" + Kullanici.getFutbolcular().get(index).getKaleciKarsiKarsiya());
            System.out.print("Bilgisayarın Kartı -> " + Bilgisayar.getFutbolcular().get(index).getFutbolcuAdi() + ":");
            System.out.print("Penalti:" + Bilgisayar.getFutbolcular().get(index).getPenalti());
            System.out.print(" ,Serbest Vuruş:" + Bilgisayar.getFutbolcular().get(index).getSerbestAtis());
            System.out.println(" ,Kaleciyle Karşı Karşıya:" + Bilgisayar.getFutbolcular().get(index).getKaleciKarsiKarsiya());
            Random rastgele = new Random();
            int i = rastgele.nextInt(3);
            switch (i) {
                case 0:
                    setA(0);
                    System.out.println("Penaltı pozisyonu seçildi...");
                    Kullanici.getFutbolcular().get(index).getPenalti();
                    if (Kullanici.getFutbolcular().get(index).getPenalti() < Bilgisayar.getFutbolcular().get(index).getPenalti()) {
                        Bilgisayar.skorGoster();
                        System.out.println("Bilgisayarın skoru 10 arttı...");
                        System.out.println("******************************");
                    } else if (Kullanici.getFutbolcular().get(index).getPenalti() > Bilgisayar.getFutbolcular().get(index).getPenalti()) {
                        Kullanici.skorGoster();
                        System.out.println("Kullanıcının skoru 10 arttı...");
                        System.out.println("******************************");
                    } else {
                        System.out.println("Durumlar eşit olduğu için kimse puan kazanamadı...");
                        System.out.println("******************************");

                    }
                    break;

                case 1:
                 setA(1);
                    System.out.println("Kaleciyle Karşı Karşıya pozisyonu secildi...");
                    if (Kullanici.getFutbolcular().get(index).getKaleciKarsiKarsiya() < Bilgisayar.getFutbolcular().get(index).getKaleciKarsiKarsiya()) {
                        Bilgisayar.skorGoster();
                        System.out.println("Bilgisayarın skoru 10 arttı...");
                        System.out.println("******************************");
                    } else if (Kullanici.getFutbolcular().get(index).getKaleciKarsiKarsiya() > Bilgisayar.getFutbolcular().get(index).getKaleciKarsiKarsiya()) {
                        Kullanici.skorGoster();
                        System.out.println("Kullanıcının skoru 10 arttı...");
                        System.out.println("******************************");
                    } else {
                        System.out.println("Durumlar eşit olduğu için kimse puan kazanamadı...");
                        System.out.println("******************************");
  
                    }
                    break;
                case 2:
                    setA(2);
                    System.out.println("Serbest Vuruş pozisyonu secildi...");
                    if (Kullanici.getFutbolcular().get(index).getSerbestAtis() < Bilgisayar.getFutbolcular().get(index).getSerbestAtis()) {
                        Bilgisayar.skorGoster();
                        System.out.println("Bilgisayarın skoru 10 arttı...");
                        System.out.println("******************************");
                    

                    } else if (Kullanici.getFutbolcular().get(index).getSerbestAtis() > Bilgisayar.getFutbolcular().get(index).getSerbestAtis()) {
                        Kullanici.skorGoster();
                        System.out.println("Kullanıcının skoru 10 arttı...");
                        System.out.println("******************************");
                    

                    } else {
                        System.out.println("Durumlar eşit olduğu için kimse puan kazanamadı...");
                        System.out.println("******************************");
                  

                    }
                    break;
                default:
                    break;
            }

        }
    }

    public void karsilastir2(kullanıcı Kullanici, bilgisayar Bilgisayar, int index) {
        if (index == -5) {
            JOptionPane.showMessageDialog(null, "LÜTFEN FARKLI BİR KART SEÇİNİZ...", "KULLANILMIŞ KART", JOptionPane.ERROR_MESSAGE);

        } else {
            System.out.print("Kulanıcının Kartı -> " + Kullanici.getBasketbolcular().get(index).getBasketbolcuAdi() + ":");
            System.out.print("İkilik:" + Kullanici.getBasketbolcular().get(index).getIkilik());
            System.out.print(" ,Üçlük :" + Kullanici.getBasketbolcular().get(index).getUcluk());
            System.out.println(" ,Serbest atış :" + Kullanici.getBasketbolcular().get(index).getSerbestAtis());
            System.out.print("Bilgisayarı Kartı -> " + Bilgisayar.getBasketbolcular().get(index).getBasketbolcuAdi() + ":");
            System.out.print("İkilik:" + Bilgisayar.getBasketbolcular().get(index).getIkilik());
            System.out.print(" ,Üçlük:" + Bilgisayar.getBasketbolcular().get(index).getUcluk());
            System.out.println(" ,Serbest atış:" + Bilgisayar.getBasketbolcular().get(index).getSerbestAtis());
            Random rand = new Random();
            int i = rand.nextInt(3);
            switch (i) {
                case 0:
                    setB(0);
                    System.out.println("İkilik pozisyonu seçildi...");
                    Kullanici.getBasketbolcular().get(index).getIkilik();
                    if (Kullanici.getBasketbolcular().get(index).getIkilik() < Bilgisayar.getBasketbolcular().get(index).getIkilik()) {
                        System.out.println("Bilgisayarın skoru 10 arttı...");
                        Bilgisayar.skorGoster();
                        System.out.println("******************************");

                    } else if (Kullanici.getBasketbolcular().get(index).getIkilik() > Bilgisayar.getBasketbolcular().get(index).getIkilik()) {
                        System.out.println("Kullanıcının skoru 10 arttı...");
                        Kullanici.skorGoster();
                        System.out.println("******************************");
                    } else {
                        System.out.println("Durumlar eşit olduğu için kimse puan kazanamadı...");
                        System.out.println("******************************");
                    }
                    break;
                case 1:
                    setB(1);

                    System.out.println("Üçlük pozisyonu seçildi...");
                    if (Kullanici.getBasketbolcular().get(index).getUcluk() < Bilgisayar.getBasketbolcular().get(index).getUcluk()) {
                        Bilgisayar.skorGoster();
                        System.out.println("Bilgisayarın skoru 10 arttı...");
                        System.out.println("******************************");
                    } else if (Kullanici.getBasketbolcular().get(index).getUcluk() > Bilgisayar.getBasketbolcular().get(index).getUcluk()) {
                        Kullanici.skorGoster();
                        System.out.println("Kullanıcının skoru 10 arttı...");
                        System.out.println("******************************");
                    } else {
                        System.out.println("Durumlar eşit olduğu için kimse puan kazanamadı...");
                        System.out.println("******************************");
                    }
                    break;
                case 2:
                    setB(2);

                    System.out.println("Serbest Atış pozisyonu secildi...");
                    if (Kullanici.getBasketbolcular().get(index).getSerbestAtis() < Bilgisayar.getBasketbolcular().get(index).getSerbestAtis()) {
                        Bilgisayar.skorGoster();
                        System.out.println("Bilgisayarın skoru 10 arttı...");
                        System.out.println("******************************");
                    } else if (Kullanici.getBasketbolcular().get(index).getSerbestAtis() > Bilgisayar.getBasketbolcular().get(index).getSerbestAtis()) {
                        Kullanici.skorGoster();
                        System.out.println("Kullanıcının skoru 10 arttı...");
                        System.out.println("******************************");
                    } else {
                        System.out.println("Durumlar eşit olduğu için kimse puan kazanamadı...");
                        System.out.println("******************************");
                    }
                    break;
                default:
            }

        }
    }

  
}
