package com.minghui.designpatterns.behavioural.visitor;

// add new behaviors to a group of objects without changing their classes by moving the operations into visitor objects

// use Visitor when:
// many object types
// frequently add new operations
// object structure is stable

// pros:
// add new operations without modifying classes
// keeps logic separated
// good for complex object structures

// cons:
// hard to add new element types

import com.minghui.designpatterns.behavioural.visitor.models.*;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Client> clients = List.of(
                new Bank("DBS", "bank_address", "1234567890", 10),
                new Resident("John Smith", "Botanic Gardens", "2534798", "A"),
                new Company("bluefox", "One North", "57924350", 1000),
                new Restaurant("rezza", "Kathib", "69747239", true)
        );

        InsuranceMessagingVisitor visitor = new InsuranceMessagingVisitor();
        visitor.sendInsuranceMails(clients);

    }

}