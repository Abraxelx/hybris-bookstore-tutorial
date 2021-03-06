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
package de.hybris.platform.webservicescommons.oauth2.client.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalBaseTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.webservicescommons.model.OAuthClientDetailsModel;
import de.hybris.platform.webservicescommons.oauth2.client.ClientDetailsDao;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class ClientDetailsDaoTest extends ServicelayerTransactionalBaseTest
{
	private static final String CLIENT_ID = "test_client";

	@Resource
	private ClientDetailsDao oauthClientDetailsDao;

	@Resource
	private ModelService modelService;

	@Before
	public void setup()
	{
		final OAuthClientDetailsModel client = new OAuthClientDetailsModel();
		client.setClientId(CLIENT_ID);
		modelService.save(client);
	}


	@Test(expected = IllegalArgumentException.class)
	public void testNull()
	{
		oauthClientDetailsDao.findClientById(null);
	}

	@Test
	public void testSingleValid()
	{
		final OAuthClientDetailsModel clientDetailsModel = oauthClientDetailsDao.findClientById(CLIENT_ID);
		Assert.assertNotNull(clientDetailsModel);
		Assert.assertEquals(CLIENT_ID, clientDetailsModel.getClientId());
	}

	@Test
	public void testInvalid()
	{
		final OAuthClientDetailsModel clientDetailsModel = oauthClientDetailsDao.findClientById("qwertyuiop");
		Assert.assertNull("ClientDetails should be null", clientDetailsModel);
	}
}
