package Hooks;

import java.io.IOException;

import BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void setUp() throws IOException {

		System.out.println("======Application is Getting Launched=======");
		setup();
		System.out.println("======Application Launched Successfully=======");

	}

	@After
	public void tearDown() {

		teardown();
		System.out.println("======Application is Closed=======");
	}

}
