package model.tm;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import lombok.*;


    @NoArgsConstructor
    @Getter
    @Setter
    @ToString
    public class SupplierTm extends RecursiveTreeObject<SupplierTm> {
        private int  supplier_id;
        private String name;
        private String contact;
        private String email;
        private String company;
        private String title;

        private JFXButton btn;

        public SupplierTm(int supplierId, String name, String company, String email, String title, String contact, JFXButton btn) {


        }
    }
