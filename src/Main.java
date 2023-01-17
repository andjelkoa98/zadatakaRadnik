import java.util.ArrayList;

public class Main {
    public static void isplatiSvimRadnicima(Radnik[] radnici){
        for (int i = 0; i < radnici.length; i++) {
            radnici[i].isplatiPlatu();
        }
    }
    public static void main(String[] args) {

        Radnik radnik = new RadnikPoDanu("Ivan","Ivanovic","2412997712177", "840-23432525-45", 22);
        Radnik radnik1 = new RadnikPoSatu("Aca", "Acic", "1206993712177", "840-32567356-45",8,22);
        Radnik radnik2 = new RadnikFiksno("Pera", "Peric","0307987712177","840-87544354357-45",2000);

        Radnik[] spisakRadnika = {radnik, radnik1, radnik2};

        isplatiSvimRadnicima(spisakRadnika);
    }
}