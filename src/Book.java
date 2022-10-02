public class Book {
    private String bookName;
    private int publishingYear;

    public Book(String bookName, int publishingYear) {
        this.bookName=bookName;
        this.publishingYear=publishingYear;
    }

    public String getAuthorName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear <= 1950 || publishingYear > 2022) {
            System.out.println("Ошибка! Год указан неверно! " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
}
