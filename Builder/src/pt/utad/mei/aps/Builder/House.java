package pt.utad.mei.aps.Builder;

public class House implements HouseProject{

    private String structure;
    private String interior;
    private String foundations;
    private String coverage;

    @Override
    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public void setFoundations(String foundations) {
        this.foundations = foundations;
    }

    @Override
    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    @Override
    public String toString() {
        return "House { foundations = " + foundations + ", structure =" + structure + ", coverage =" + coverage
                + ", interior = " + interior + " }";
    }
}
