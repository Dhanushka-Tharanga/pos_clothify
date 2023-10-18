package model.tm;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import lombok.*;

    @AllArgsConstructor
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




}
