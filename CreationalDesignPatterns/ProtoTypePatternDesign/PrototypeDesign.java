package CreationalDesignPatterns.ProtoTypePatternDesign;

import CreationalDesignPatterns.ProtoTypePatternDesign.BookShopModel.BookShop;

public class PrototypeDesign {
    public static void main(String[] args) throws CloneNotSupportedException {
        //prototype means creation of duplicate with deep copy not shallow copy
        BookShop bk = new BookShop();
        bk.setBookshopName("BibekShop");
        bk.loadData();


        BookShop bookShop=  bk.clone();

        bk.getBooklist().remove(3);

        bookShop.setBookshopName("bibeklamsal");

        System.out.println(bk);
        System.out.println(bookShop);
    }
}
