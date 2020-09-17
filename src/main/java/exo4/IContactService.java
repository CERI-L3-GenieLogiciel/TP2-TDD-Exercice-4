package exo4;

import java.util.Collection;

public interface IContactService {

	/**
	 * Returns all contacts with a first or last name that contains the search
	 * string.
	 *
	 * @param searchString
	 *            the string to search for in the first or last name
	 * @return all contacts matching the search expression
	 */
	Collection<Contact> searchBy(String searchString);

	/**
	 * Returns all of the available contacts.
	 *
	 * @return all of the available contacts
	 */
	Collection<Contact> listAllContacts();

	/**
	 * Returns the contact with the specified contact ID, or null if no matching
	 * contact is found.
	 *
	 * @param contactId
	 *            the contact ID
	 * @return the contact with the specified contact ID
	 */
	Contact getById(int contactId);

	/**
	 * Creates a contact with the specified first and last names.
	 *
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 * @return the newly-created contact
	 * @throws DuplicatedContactException
	 *             if a contact with the same first and last name is found
	 */
	Contact createContact(String firstName, String lastName) throws DuplicatedContactException;

}
