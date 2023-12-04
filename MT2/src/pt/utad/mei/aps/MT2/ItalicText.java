package pt.utad.mei.aps.MT2;

public class ItalicText implements TextComponent{
    private String content;

    public ItalicText() {
        content = "<i>itálico</i>";
    }

    @Override
    public String render() {
        return content;
    }
}
