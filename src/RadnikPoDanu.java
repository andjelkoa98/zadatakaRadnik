public class RadnikPoDanu  extends Radnik{
    int cenaJednogDana = 80;

    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun, int brojDana) {
        super(ime, prezime, jmbg, ziroRacun);
        super.plata = this.cenaJednogDana * brojDana;
    }


    @Override
    public void isplatiPlatu(){
        super.isplatiPlatu();
    }
}
