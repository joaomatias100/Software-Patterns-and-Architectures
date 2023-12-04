package pt.utad.mei.aps.MT2;

public class UnderlineText implements TextComponent{

    private String content;

    public UnderlineText() {
        content = "<u>sublinhado</u>";
    }

    @Override
    public String render() {
        return content;
    }
}
