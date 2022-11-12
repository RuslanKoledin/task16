package Task12;

public class Passenger {
    int payment = 15;
    String name;
    String number ;

    public Passenger(int payment,String name,String number) {
        this.payment = payment;
        this.name = name;
        this.number = number;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passenger - " +
                "Оплата =" + payment +
                ", Имя='" + name + '\'' +
                ", Номер телефона='" + number + '\'';
    }
}
