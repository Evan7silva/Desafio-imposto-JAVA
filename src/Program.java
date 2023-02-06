import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Renda anual com salário: ");
		double salarioAnual = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviços: ");
		double servicoAnual = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		double capitalAnual = sc.nextDouble();
		System.out.print("Gastos medicos: ");
		double gastoMedico = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		double gastoEducacao = sc.nextDouble();
		
		int imposto;
		double salario = salarioAnual / 12;
		double impostoSalario, impostoServico, impostoCapital, impostoBruto, maximo, gasto, abartimento, impostoDevido;
		
		
		if (salario < 3000.0) {
			imposto = 0;
		}else if (salario <= 5000.0) {
			imposto = 10;
		}else
			imposto = 20;
		
		impostoSalario = salarioAnual * imposto / 100;
		impostoServico = servicoAnual * 15 / 100;
		impostoCapital = capitalAnual * 20 /100;
		impostoBruto = impostoSalario + impostoServico + impostoCapital;
		
		maximo = impostoBruto / 100 * 30;
		gasto = gastoMedico + gastoEducacao;
		
		if (maximo < gasto) {
			abartimento = maximo;
		}else
			abartimento = gasto;
		
		impostoDevido = impostoBruto - abartimento;
		
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA: ");
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
		System.out.println();
		System.out.println("DEDUÇÕES: ");
		System.out.printf("Máximo dedutível: %.2f%n", maximo);
		System.out.printf("Gastos dedutíveis: %.2f%n", gasto);
		System.out.println();
		System.out.println("RESUMO: ");
		System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
		System.out.printf("Abatimento: %.2f%n", abartimento);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		
		sc.close();

	}

}
