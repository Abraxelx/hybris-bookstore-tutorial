/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package de.hybris.platform.cmswebservices.namedquery.service.impl;


import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.cmswebservices.exception.InvalidNamedQueryException;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class NamedQueryFactoryTest
{

	private static final String QUERY = "QUERY";
	private static final String QUERY_NAME = "QUERY_NAME";
	@Mock
	Map<String, String> namedQueryDefinitionMap;

	@InjectMocks
	DefaultNamedQueryFactory namedQueryFactory;

	@Test(expected = InvalidNamedQueryException.class)
	public void testInvalidNamedQueryException() throws InvalidNamedQueryException
	{
		Mockito.when(namedQueryDefinitionMap.containsKey(Mockito.anyString())).thenReturn(false);
		namedQueryFactory.getNamedQuery(Mockito.anyString());
	}

	@Test
	public void testRetrieveNamedQuery() throws InvalidNamedQueryException
	{
		Mockito.when(namedQueryDefinitionMap.containsKey(Mockito.anyString())).thenReturn(true);
		Mockito.when(namedQueryDefinitionMap.get(Mockito.anyString())).thenReturn(QUERY);

		final String resultingQuery = namedQueryFactory.getNamedQuery(QUERY_NAME);
		Assert.assertEquals(QUERY, resultingQuery);
	}
}
