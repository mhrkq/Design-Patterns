package com.minghui.designpatterns.behavioural.visitor;

import com.minghui.designpatterns.behavioural.visitor.models.*;

public interface Visitor {

    void visit(Bank bank);

    void visit(Company company);

    void visit(Resident resident);

    void visit(Restaurant restaurant);

}
