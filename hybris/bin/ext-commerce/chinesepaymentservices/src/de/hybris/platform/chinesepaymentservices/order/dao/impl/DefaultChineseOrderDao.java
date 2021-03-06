/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 */
package de.hybris.platform.chinesepaymentservices.order.dao.impl;

import de.hybris.platform.chinesepaymentservices.order.dao.ChineseOrderDao;
import de.hybris.platform.core.enums.OrderStatus;
import de.hybris.platform.core.enums.PaymentStatus;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.order.daos.impl.DefaultOrderDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;


public class DefaultChineseOrderDao extends DefaultOrderDao implements ChineseOrderDao
{

	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<AbstractOrderModel> findUnpaidOrders(final long millisecond)
	{
		final String fsq = "SELECT {" + OrderModel.PK + "} FROM {" + OrderModel._TYPECODE + "} WHERE {" + OrderModel.DATE
				+ "} < ?today  and {" + OrderModel.PAYMENTSTATUS + "} in ({{ select {pk} from {" + PaymentStatus._TYPECODE
				+ "} where {code}='NOTPAID'}}) and {" + OrderModel.STATUS + "} in ({{ select {pk} from {" + OrderStatus._TYPECODE
				+ "} where {code}!='CANCELLED'}})";
		final Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		final Date validTime = new Date(cal.getTimeInMillis() - millisecond);
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq);
		query.addQueryParameter("today", validTime);
		final List<AbstractOrderModel> unpaidOrders = getFlexibleSearchService().<AbstractOrderModel> search(query).getResult();
		return unpaidOrders;
	}

	@Override
	public AbstractOrderModel findOrderByCode(final String orderCode)
	{
		final String fsq = "SELECT {" + OrderModel.PK + "} FROM {" + OrderModel._TYPECODE + "} WHERE {" + OrderModel.CODE
				+ "}=?orderCode";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(fsq);
		query.addQueryParameter("orderCode", orderCode);
		final List<AbstractOrderModel> Orders = getFlexibleSearchService().<AbstractOrderModel> search(query).getResult();
		if (Orders != null && Orders.size() > 0)
		{
			return Orders.get(0);
		}
		return null;
	}

	@Override
	protected FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	@Override
	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}


}
