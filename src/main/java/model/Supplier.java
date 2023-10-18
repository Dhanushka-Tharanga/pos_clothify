package model;

import com.jfoenix.controls.JFXButton;
import lombok.*;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Supplier {
    private int  supplier_id;
    private String name;
    private String contact;
    private String email;
    private String company;
    private String title;

    public Supplier(int anInt, String string, String string1, String string2, String string3, String string4) {

    }


    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
