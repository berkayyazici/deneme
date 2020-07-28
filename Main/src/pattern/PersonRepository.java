package pattern;

import java.util.List;

public interface PersonRepository<T> {

    List<T> listele();
    void add(T name);
    void delete(T name);

}
