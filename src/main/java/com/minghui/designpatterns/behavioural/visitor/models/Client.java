package com.minghui.designpatterns.behavioural.visitor.models;

import com.minghui.designpatterns.behavioural.visitor.Visitor;

import java.util.Objects;

public abstract class Client {

    private final String name;
    private final String address;
    private final String number;

    public Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public abstract void accept(Visitor visitor);

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
               Objects.equals(address, client.address) &&
               Objects.equals(number, client.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, number);
    }
}