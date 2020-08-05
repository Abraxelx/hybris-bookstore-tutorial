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
 */
package de.hybris.platform.warehousingbackoffice.services.printshippinglabel;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.ordersplitting.model.ConsignmentModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.warehousingbackoffice.actions.utils.VelocityRendererUtil;
import de.hybris.platform.warehousingbackoffice.context.PickSlipContext;
import de.hybris.platform.warehousingbackoffice.services.printshippinglabel.impl.MockPrintShippingLabelService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.hybris.cockpitng.actions.ActionContext;


@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class PrintShippingLabelServiceTest
{
	@Spy
	@InjectMocks
	private final MockPrintShippingLabelService printShippingLabelService = new MockPrintShippingLabelService();

	@Mock
	private ModelService modelService;

	@Mock
	private VelocityRendererUtil velocityRendererUtil;

	@Mock
	private ConsignmentModel consignmentModel;

	@Mock
	private ActionContext<ConsignmentModel> context;

	@Before
	public void setUp() {
		when(printShippingLabelService.getVelocityRendererUtil()).thenReturn(velocityRendererUtil);
	}

	@Test
	public void testPopupGeneration() {
		printShippingLabelService.printShippingLabel(consignmentModel, context);
		verify(velocityRendererUtil).generatePopupScript(anyString(), any(PickSlipContext.class), any(ConsignmentModel.class),
				anyMap(), anyString(), anyString());
	}

}