public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author lermontov = new Author("Михаил", "Лермонтов");

        Book dubrovskiy = new Book("Дубровский", pushkin, 1841);
        Book mciri = new Book("Мцыри", lermontov, 1838);

        System.out.println(mciri.getTitle() + " " + mciri.getAuthorName() + " " + mciri.getAuthorSurname() + " " +
                mciri.getYearPublishing());
        System.out.println(dubrovskiy.getTitle() + " " + dubrovskiy.getAuthorName() + " " + dubrovskiy.getAuthorSurname() + " " +
                dubrovskiy.getYearPublishing());

        mciri.setYearPublishing(1839);
        System.out.println(mciri.getTitle() + " " + mciri.getAuthorName() + " " + mciri.getAuthorSurname() + " " +
                mciri.getYearPublishing());
        System.out.println(pushkin);
        System.out.println(mciri);
    }
}