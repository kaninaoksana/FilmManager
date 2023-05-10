public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager(){
        this.limit = 10;
    }
    public FilmManager (int limit){

    }
    public FilmManager(int limit) {
    this.limit = limit;
}

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];

        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;

    }

    public String[] findLast() {
        int resultLength;
        if (films.length <10){
            resultLength = films.length;
            } else {
            resultLength = 10;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films [films.length - 1 - i];

        }
        return tmp;

    }
}