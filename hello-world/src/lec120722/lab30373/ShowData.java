package lec120722.lab30373;

import java.util.ArrayList;

public class ShowData {
    public static void main(String[] args) {
        // instantioation to class AddDataToArrayList
        AddDataToArrayList b = new AddDataToArrayList();
        ArrayList<Book> myBookList = b.bookDetails();
        for (Book showValue : myBookList) {
            // ---- invoking getter method for geting Data---------
            System.out.println(showValue.getNumber() + " " + showValue.getName() + " "
                    + showValue.getCategory() + " " + showValue.getAuthor());
        }
    }
}
