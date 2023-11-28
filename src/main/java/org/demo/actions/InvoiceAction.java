package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");
        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }
        if (invoiceBean.getImporte() == null) {
            addFieldError("invoiceBean.importe", "El importe es obligatorio");
        } else {
            String importeText = invoiceBean.getImporte().toString();
            if (importeText.matches("^[0-9]+(\\.[0-9]+){0,1}$")) {
                double x = Double.parseDouble(importeText);
                if (x < 0) {
                    addFieldError("invoiceBean.importe", "El importe debe ser mayor que 0");
                }
            } else {
                addFieldError("invoiceBean.importe", "El importe tiene que ser un numero decimal valido");
            }
        }
    }
}
