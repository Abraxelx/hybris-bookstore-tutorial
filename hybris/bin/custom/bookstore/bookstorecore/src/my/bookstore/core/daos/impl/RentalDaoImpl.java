package my.bookstore.core.daos.impl;


import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import my.bookstore.core.daos.RentalDao;
import my.bookstore.core.model.BookModel;
import my.bookstore.core.model.RentalModel;

import java.util.List;

public class RentalDaoImpl extends AbstractItemDao implements RentalDao {


    @Override
    public List<RentalModel> getActiveRentalsForCustomer(CustomerModel customer) {
        return null;
    }

    @Override
    public List<BookModel> getMostRentedBooks(int numberOfBooks) {
        return null;
    }
}
