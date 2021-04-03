package person;

import person.appearance.Appearance;

public class Person {

    private final String id;
    private final Fio fio;
    private final Physical phys;
    private final Appearance appearance;
    private final Phone phone;

    public Person(final String id,
                  final Fio fio,
                  final Physical phys,
                  final Appearance appearance,
                  final Phone phone) {
        this.id = id;
        this.fio = fio;
        this.phys = phys;
        this.appearance = appearance;
        this.phone = phone;
    }


    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(String.format("%1$s %2$s %3$s", fio.lastname, fio.firstname, fio.middleName)).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n")
                .append(phone);

        return sb.toString();
    }
}