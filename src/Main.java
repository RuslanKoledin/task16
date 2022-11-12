public class Main {
    public static void main(String[] args) {



        Printable [] printable = new Printable[4];

        Book book = new Book("Гари поттер");
        printable[0] = book;

        Book book1 = new Book("Математика");
        printable[1] = book1;

        Magazin magazin = new Magazin("Фаберлик");
        printable[2] = magazin;

        Magazin magazin1 = new Magazin("Форбс");
        printable[3] = magazin1;

        for (int i = 0; i < printable.length; i++){
            printable[i].print();

            System.out.println("");

            Magazin.printMagazins(printable);
            Book.printBook(printable);
        }
    }
}