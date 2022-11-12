import java.util.Arrays;

public class Magazin implements Printable{
    private String name;

    public Magazin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println("печатают журналы");
    }

    public static void printMagazins(Printable[] printable){
        for (Printable value : printable){
            if (value instanceof Magazin)
                System.out.println(((Magazin) value).getName());
        }
    }
}
