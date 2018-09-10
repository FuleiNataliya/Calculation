
public class Calculation {

	public static void main(String[] args) {
		Trykutnyk t = new Trykutnyk();
		System.out.printf("Периметр трикутника %s%n", t.perymetrTrykytnyka());
		Kvadrat k = new Kvadrat();
		System.out.printf("Периметр квадрата %s%n", k.perymetrKvadrata());
		Pryamokutnyk p = new Pryamokutnyk();
		System.out.printf("Периметр прямокутника %s%n", p.perymetrPryamokutnyka());
		Paralelogram g = new Paralelogram();
		System.out.printf("Периметр паралелограма %s%n", g.perymetrPryamokutnyka());
		Romb r = new Romb();
		System.out.printf("Периметр ромба %s%n", r.perymetrKvadrata());
		Kolo o = new Kolo();
		System.out.printf("Довжина кола %s%n", o.dovgynaKola());
		Chotyrykutnyk ch = new Chotyrykutnyk();
		System.out.printf("Периметр чотирикутника %s%n", ch.perymetrChotyrukytnyka());
	}

}
