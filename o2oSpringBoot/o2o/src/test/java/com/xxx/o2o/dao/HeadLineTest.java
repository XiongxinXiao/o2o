package com.xxx.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xxx.o2o.entity.HeadLine;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HeadLineTest {
	@Autowired
	private HeadLineDao headLineDao;
	
	@Test
	@Disabled
	public void testAaddHeadLine () {
		HeadLine hl = new HeadLine();
		hl.setLineName("5");
		hl.setEnableStatus(1);
		hl.setLineImg("test");
		hl.setPriority(5);
		int result = headLineDao.insertHeadLine(hl);
		assertEquals(1, result);
	}
	@Test
	@Disabled
	public void testBqueryHeadLineById () {
		HeadLine hl = headLineDao.queryHeadLineById(6L);
		assertEquals("5", hl.getLineName());
	}
	@Test
	public void testCupdateHeadLine () {
		HeadLine hl = new HeadLine();
		hl.setLineId(1L);
		hl.setPriority(10);
		int result = headLineDao.updateHeadLine(hl);
		assertEquals(1, result);
	}
	@Test
	@Disabled
	public void testDdeleteHeadLine () {
		int result = headLineDao.deleteHeadLine(6L);
		assertEquals(1, result);
	}
	
}
