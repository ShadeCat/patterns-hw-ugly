package person;

public class Phone {

    private final String number;

    public Phone(final String number) {
        this.number = number;
    }

    @Override
    public final String toString() {
        if (number != null) {
            return "Телефон:\t" + number;
        } else {
            return "Телефона нет";
        }
    }
}
