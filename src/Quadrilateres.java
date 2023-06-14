import ardoise.*;
import java.util.ArrayList;

public class Quadrilateres extends Forme{
    private PointPlan p1;
    private PointPlan p2;
    private PointPlan p3;
    private PointPlan p4;

    public Quadrilateres() {
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

    public PointPlan getp4() {
        return this.p4;
    }

    public void setp1(PointPlan p) {
        this.p1 = p;
    }

    public void setp2(PointPlan p) {
        this.p2 = p;
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

        this.dessiner();
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<Segment>();
            Segment s1 = new Segment(p1, p3);
            segments.add(s1);

            Segment s2 = new Segment(p2, p4);
            segments.add(s2);

            Segment s3 = new Segment(p2, p3);
            segments.add(s3);

            Segment s4 = new Segment(p1, p4);
            segments.add(s4);

            return segments;
    }
    @Override
    public String typeForme() {
        return "Q";
    }


    public String toString() {
        return "Quadrilateres{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 +'}';
    }


    

    public Quadrilateres(PointPlan p1, PointPlan p2) throws ColineaireException {
        if ( MethodeTest.colineaires(p1, p2)) {
            throw new ColineaireException("Erreur: Les points sont colinéaires");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = new PointPlan(p2.getAbscisse(), p1.getOrdonnee());
        this.p4 = new PointPlan(p1.getAbscisse(), p2.getOrdonnee());
        this.setNomForme("Quadrilatères");
    } 
}