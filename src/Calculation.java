
public class Calculation {

	public static void main(String[] args) {
		Trykutnyk t = new Trykutnyk();
		System.out.printf("�������� ���������� %s%n", t.perymetrTrykytnyka());
		Kvadrat k = new Kvadrat();
		System.out.printf("�������� �������� %s%n", k.perymetrKvadrata());
		Pryamokutnyk p = new Pryamokutnyk();
		System.out.printf("�������� ������������ %s%n", p.perymetrPryamokutnyka());
		Paralelogram g = new Paralelogram();
		System.out.printf("�������� ������������� %s%n", g.perymetrPryamokutnyka());
		Romb r = new Romb();
		System.out.printf("�������� ����� %s%n", r.perymetrKvadrata());
		Kolo o = new Kolo();
		System.out.printf("������� ���� %s%n", o.dovgynaKola());
		Chotyrykutnyk ch = new Chotyrykutnyk();
		System.out.printf("�������� ������������� %s%n", ch.perymetrChotyrukytnyka());
	}

}
