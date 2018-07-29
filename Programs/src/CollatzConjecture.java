import java.math.BigDecimal;

public class CollatzConjecture {

	public static void main(String[] args) {
		BigDecimal n = new BigDecimal("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
		
		CollatzConjecture cc = new CollatzConjecture();
		while(n.compareTo(new BigDecimal(1)) == 1){
			n = cc.check(n);
		}
	}
	
	public BigDecimal check(BigDecimal n){
		if((n.remainder(new BigDecimal(2)).compareTo(new BigDecimal(0)) == 0)){
			n = n.divide(new BigDecimal(2));
			System.out.println(n);
		}else{
			n = (n.multiply(new BigDecimal(3)).add(new BigDecimal(1)));
			System.out.println(n);
		}
		return n;
	}

}
