package CreationalDesignPatterns.ProtoTypePatternDesign.BookShopModel;

import CreationalDesignPatterns.ProtoTypePatternDesign.BookModel.Books;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements  Cloneable{
    private String bookshopName;

    public String getBookshopName() {
        return bookshopName;
    }

    public void setBookshopName(String bookshopName) {
        this.bookshopName = bookshopName;
    }

    public List<Books> getBooklist() {
        return booklist;
    }

    public void setBooklist(List<Books> booklist) {
        this.booklist = booklist;
    }

    private List<Books> booklist=new ArrayList<>();


    public void loadData(){
        int i=1;
        while (i<=10) {
            this.booklist.add(new Books("book"+i,i*10));
            i++;
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookshopName='" + bookshopName + '\'' +
                ", booklist=" + booklist +
                '}';
    }

    @Override
    public BookShop clone() throws CloneNotSupportedException {
        List<Books> books = new ArrayList<>();
        for(Books b:this
                .getBooklist()){
            books.add(b);
        }
        BookShop bks = new BookShop();
        bks.setBooklist(books);
        return bks;
    }
}
