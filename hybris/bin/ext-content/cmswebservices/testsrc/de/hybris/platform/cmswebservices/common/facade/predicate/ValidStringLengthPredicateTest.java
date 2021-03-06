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
package de.hybris.platform.cmswebservices.common.facade.predicate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ValidStringLengthPredicateTest
{
	private static final int MAX_LENGTH = 5;
	private static final String VALID = "valid";
	private static final String INVALID = "invalid";

	private final ValidStringLengthPredicate predicate = new ValidStringLengthPredicate();

	@Before
	public void setUp()
	{
		predicate.setMaxLength(MAX_LENGTH);
	}

	@Test
	public void shouldPass()
	{
		Assert.assertTrue(predicate.test(VALID));
	}

	@Test
	public void shouldFail()
	{
		Assert.assertFalse(predicate.test(INVALID));
	}
}
