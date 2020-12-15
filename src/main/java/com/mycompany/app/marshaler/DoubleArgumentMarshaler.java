package com.mycompany.app.marshaler;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.mycompany.app.ArgsException;
import com.mycompany.app.ArgsException.ErrorCode;

public class DoubleArgumentMarshaler implements ArgumentMarshaler {
    Double doubleValue = 0.0;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            doubleValue = Double.parseDouble(currentArgument.next());
        } catch (NoSuchElementException e) {
            throw new ArgsException(ErrorCode.MISSING_DOUBLE);
        } catch (NumberFormatException e) {
            throw new ArgsException(ErrorCode.INVALID_DOUBLE);
        }
    }

    @Override
    public Object get() {
        return doubleValue;
    }

}
