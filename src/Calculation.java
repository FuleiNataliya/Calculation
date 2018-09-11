
public class Calculation {

	public static void main(String[] args) {
		Trykutnyk t = new Trykutnyk();
		System.out.printf("Perimeter of the triangle %s%n", t.perymetrTrykytnyka());
		Kvadrat k = new Kvadrat();
		System.out.printf("Perimeter of the square %s%n", k.perymetrKvadrata());
		Pryamokutnyk p = new Pryamokutnyk();
		System.out.printf("Perimeter of the rectangle %s%n", p.perymetrPryamokutnyka());
		Paralelogram g = new Paralelogram();
		System.out.printf("Perimeter of the parallelogram %s%n", g.perymetrPryamokutnyka());
		Romb r = new Romb();
		System.out.printf("Perimeter of diamond %s%n", r.perymetrKvadrata());
		Kolo o = new Kolo();
		System.out.printf("Circle area %s%n", o.dovgynaKola());
		Chotyrykutnyk ch = new Chotyrykutnyk();
		System.out.printf("Perimeter of the quadrilateral %s%n", ch.perymetrChotyrukytnyka());
	}

}
