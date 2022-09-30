public class Book {
    private String authorName;
    private int publishingYear;

    public Book(String authorName, int publishingYear) {
        this.authorName=authorName;
        this.publishingYear=publishingYear;
    }

    public String getAuthorName() {
        return this.authorName;
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
