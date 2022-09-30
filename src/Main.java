public class Main {
    public static void main(String[] args) {
        Book levTolstoi = new Book("Лев Толстой", 2008);
        levTolstoi.setPublishingYear(2009);
        Book aPushkin = new Book("Александ Пушкин", 2010);
        Author chehov = new Author("Антон","Павлович","Чехов");
        Author lermontov = new Author("Михаил", "Юрьевич", "Лермонтов");
        System.out.println(levTolstoi.getAuthorName()+ " " +levTolstoi.getPublishingYear());
        System.out.println(aPushkin.getAuthorName()+ " " +aPushkin.getPublishingYear());
        System.out.println(chehov.getAuthor());
        System.out.println(lermontov.getAuthor());
    }
}