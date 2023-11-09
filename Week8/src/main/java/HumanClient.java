public class HumanClient implements Client{
    private boolean happyHour = false;
    @Override
    public void happyHourStarted(Bar bar) {
        happyHour = true;
    }

    @Override
    public void happyHourEnded(Bar bar) {
        happyHour = false;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {

    }
}
