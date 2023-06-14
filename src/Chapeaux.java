import ardoise.*;
import java.util.ArrayList;

public class Chapeaux extends Forme{
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;

    public Chapeaux() {
        super();
    }

    public PointPlan getp1() {
        return this.p1;
    }

    public PointPlan getp2() {
        return this.p2;
    }

    public PointPlan getp3() {
        return this.p3;
    }

    public void setp1(PointPlan p) {
        this.p1 = p;
    }

    public void setp2(PointPlan p) {
        this.p2 = p;
    }

    public void setp3(PointPlan p) {
        this.p3 = p;
    }

    @Override
    public void deplacer(int x, int y) {
        int x1 = this.p1.getAbscisse() + x;
        int y1 = this.p1.getOrdonnee() + y;
        this.p1.setAbscisse(x1);
        this.p1.setOrdonnee(y1);

        int x2 = this.p2.getAbscisse() + x;
        int y2 = this.p2.getOrdonnee() + y;
        this.p2.setAbscisse(x2);
        this.p2.setOrdonnee(y2);

        int x3 = this.p3.getAbscisse() + x;
        int y3 = this.p3.getOrdonnee() + y;
        this.p3.setAbscisse(x3);
        this.p3.setOrdonnee(y3);

        this.dessiner();
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<Segment>();
        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(p2, p3);
        segments.add(s1);
        segments.add(s2);
        return segments;
    }

    @Override
    public String typeForme() {
        return "C";
    }

    public String toString() {
        return "Chapeau{ p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 +'}';
    }

    public Chapeaux(PointPlan p1, PointPlan p2, PointPlan p3) throws ColineaireException {
        if (MethodeTest.colineaires(p1, p2, p3)) {
            throw new ColineaireException("erreur: Les points sont colinéaires");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.setNomForme("Chapeaux");
    }
}
