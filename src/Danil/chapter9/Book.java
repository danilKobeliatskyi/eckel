package danil.chapter9;

import danil.chapter8.Page;

public class Book implements Page {

    public void open(){

        System.out.println("Open book");
    }

    public int number(int page){
        System.out.println("in " + page + " page");
        return page;
    }

    public void close(){
        System.out.println("Close book");
    }
}
