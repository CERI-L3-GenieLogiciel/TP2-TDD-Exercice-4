package exo4;

import java.util.Collection;

public interface IContactDAO {

	/**
	 * Returns a collection of all of the contacts in the repository.
	 *
	 * @return all of the contacts in the repository
	 */
	Collection<Contact> findAll();

	/**
	 * Returns the contact from the repository matching the specified ID.
	 *
	 * @param id
	 *            the ID to look for
	 * @return the matching contact
	 * @throws ContactNotFoundException
	 *             if no contact is found with the specified ID
	 */
	Contact getById(int id) throws ContactNotFoundException;

	/**
	 * Persists the specified contact in the repository.
	 *
	 * @param contact
	 *            the contact to persist
	 * @throws DuplicatedContactException
	 *             if a duplicate contact is found
	 */
	void createContact(Contact contact) throws DuplicatedContactException;

	/**
	 * Returns the next sequence number from the repository.
	 *
	 * @return the next sequence number from the repository
	 */
	int nextID();
}
