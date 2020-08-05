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
package de.hybris.platform.b2bacceleratorservices.order.checkout.pci;

import de.hybris.platform.acceleratorservices.enums.CheckoutPciOptionEnum;



/**
 *
 */
public interface B2BCheckoutPciStrategy
{
	/**
	 * Returns one of the possible {@link CheckoutPciOptionEnum} values - to select the PCI options.
	 */
	CheckoutPciOptionEnum getSubscriptionPciOption();
}