package practice_hands_tax_Calculator;

public class From60To80TaxCalculator extends AbstractTaxCalculator {
	private static TaxSlab[] FROM_60_TO_80_TAX_SLABS = {
		new TaxSlab(0.0, 300000.0, 0),
		new TaxSlab(300000.0, 500000.0, 5),
		new TaxSlab(500000.0, 1000000.0, 20),
		new TaxSlab(1000000.0, Double.MAX_VALUE, 30)
	};
	
	public From60To80TaxCalculator(double annualIncome) {
		super(annualIncome);
		this.taxSlabs = FROM_60_TO_80_TAX_SLABS;
	}
}
