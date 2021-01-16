package CreationalDesignPatterns.ProtoTypePatternDesign.BookModel;

public class Books {
    private String bookname;
    private int bookprice;

    public Books(String book1, int i) {
        bookname = book1;
        bookprice = i;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookprice() {
        return bookprice;
    }

    public void setBookprice(int bookprice) {
        this.bookprice = bookprice;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookname='" + bookname + '\'' +
                ", bookprice=" + bookprice +
                '}';
    }
}
