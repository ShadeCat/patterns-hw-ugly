package generators;

import person.Fio;

public class FioDtoGenerator implements Generator<Fio> {

    private String firstname;
    private String  lastname;
    private String middleName;

    public final void generateParams(final int code){
        FioGenerator fioGenerator = new FioGenerator();
        fioGenerator.generateParams(code);
        firstname = fioGenerator.getFirstName();
        lastname = fioGenerator.getLastName();
        middleName = fioGenerator.getMiddleName();
    }

    @Override
    public final Fio buildResponse() {
        return new Fio(firstname, lastname, middleName);
    }
}
