package com.casting.common.pojo;

import java.io.Serializable;
import java.util.List;

public class EasyUiDataGridResult implements Serializable {
    private long total;
    private List<?> rows;//泛型通配符 相当于Object

    @Override
    public String toString() {
        return "EasyUiDataGridResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public EasyUiDataGridResult() {
    }

    public EasyUiDataGridResult(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
