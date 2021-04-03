package generators;

public class NonPalindromePhoneGenerator extends PhoneGenerator{

    @Override
    public final void generateParams(final int code) {
        String stringCode = Integer.toString(code);
        // добавляем телефон, только если введённый код не палиндром
        if (!stringCode.equals(new StringBuilder(stringCode).reverse().toString())) {
            super.generateParams(code);
        }

    }



}
