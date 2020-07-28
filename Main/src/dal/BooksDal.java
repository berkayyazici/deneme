package dal;

import entities.Books;
import pattern.BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BooksDal implements BookRepository<Books> {

    List<Books> booksList = new ArrayList<Books>();


    @Override
    public List<Books> listele() {
        return booksList;
    }

    @Override
    public void add(Books barkodid, Books kitapadi, Books kitapyazari, Books sayfasayisi) {
        Books books = new Books();
        books.getBarkoid();
        books.getKitapadi();
        books.getKitapyazari();
        books.getSayfasayisi();
        booksList.add(books);

    }

    @Override
    public void delete(Books barkodid) {

        Books books = new Books();
        books.getBarkoid();
        booksList.remove(books.getBarkoid());

    }
}
