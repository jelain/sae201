import ardoise.*;
import java.util.ArrayList;

public class Maisons extends Forme{
    private Triangles toit;
    private Quadrilateres corps;
    private Quadrilateres porte;

    public Maisons() {
        super();
    }

    public Maisons(Triangles toit, Quadrilateres corps, Quadrilateres porte) {
        this.toit = toit;
        this.corps = corps;
        this.porte = porte;
        this.setNomForme("Maison");
    }

    public Triangles getToit() {
        return this.toit;
    }

    public Quadrilateres getCorps() {
        return this.corps;
    }

    public Quadrilateres getPorte() {
        return this.porte;
    }
    
    public void setToit(Triangles toit) {
        this.toit = toit;
    }

    public void setCorps(Quadrilateres corps) {
        this.corps = corps;
    }

    public void setPorte(Quadrilateres porte) {
        this.porte = porte;
    }

    @Override
    public void deplacer(int x, int y) {
        return;
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> s1 = new ArrayList<Segment>(this.toit.dessiner());
        ArrayList<Segment> s2 = new ArrayList<Segment>(this.corps.dessiner());
        ArrayList<Segment> s3 = new ArrayList<Segment>(this.porte.dessiner());

        ArrayList<Segment> slist = new ArrayList<Segment>();

        for(int i = 0; i<s1.size(); i++) {
            slist.add(s1.get(i));
        }

        for(int i = 0; i<s2.size(); i++) {
            slist.add(s2.get(i));
        }

        for(int i = 0; i<s3.size(); i++) {
            slist.add(s3.get(i));
        }

        return slist;
    }

    @Override
    public String typeForme() {
        return "GF";
    }

    public String toString() {
        return "Maison { Toit = " + this.getToit() + ", Corps = " + this.getCorps() + ", Porte = " + this.getPorte() + " }";
    }
}
