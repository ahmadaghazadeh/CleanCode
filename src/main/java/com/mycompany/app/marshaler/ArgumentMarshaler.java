package com.mycompany.app.marshaler;

import com.mycompany.app.ArgsException;

public abstract class ArgumentMarshaler {

    public abstract void set(String s) throws ArgsException;

    public abstract Object get();
}
