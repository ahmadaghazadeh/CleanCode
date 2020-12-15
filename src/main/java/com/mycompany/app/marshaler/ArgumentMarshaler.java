package com.mycompany.app.marshaler;

import java.util.Iterator;

import com.mycompany.app.ArgsException;

public interface ArgumentMarshaler {

    public abstract void set(Iterator<String> currentArgument) throws ArgsException;

    public abstract Object get();
}
