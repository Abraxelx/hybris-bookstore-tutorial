package my.bookstore.core.services.impl;

import de.hybris.platform.commerceservices.customer.impl.DefaultCustomerAccountService;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import my.bookstore.core.model.BookModel;
import my.bookstore.core.model.RewardStatusLevelConfigurationModel;
import my.bookstore.core.services.BookstoreCustomerAccountService;

import java.util.List;

public class DefaultBookstoreCustomerAccountService extends DefaultCustomerAccountService  implements BookstoreCustomerAccountService  {
    @Override
    public void updateRewardStatusPoints(CustomerModel customer, OrderModel o) {
        int total = 0; //represents total number of point that Customer will get for this order
        for (final AbstractOrderEntryModel entry : o.getEntries())
        {
            final BookModel book = (BookModel) entry.getProduct();
            total += book.getRewardPoints() * entry.getQuantity();

        }

        // TODO exercise 6.2 : update customer points
    }

    @Override
    public List<CustomerModel> getAllCustomersForLevel(RewardStatusLevelConfigurationModel level) {
        return null;
    }
}
