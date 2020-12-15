package com.mycompany.app.marshaler;

import com.mycompany.app.ArgsException;

public class IntegerArgumentMarshaler extends ArgumentMarshaler {
    private int integerValue = 0;

    @Override
    public void set(String s) throws ArgsException {
        try {
            integerValue = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new ArgsException();
        }
    }

    @Override
    public Object get() {
        return integerValue;
    }
}