<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@page import="org.demo.actions.beans.InvoiceBean.*"%>
<!DOCTYPE html>
<html>
<head>
  <title><s:text name="hello.message"/></title>
  <s:head/>
  <sx:head/>
</head>

<body>

    <h1>Resumen de factura: </h1>
    <div>
    Asunto  : <s:property value="invoiceBean.asunto"/>
    </div>
    <div>
    Importe Bruto : <s:property value="invoiceBean.importe"/>
    </div>
    <%
    //Integer importeIva = (Integer)application.getAttribute("invoiceBean.importe") *1.21;
    //out.println(importeIva);
    %>
    <div>
    Iva :
    </div>
    <div>
    Total :
    </div>
    <div>
    Fecha desde : <s:property value="invoiceBean.dateFrom"/>
    </div>
    <div>
    Fecha hasta : <s:property value="invoiceBean.dateTo"/>
    </div>
</body>
</html>