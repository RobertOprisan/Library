public class Library {
    public static void main(String[] args) {

        Author author = new Author("Ruben Hidalgo", "rubencito@gmail.com", 'M');
        System.out.println(author);
        Book book = new Book("x", author, 35, 10);
        Book b2 = new Book("Foundation",
                new Author("Isaak Newtown", "gg@gmail.com,", 'M'), 30,14);

        System.out.println(book);
        System.out.println(b2);
    }

}
