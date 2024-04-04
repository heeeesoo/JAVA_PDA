package day0403;

public class EX07 {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook("samsung");
        NoteBook noteBook2 = new NoteBook("apple");

        System.out.println(noteBook2.brandName);

        System.out.println(noteBook.brandName);

    }
}

class NoteBook {
    String brandName;

    NoteBook(String brandName) {
        this.brandName = brandName;
    }
}

