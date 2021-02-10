import java.util.Scanner;

public class SimpleMovePlayer implements MovePlayer {
    Scanner scanner = new Scanner(System.in);
    SimpleMessenger simpleMessenger = new SimpleMessenger();
    static Integer numberFromPlayer = 0;

    public SimpleMovePlayer() {
        numberFromPlayer = this.numberFromPlayer;
    }

        @Override
    public Integer getNumberFromPlayer() {
        numberFromPlayer = scanner.nextInt();

        while (!ProverkaNumber(numberFromPlayer)) {
            System.out.println(simpleMessenger.nepravPlayerMover());
            numberFromPlayer = scanner.nextInt();
        }
        System.out.println(simpleMessenger.playerMove(numberFromPlayer));
        return numberFromPlayer;
    }

    @Override
    public Boolean ProverkaNumber(Integer a) {
        if (a == 1 || a == 2 || a == 3) {
            return true;
        } else {
            return false;
        }
    }

}



/*public class SchoolBook extends Book {
    private String authorName;
    private String authorLastName;
    private LocalDate publishDate;

    public SchoolBook() {
    }

    public SchoolBook(int numberOfPages, String name, String authorName, String authorLastName, LocalDate publishDate) {
        super(numberOfPages, name);
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.publishDate = publishDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SchoolBook that = (SchoolBook) o;
        return Objects.equals(authorName, that.authorName) && Objects.equals(authorLastName, that.authorLastName) && Objects.equals(publishDate, that.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), authorName, authorLastName, publishDate);
    }

    @Override
    public String toString() {
        return "SchoolBook{" +
                "authorName='" + authorName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}*/