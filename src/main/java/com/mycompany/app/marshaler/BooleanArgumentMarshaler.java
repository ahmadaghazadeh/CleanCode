package com.mycompany.app.marshaler;

import java.util.Iterator;

import com.mycompany.app.ArgsException;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
    private boolean booleanValue = false;

    @Override
    public Object get() {
        return booleanValue;
    }

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        booleanValue = true;
    }
}