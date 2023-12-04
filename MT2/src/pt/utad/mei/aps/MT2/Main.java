package pt.utad.mei.aps.MT2;

public class Main {
    public static void main(String[] args) {
        TextComponent italicText = new ItalicText();
        TextComponent underlineText = new UnderlineText();
        TextComponent boldText = new BoldText();
        TextComponent normalText = new NormalText();

        System.out.println(italicText.render());
        System.out.println(underlineText.render());
        System.out.println(boldText.render());
        System.out.println(normalText.render());

    }
}