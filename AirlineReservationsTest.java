package airplane;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirlineReservationsTest {
	AirlineReservations passenger=new AirlineReservations();

	@Before
	public void setUp()throws Exception {
		passenger.setname("Batuhan");
		passenger.setsurname("Arslan");
		passenger.setticketno(8);
		passenger.setseatno(9);
	}	

	@Test
	public void test1() {
		assertEquals("Batuhan",passenger.getname());
	}
	@Test
	public void test2() {
		assertEquals(true,passenger.checkName());
	}
	@Test
	public void test3() {
		passenger.setname("a");
		assertEquals(false,passenger.checkName());
	}
	@Test
	public void test4() {
		passenger.setname("1111");
		assertEquals(false,passenger.checkName());
	}
	@Test
	public void test5() {
		passenger.setname("Kubilay");
		assertEquals(true,passenger.checkName());
	}
	@Test
	public void test6() {
		assertEquals("Arslan",passenger.getsurname());
	}
	@Test
	public void test7() {
		assertEquals(true,passenger.checkSurname());
	}
	@Test
	public void test8() {
		passenger.setsurname("A");
		assertEquals(false,passenger.checkSurname());
	}
	@Test
	public void test9() {
		passenger.setsurname("5");
		assertEquals(false,passenger.checkSurname());
	}
	@Test
	public void test10() {
		passenger.setsurname("Zor");
		assertEquals(true,passenger.checkSurname());
	}
	@Test
	public void test11() {
		assertEquals(8,passenger.getticketno());
	}
	@Test
	public void test12() {
		assertEquals(true,passenger.checkTicket());
	}
	@Test
	public void test13() {
		passenger.setticketno(-1);
		assertEquals(false,passenger.checkTicket());
	}
	@Test
	public void test14() {
		passenger.setticketno(7);
		assertEquals(true,passenger.checkTicket());
	}
	@Test
	public void test15() {
		passenger.setticketno(0);
		assertEquals(false,passenger.checkTicket());
	}
	@Test
	public void test16() {
		assertEquals(9,passenger.getseatno());
	}
	@Test
	public void test17() {
		assertEquals(true,passenger.checkSeat());
	}
	@Test
	public void test18() {
		passenger.setseatno(-1);
		assertEquals(false,passenger.checkSeat());
	}
	@Test
	public void test19() {
		passenger.setseatno(7);
		assertEquals(true,passenger.checkSeat());
	}
	@Test
	public void test20() {
		passenger.setseatno(0);
		assertEquals(false,passenger.checkSeat());
	}
	

}
