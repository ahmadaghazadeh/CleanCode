package com.mycompany.app.marshaler;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.mycompany.app.ArgsException;
import com.mycompany.app.ArgsException.ErrorCode;

public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringValue = "";

    @Override
    public Object get() {
        return stringValue;
    }

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            stringValue = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(ErrorCode.MISSING_STRING);
        }
    }
}