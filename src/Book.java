public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("печатаю книжки");
        }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printBook(Printable[] printable){
        for (Printable value : printable){
            if (value instanceof Book)
                System.out.println(((Book) value).getName());
        }
    }

    }

