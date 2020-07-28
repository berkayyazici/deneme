package pattern;

import java.util.List;

public interface BookRepository<T> {

    List<T> listele();
    void add(T barkodid, T kitapadi, T kitapyazari, T sayfasayisi);
    void delete(T barkodid);

}
