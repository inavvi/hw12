public class Author {
    private String name;
    private String latName;
    private String surname;

    public Author(String name, String latName, String surname) {
        this.name=name;
        this.latName=latName;
        this.surname=surname;
    }

    public String getAuthor() {
        String whitespace=" ";
        return this.name + whitespace+ this.latName + whitespace+ this.surname;
    }
}
