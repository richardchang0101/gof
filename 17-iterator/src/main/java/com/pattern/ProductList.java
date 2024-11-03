package com.pattern;

import java.util.List;

public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> products) {
        super(products);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
