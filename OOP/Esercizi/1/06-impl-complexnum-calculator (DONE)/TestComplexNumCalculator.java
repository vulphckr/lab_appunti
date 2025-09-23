class TestComplexNumCalculator {
  public static void main(String[] args) {
      /*
       * 1) Testare la classe ComplexNumCalculator con le seguenti operazioni
       *    tra numeri complessi:
       *
       * - add(1+2i, 2+3i) = 3+5i
       *
       * - sub(4+5i, 6+7i) = -2-2i
       *
       * - mul(8+2i, 3-i) = 26 - 2i
       *
       * - ... altre a piacere
       *
       * 2) Verificare il corretto valore dei campi nOpDone, lastRes
       *
       * 3) Fare altre prove con operazioni a piacere
       */
	   ComplexNumCalculator calc = new ComplexNumCalculator();
	   calc.build();
	   ComplexNum c1 = new ComplexNum();
	   c1.build(1.0, 2.0);
	   ComplexNum c2 = new ComplexNum();
	   c2.build(2.0, 3.0);
	   ComplexNum res = new ComplexNum();	   
	   res = calc.add(c1, c2);
	   System.out.println(c1.toStringRep() + " + " + c2.toStringRep() + " = " + res.toStringRep() + "\n");
	   
	   c1.build(4.0, 5.0);
	   c2.build(6.0, 7.0);
	   res = calc.sub(c1, c2);
	   System.out.println(c1.toStringRep() + " - " + c2.toStringRep() + " = " + res.toStringRep() + "\n");
	   
	   c1.build(8.0, 2.0);
	   c2.build(3.0, -1.0);
	   res = calc.mul(c1, c2);
	   System.out.println(c1.toStringRep() + " * " + c2.toStringRep() + " = " + res.toStringRep() + "\n");
	   
	   System.out.println(
		"Operazioni eseguite: "+ calc.nOpDone + "\n" 
			+ "Ultimo risultato: " + calc.lastRes.toStringRep() + "\n"
		);  
	    
	   res = calc.div(c1, c2);
	   System.out.println(c1.toStringRep() + " / " + c2.toStringRep() + " = " + res.toStringRep() + "\n");
  }
}
