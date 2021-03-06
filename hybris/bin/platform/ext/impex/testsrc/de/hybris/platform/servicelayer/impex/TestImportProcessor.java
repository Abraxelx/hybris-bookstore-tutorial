/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.servicelayer.impex;

import de.hybris.platform.impex.jalo.header.HeaderValidationException;
import de.hybris.platform.impex.jalo.imp.DefaultImportProcessor;
import de.hybris.platform.impex.jalo.imp.ExistingItemResolver;
import de.hybris.platform.impex.jalo.imp.MultiThreadedImportProcessor;
import de.hybris.platform.impex.jalo.imp.ValueLine;


public class TestImportProcessor extends DefaultImportProcessor
{
	@Override
	protected ExistingItemResolver getExistingItemResolver(final ValueLine valueLine) throws HeaderValidationException
	{
		return new TestExistingItemResolver(this);
	}

    public boolean isSecondPass()
    {
        return this.getReader().isSecondPass();
    }
}
