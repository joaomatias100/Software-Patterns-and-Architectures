package pt.utad.mei.aps.BuilderTeste;

public class Robot implements RobotProject{
    public String base;
    public String body;
    public String top;


    @Override
    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void setTop(String top) {
        this.top = top;
    }

    public String toString(){
        return "robot { base: " + base + ", body: " + body + ", top: " + top;
    }
}
