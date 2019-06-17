<%@ tag pageEncoding="utf-8" %>
<%@ attribute name="r" type="java.lang.Float" %>
<%@ variable name-given="mj" variable-class="java.lang.Float" scope="AT_END" %>
<%

    float mj = 3.14f * r*r;

    jspContext.setAttribute("mj",mj);

%>
