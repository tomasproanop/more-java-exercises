//https://www.youtube.com/watch?v=H0OetoieSDQ&list=PL59LTecnGM1Mg6I4i_KbS0w5bPcDjl7oz&index=15
//igual 
se puede importar métodos de esta manera


package paclage2;

import package1.Access1;

//access3 subclass of access1:
//public class Access3 extends Access1{}

//ahi puedo accesar como Access3 -> hours (private!)

public class Access3 {
	
	public static void main(String[] args) {
		Access1 a = new Access1();
		System.out.println(a.hours2);
	}

}
