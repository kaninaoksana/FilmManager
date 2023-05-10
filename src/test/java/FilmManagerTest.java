import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void  test(){
        String film1 = "Movie I";
        String film2 = "Movie II";
        String film3 = "Movie III";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3 };

        Assertions.assertArrayEquals(expected, actual);


    }
}

    @Test
    public void  test(){
        String film1 = "Movie I";
        String film2 = "Movie II";
        String film3 = "Movie III";

        FilmManager manager = new FilmManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] actual = manager.findLast();
        String[] expected = {film3, film2, film1 };

        Assertions.assertArrayEquals(expected, actual);


    }
}