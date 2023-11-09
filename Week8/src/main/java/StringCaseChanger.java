import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < drink.getText().length(); i++) {
            if (toLowerCase(drink.getText().charAt(i)) == drink.getText().charAt(i)) {
                s.append(toUpperCase(drink.getText().charAt(i)));
            } else {
                s.append(toLowerCase(drink.getText().charAt(i)));
            }
        }
        drink.setText(s.toString());
    }
}
