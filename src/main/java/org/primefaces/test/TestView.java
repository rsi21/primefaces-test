package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.component.datatable.DataTable;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {
    
    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;

    private TestModel<TestObject> list;
    private DataTable table;
    
    @PostConstruct  
    public void init() {
        ArrayList<TestObject> values = new ArrayList<>(Arrays.asList(
                new TestObject("Thriller", "Michael Jackson", 1982),
                new TestObject("Back in Black", "AC/DC", 1980),
                new TestObject("The Bodyguard", "Whitney Houston", 1992),
                new TestObject("The Dark Side of the Moon", "Pink Floyd", 1973)
        ));
        list = new TestModel<>(values);
        string = "";
    }


    public DataTable getTable()
    {
        return table;
    }

    public void setTable(DataTable table)
    {
        this.table = table;
    }

    public void showValueType()
    {
        string = table.getValue().getClass().toString();
    }
}
