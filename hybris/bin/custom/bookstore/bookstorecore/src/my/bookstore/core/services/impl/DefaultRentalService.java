package my.bookstore.core.services.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import my.bookstore.core.model.RentalModel;
import my.bookstore.core.services.RentalService;

import java.util.List;

public class DefaultRentalService implements RentalService {
    @Override
    public List<RentalModel> getActiveRentalsForCustomer(CustomerModel customer) {
        return null;
    }
}
