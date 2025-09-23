class TestComplexNum {
    public static void main(String[] args) {
      /*
       * Testare la classe come segue:
       *
       * 1) Creare il numero complesso 3+5i e memorizzarlo nella variabile c1
       *
       * 2) Creare il numero complesso 7-4i e memorizzarlo nella variabile c2
       *
       * 3) Creare il numero complesso -2+3i e memorizzarlo nella variabile c3
       *
       * 4) Creare il numero complesso -2+3i e memorizzarlo nella variabile c4
       *
       * 5) Stampare in standard output la rappresentazione testuale di
       * c1,c2,c3,c4 restituita dal metodo toStringRep()
       *
       * 6) Sommare a c1 c2
       * (somma di due num complessi (a + ib) + (c + id) = (a + c) + i(b + d)
       *
       * 7) Sommare a c2 c4
       *
       * 8) Stampare nuovamente in standard output la rappresentazione testuale
       * di c1,c2,c3,c4
       *
       * 9) Controllare se l'output corrisponde a quanto preventivato
       *
       * 10) Invocare il metodo equal su c3 per tre volte, passando come input
       * c1,c2,c4. Stampare il risultato di ciascuna invocazione in standard
       * output
       *
       * 11) Controllare se l'output corrisponde a quanto preventivato
       */
	   
	   ComplexNum c1 = new ComplexNum();
	   c1.build(3.0, 5.0);
	   ComplexNum c2 = new ComplexNum();
	   c2.build(7.0, -4.0);
	   ComplexNum c3 = new ComplexNum();
	   c3.build(-2.0, 3.0);
	   ComplexNum c4 = new ComplexNum();
	   c4.build(-2.0, 3.0);
	   System.out.print(c1.toStringRep() + "\n" + c2.toStringRep() + "\n" + c3.toStringRep() + "\n" + c4.toStringRep() + "\n\n");
	   c1.add(c2);
	   c2.add(c4);
	   System.out.print(c1.toStringRep() + "\n" + c2.toStringRep() + "\n" + c3.toStringRep() + "\n" + c4.toStringRep() + "\n\n");
	   System.out.println(c3.equal(c1));
	   System.out.println(c3.equal(c2));
	   System.out.println(c3.equal(c4));
    }
}
