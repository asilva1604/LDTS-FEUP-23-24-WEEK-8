public class StringInverter implements StringTransformer{

    public void execute(StringDrink drink) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < drink.getText().length(); i++)  {
            s.append(drink.getText().charAt(drink.getText().length() - i - 1));
        }
        drink.setText(s.toString());
    }
}
