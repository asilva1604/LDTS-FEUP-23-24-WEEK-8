public class StringReplacer implements StringTransformer{
    private char a;
    private char b;
    public StringReplacer(char a, char b) {
        this.a = a;
        this.b = b;
    }
    public void execute(StringDrink drink) {
        String s = drink.getText();
        s = s.replace(a, b);
        drink.setText(s);
    }
}
