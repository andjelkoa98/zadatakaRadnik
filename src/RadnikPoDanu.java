public class RadnikPoDanu  extends Radnik{
    private int cenaJednogDana;
    private int brojDana;
    public RadnikPoDanu(String ime, String prezime, String jmbg, String ziroRacun,int cenaJednogDana, int brojDana) {
        super(ime, prezime, jmbg, ziroRacun);
        this.cenaJednogDana = cenaJednogDana;
        this.brojDana = brojDana;
    }

    private void obracunajPlatu(){
        super.plata = this.cenaJednogDana * this.brojDana;
    }

    @Override
    public void isplatiPlatu(){
        obracunajPlatu();
        super.isplatiPlatu();
    }
}
