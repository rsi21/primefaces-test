package org.primefaces.test;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.ListDataModel;

public class TestModel<E>
    extends
    ListDataModel<E>
    implements
    Serializable
{
    public TestModel(List<E> datasource)
    {
        super(datasource);
    }
}
