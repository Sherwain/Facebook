package test;

public class Outer {
	void d() { System.out.println("Outer d()"); }
    public class Inner {
        public Outer getOuter() {
            return Outer.this;
        }
    }
    public Inner getInner() { return new Inner(); }
    public static void main(String[] args) {
        Outer ot = new Outer();
        Outer.Inner oi = ot.getInner();
        oi.getOuter().d();
    }
}
