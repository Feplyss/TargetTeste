package Target;
import java.text.DecimalFormat;

public class TargetQ4 {

	public static void main(String[] args) {
		
		Double sp = 67836.43;
		Double rj = 36678.66;
		Double mg = 29229.88;
		Double es = 27165.48;
		Double outros = 19849.53;
		Double max = sp + rj + mg + es + outros;
		Double percent = max / 100;
		
		DecimalFormat numberFormat = new DecimalFormat("#.0");
		
		System.out.println("Porcentagem de SP: " + numberFormat.format(sp / percent) + "%.");
		System.out.println("Porcentagem do RJ: " + numberFormat.format(rj / percent) + "%.");
		System.out.println("Porcentagem de MG: " + numberFormat.format(mg / percent) + "%.");
		System.out.println("Porcentagem do ES: " + numberFormat.format(es / percent) + "%.");
		System.out.println("Porcentagem dos outros estados: " + numberFormat.format(outros / percent) + "%.");
	}
}
