/*
 *  
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
 */
package de.hybris.platform.yacceleratorordermanagement.actions.returns;

import de.hybris.platform.basecommerce.enums.ReturnAction;
import de.hybris.platform.processengine.action.AbstractAction;
import de.hybris.platform.returns.model.ReturnRequestModel;
import de.hybris.platform.task.RetryLaterException;
import de.hybris.platform.warehousing.model.ReturnProcessModel;
import org.apache.log4j.Logger;

import java.util.HashSet;
import java.util.Set;


/**
 * Check whether the return request is an instore or an online request and redirects it to the appropriate step.
 */
public class InitialReturnAction extends AbstractAction<ReturnProcessModel>
{
	private static final Logger LOG = Logger.getLogger(InitialReturnAction.class);

	protected enum Transition
	{
		ONLINE, INSTORE;

		public static Set<String> getStringValues()
		{
			final Set<String> res = new HashSet<String>();

			for (final Transition transition : Transition.values())
			{
				res.add(transition.toString());
			}
			return res;
		}
	}

	@Override
	public String execute(ReturnProcessModel process) throws RetryLaterException, Exception
	{
		LOG.info("Process: " + process.getCode() + " in step " + getClass().getSimpleName());

		final ReturnRequestModel returnRequest = process.getReturnRequest();

		String transition = (returnRequest.getReturnEntries().stream().allMatch(entry -> entry.getAction().equals(
				ReturnAction.IMMEDIATE))) ? Transition.INSTORE.toString() : Transition.ONLINE.toString();

		LOG.debug("Process: " + process.getCode() + " transitions to " + transition);

		return transition;
	}

	@Override
	public Set<String> getTransitions()
	{
		return Transition.getStringValues();
	}

}
