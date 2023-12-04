package pt.utad.mei.aps.MT2;

public class NormalText implements TextComponent{

    private String content;

    public NormalText() {
        content = "<span>normal</span>";
    }

    @Override
    public String render() {
        return content;
    }
}
