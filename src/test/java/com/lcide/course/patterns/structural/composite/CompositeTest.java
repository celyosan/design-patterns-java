package com.lcide.course.patterns.structural.composite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CompositeTest {
	
	@Test
	void test_Composite_OneHuman () {
		CuentaComponent cuentaCorrienteAlberto = new CuentaCorrienteLeaf(1000.0, "Cuenta Especial +35");
		CuentaComponent cuentaAhorroAlberto = new CuentaAhorroLeaf(2000.0, "Cuenta SuperAhorro +35");
		
		CuentaComposite cuentaCompositeAlberto = new CuentaComposite("Alberto");
		cuentaCompositeAlberto.addCuenta(cuentaCorrienteAlberto);
		cuentaCompositeAlberto.addCuenta(cuentaAhorroAlberto);
		
		cuentaCompositeAlberto.showAccountName();
		assertEquals(3000.0, cuentaCompositeAlberto.getAmount());	
		
		
	}
	
	@Test
	void test_Composite_AFamily () {
		CuentaComponent cuentaCorrienteAlberto = new CuentaCorrienteLeaf(1000.0, "Cuenta Especial +35");
		CuentaComponent cuentaAhorroAlberto = new CuentaAhorroLeaf(2000.0, "Cuenta SuperAhorro +35");
		
		CuentaComposite cuentaCompositeAlberto = new CuentaComposite("Alberto");
		cuentaCompositeAlberto.addCuenta(cuentaCorrienteAlberto);
		cuentaCompositeAlberto.addCuenta(cuentaAhorroAlberto);
		
		assertEquals(3000.0, cuentaCompositeAlberto.getAmount());
		
		CuentaComponent cuentaCorrienteJuana = new CuentaCorrienteLeaf(3000.0, "Cuenta Joven");
		CuentaComponent cuentaAhorroJuana = new CuentaAhorroLeaf(4000.0, "Cuenta Ahorro Joven");
		
		CuentaComposite cuentaCompositeJuana = new CuentaComposite("Juana");
		cuentaCompositeJuana.addCuenta(cuentaCorrienteJuana);
		cuentaCompositeJuana.addCuenta(cuentaAhorroJuana);
		
		assertEquals(7000.0, cuentaCompositeJuana.getAmount());
		
		CuentaComposite cuentaFamilia = new CuentaComposite("Familia");
		cuentaFamilia.addCuenta(cuentaCompositeAlberto);
		cuentaFamilia.addCuenta(cuentaCompositeJuana);
		
		cuentaFamilia.showAccountName();
		assertEquals(10000.0, cuentaFamilia.getAmount());
	}

}
