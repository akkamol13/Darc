package com.drc.test;

import org.junit.Test;

import com.drc.controller.GenerateReport;

/**
 * 
 */

/**
 * @author AmolK
 *
 */
public class DiscoverabilityTest {
	
	GenerateReport report = new GenerateReport(); 
	@Test
	public void testAlexaRankingFound()	{
		report.generateReport();
		System.out.println("Alexa ranking::");
	}
	
	

}
