package com.mycompany.app.marshaler;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.mycompany.app.ArgsException;
import com.mycompany.app.ArgsException.ErrorCode;

public class IntegerArgumentMarshaler implements ArgumentMarshaler {
    private int integerValue = 0;

    @Override
    public Object get() {
        return integerValue;
    }

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            integerValue = Integer.parseInt(currentArgument.next());
        } catch (NoSuchElementException e) {
            throw new ArgsException(ErrorCode.MISSING_INTEGER);
        } catch (NumberFormatException e) {
            throw new ArgsException(ErrorCode.INVALID_INTEGER);
        }
    }
}