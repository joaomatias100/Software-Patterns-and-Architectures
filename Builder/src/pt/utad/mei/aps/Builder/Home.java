package pt.utad.mei.aps.Builder;

public class Home implements HomeProject{

    public String foundations;
    public String structure;
    public String ceiling;
    public String interior;
    @Override
    public void setFoundations(String foundations) {
        this.foundations = foundations;
    }

    @Override
    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "casa { fundacoes = " + foundations + ", estrutura =" + structure + " cobertura =" + ceiling
                + "interior = " + interior + " }";
    }
}
