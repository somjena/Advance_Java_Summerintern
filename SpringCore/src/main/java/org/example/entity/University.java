package org.example.entity;

public class University {
    private String unmae;
    private String ucode;

    public String getUnmae() {
        return unmae;
    }

    public void setUnmae(String unmae) {
        this.unmae = unmae;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    @Override
    public String toString() {
        return "University{" +
                "unmae='" + unmae + '\'' +
                ", ucode='" + ucode + '\'' +
                '}';
    }
}
