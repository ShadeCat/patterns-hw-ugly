package person;
import generators.AppearanceGenerator;
import generators.FioDtoGenerator;
import generators.NonPalindromePhoneGenerator;
import generators.PhysGenerator;
import person.appearance.Appearance;

public class PersonFactory{

    public static Person processPerson(String code) {
        final int intCode = Integer.parseInt(code);
        final FioDtoGenerator fioDtoGenerator = new FioDtoGenerator();
        fioDtoGenerator.generateParams(intCode);
        Fio fio = fioDtoGenerator.buildResponse();

        final PhysGenerator physGenerator = new PhysGenerator();
        physGenerator.generateParams(intCode);
        Physical physical = physGenerator.buildResponse();

        final AppearanceGenerator appearanceGenerator = new AppearanceGenerator();
        appearanceGenerator.generateParams(intCode);
        Appearance appearance = appearanceGenerator.buildResponse();

        final NonPalindromePhoneGenerator phoneGenerator = new NonPalindromePhoneGenerator();
        phoneGenerator.generateParams(intCode);
        Phone phone = phoneGenerator.buildResponse();

        return new Person(code, fio, physical, appearance, phone);
    }

}
