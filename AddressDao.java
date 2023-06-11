package com.web.dao;

import com.web.domain.Address;

public interface AddressDao {

	public void createAddress(Address address);

	public void createPreparedStatementAddress(Address address);

	public void updateAddress(Address address);

	public void deleteAddress(Address address);

	public Address findAddressById(int addressId);
}
