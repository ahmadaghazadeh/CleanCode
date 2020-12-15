package com.mycompany.app.marshaler;

public class BooleanArgumentMarshaler extends ArgumentMarshaler {
    private boolean booleanValue = false;

    @Override
    public void set(String s) {
        booleanValue = true;
    }

    @Override
    public Object get() {
        return booleanValue;
    }
}