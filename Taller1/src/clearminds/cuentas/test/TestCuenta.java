package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1=new Cuenta("03476");
		Cuenta cuenta2=new Cuenta("03476","C",98);
		Cuenta cuenta3=new Cuenta("03476");
		Cuenta cuenta4=new Cuenta("0987");
		Cuenta cuenta5=new Cuenta("0557","C",10);
		Cuenta cuenta6=new Cuenta("0666","A",0);
		
		cuenta1.setSaldo(675);
		cuenta3.setTipo("C");
		
	
		
		System.out.println("-----Valores Iniciales-----");
		System.out.println(cuenta1.getId());
		System.out.println(cuenta1.getTipo());
		System.out.println(cuenta1.getSaldo());
		
		System.out.println("***************************");
		
		System.out.println(cuenta2.getId());
		System.out.println(cuenta2.getTipo());
		System.out.println(cuenta2.getSaldo());
		
		System.out.println("***************************");
		
		System.out.println(cuenta3.getId());
		System.out.println(cuenta3.getTipo());
		System.out.println(cuenta3.getSaldo());
		
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		
		System.out.println("-----Valores Modificados-----");
		
		System.out.println(cuenta1.getId());
		System.out.println(cuenta1.getTipo());
		System.out.println(cuenta1.getSaldo());
		
		System.out.println("***************************");
		
		System.out.println(cuenta2.getId());
		System.out.println(cuenta2.getTipo());
		System.out.println(cuenta2.getSaldo());
		
		System.out.println("***************************");
		
		System.out.println(cuenta3.getId());
		System.out.println(cuenta3.getTipo());
		System.out.println(cuenta3.getSaldo());
		
		
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);
		
		System.out.println("---------------------------------");
		
		cuenta4.imprimirConMiEstilo();
		System.out.println("***************************");
		cuenta5.imprimirConMiEstilo();
		System.out.println("***************************");
		cuenta6.imprimirConMiEstilo();
		
	}

}
