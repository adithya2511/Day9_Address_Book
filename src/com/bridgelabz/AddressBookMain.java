package com.bridgelabz;
import java.util.HashMap;
import java.util.Map;

public class AddressBookMain {
    static final String MY_ADDRESS_BOOK = "My AddressBook";
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book ");
        Map<String,AddressBook> addressBookMap = new HashMap<>();
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        System.out.println(addressBook.contactList);
        addressBook.editContact();
        System.out.println(addressBook.contactList);
        addressBook.deleteContact();
        System.out.println(addressBook.contact);
        addressBookMap.put(MY_ADDRESS_BOOK,addressBook);
    }
}