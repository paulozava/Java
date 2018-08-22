
public class TestIRBrasil {

	public static void consultaIR(double salario) {
		if (1900.00 < salario && salario <= 2800.00) {
			System.out.println("Aluquota de 7,5% e dedução de R$ 142,00");
		} else if (2800.00 < salario && salario <= 3751.00) {
			System.out.println("Aluquota de 15% e dedução de R$ 350,00");
		} else if (3751.00 < salario && salario <= 4664.00) {
			System.out.println("Aluquota de 22,5% e dedução de R$ 636,00");
		} else {
			System.out.println("Consulte seu contador");
		}
	}

	public static void main(String[] args) {
		consultaIR(1100.00);
		consultaIR(1990.00);
		consultaIR(2900.00);
		consultaIR(3800.00);
		consultaIR(10100.00);
	}
}
