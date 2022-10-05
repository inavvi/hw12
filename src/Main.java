public class Main {

    public static void main(String[] args) {
        Author chehov = new Author("Антон","Павлович","Чехов");
        Author lermontov = new Author("Михаил", "Юрьевич", "Лермонтов");
        Book barinya = new Book("Барыня", chehov,2008);
        Book lerStihi = new Book("Стихи. Избранное", lermontov,2005);
        barinya.setPublishingYear(2009);
        System.out.println(barinya.getBook());
        System.out.println(lerStihi.getBook());
    }
}