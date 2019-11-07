package com.ruda.s1;

import static org.junit.Assert.*;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;

public class DataSourceTest extends TestAbstractCase {
	@Inject
	private DataSource dataSource;
	
	@Test
	public void test() throws Exception {
		assertNotNull(dataSource.getConnection());
	}

}
