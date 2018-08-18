package co.angeloumali.sampleconsumingapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Base {

    public Base(String base) {
        this.base = base;
    }

    @SerializedName("base")
    @Expose
    private String base;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Base{" +
                "base='" + base + '\'' +
                '}';
    }
}
