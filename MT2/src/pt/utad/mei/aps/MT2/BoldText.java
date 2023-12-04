package pt.utad.mei.aps.MT2;

public class BoldText implements TextComponent{

    private String content;

    public BoldText() {
        content = "<b>negrito</b>";
    }

    @Override
    public String render() {
        return content;
    }
}
