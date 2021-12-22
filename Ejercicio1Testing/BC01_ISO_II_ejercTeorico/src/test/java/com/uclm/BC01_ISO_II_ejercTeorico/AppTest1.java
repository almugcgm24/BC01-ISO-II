package BC01_ISO_II_ejercTeorico.src.test.java.com.uclm.BC01_ISO_II_ejercTeorico;

import static org.junit.Assert.*;


import BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.DatosException;
import BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.HumedadException;
import BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.NoHayAforoException;

import org.junit.*;

public class AppTest1 {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before-> How many times do I appear?");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After-> How many times do I appear?");
	}
	
	
	@Test
	public void testMenu()  {

		assertEquals(true, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.menu());
	}
	
	
	@Test
	public void testMain9() throws NoHayAforoException, DatosException, HumedadException {
		
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.covid = false;
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.actividadRealizar().equalsIgnoreCase("No puede realizar ninguna actividad"));
	}
	
	@Test
	public void testMain() throws NoHayAforoException, DatosException, HumedadException {
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.covid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.temperatura = -10;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.humedad = 10;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.precipitaciones = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.aforo = 100;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.nublado = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.confinamiento = true;
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.actividadRealizar().equalsIgnoreCase("Mejor quedate en casa"));
	}
	
	@Test
	public void testMain2() throws NoHayAforoException, DatosException, HumedadException {
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.covid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.temperatura = -10;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.humedad = 10;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.precipitaciones = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.aforo = 100;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.nublado = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.confinamiento = true;
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.actividadRealizar().equalsIgnoreCase("Puedes ir a esquiar"));
	}
	
	@Test
	public void testMain3() throws NoHayAforoException, DatosException, HumedadException {
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.covid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.temperatura = 10;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.humedad = 10;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.precipitaciones = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.aforo = 100;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.nublado = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.confinamiento = true;
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.actividadRealizar().equalsIgnoreCase("Puedes hacer senderismo"));
	}
	
	@Test
	public void testMain4() throws NoHayAforoException, DatosException, HumedadException {
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.covid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.temperatura = 17;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.humedad = 55;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.precipitaciones = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.aforo = 100;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.nublado = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.confinamiento = false;
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.actividadRealizar().equalsIgnoreCase("Puedes hacer turismo al aire libre"));
	}
	
	@Test
	public void testMain5() throws NoHayAforoException, DatosException, HumedadException {
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.covid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.temperatura = 26;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.humedad = 10;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.precipitaciones = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.aforo = 80;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.nublado = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.confinamiento = false;
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.actividadRealizar().equalsIgnoreCase("Puedes irte de cañas"));
	}
	
	@Test
	public void testMain6() throws NoHayAforoException, DatosException, HumedadException {
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.covid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.temperatura = 37;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.humedad = 10;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.precipitaciones = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.aforo = 80;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.nublado = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.confinamiento = false;
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.actividadRealizar().equalsIgnoreCase("Puedes ir a la piscina o a la playa"));
	}
	
	
	@Test
	public void testMain7() throws NoHayAforoException, DatosException, HumedadException {
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.covid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.temperatura = 31;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.humedad = 10;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.precipitaciones = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.aforo = 200;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.nublado = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.confinamiento = false;
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.actividadRealizar().equalsIgnoreCase("Puedes ir a la playa"));
	}
	
	@Test
	public void testMain8() throws NoHayAforoException, DatosException, HumedadException {
	
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.aforo = -9;
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.actividadRealizar().equalsIgnoreCase("Lo sentimos, no hay plazas suficientes."));
		
	}
	
	
	
	@Test
	public void test_obtenerHumedad() throws HumedadException{
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application a = new BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application();
		//Application.humedad = 10;
		System.out.println("Intro humedad: \n");
		assertTrue(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application.obtenerHumedad()<100);
	}
	
	@Test
	public void testObtenerPositivo() throws DatosException {
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application a = new BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Application();
		System.out.println("Intro numero positivo: \n");
		assertTrue(a.obtenerPositivo()>0);
	}


	
	
	@Test
	public void testSaludPersona()throws Exception {
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona p = new BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana ,BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid);
		assertEquals(true, p.saludPersona());
	}

	@Test
	public void testIsSana() throws Exception{
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona p = new BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana ,BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid);

		assertEquals(true, p.isSana());
	}

	@Test
	public void testSetSana() throws Exception{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testIsSintomas() throws Exception{
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona p = new BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana ,BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid);

		assertEquals(false, p.isSintomas());
	}

	@Test
	public void testSetSintomas() throws Exception{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testIsContacto() throws Exception{
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona p = new BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana ,BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid);

		assertEquals(false, p.isContacto());
	}

	@Test
	public void testSetContacto() throws Exception{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testIsPasaporteCovid() throws Exception{
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona p = new BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana ,BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid);

		assertEquals(true, p.isPasaporteCovid());
	}

	@Test
	public void testSetPasaporteCovid() throws Exception{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testIsPasadoCovid() throws Exception{
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto = false;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid = true;
		BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona p = new BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona(BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sana ,BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.sintomas, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.contacto, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasaporteCovid, BC01_ISO_II_ejercTeorico.src.main.java.com.uclm.BC01_ISO_II_ejercTeorico.Persona.pasadoCovid);
		assertEquals(true, p.isPasadoCovid());
	}

	@Test
	public void testSetPasadoCovid() throws Exception{
		fail("Not yet implemented"); // TODO
	}

}
