package CLI_Main;

import java.io.BufferedReader;

public class IntegerInputProcessor extends ComplexUserInputProcessor{ // check if nbStars entered is an int
    public IntegerInputProcessor(BufferedReader inputReader) {
        super(inputReader);
    }

    @Override
    protected void setMessage() {
        message="Yous should enter an integer";
    }

    @Override
    protected void setValidityCriterion() {
        isValid = str -> {
            try {
                Integer value = Integer.parseInt((String) str);
                return value instanceof Integer;
            } catch (NumberFormatException e) {
                return false;
            }
        };
    }

    @Override
    protected void setParser() {
        try {
            parser = Integer.class.getMethod("parseInt", String.class);
        } catch (SecurityException | NoSuchMethodException e) {

            e.printStackTrace();
        }
    }
}
