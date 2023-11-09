import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private final List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> t)  {
        this.transformers = t;
    }

    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer t : transformers) {
            t.execute(drink);
        }
    }

}
