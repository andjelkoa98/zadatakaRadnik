public abstract class Radnik {
    String ime;
    String prezime;
    String jmbg;
    String ziroRacun;
    int plata;

    public Radnik(String ime, String prezime, String jmbg, String ziroRacun, int plata) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
        this.plata = plata;
    }

    public Radnik(String ime, String prezime, String jmbg, String ziroRacun) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;
    }


    public void isplatiPlatu() {
        System.out.println("Radnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", jmbg=" + jmbg +
                ", ziroRacun=" + ziroRacun +
                ", plata=" + plata +
                '}');
    }
}
