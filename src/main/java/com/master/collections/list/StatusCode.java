package com.master.collections.list;

import java.util.Iterator;
import java.util.List;

public class StatusCode {

    public static final String ERROR = "ERROR";

    private String code;

    public static final int TYPE_ERROR = 1;

    private  String ExternalDescription;

    public StatusCode() {

    }

    public String getExternalDescription() {
        return ExternalDescription;
    }

    public void setExternalDescription(String externalDescription) {
        ExternalDescription = externalDescription;
    }

    public String getCode(){return code;}

    public static final StatusCode INVALID_PARAMETER =
            new StatusCode(
                    "SMS2001E",
                    ERROR,
                    TYPE_ERROR,
                    "The input parameter{0} invalid.");

    public StatusCode(String code, String error, int typeError, String ExternalDescription) {
        this.ExternalDescription = ExternalDescription;
        this.code = code;

    }

    public static StatusCode getInvalidParameterCode(List parameters) {
        StringBuffer sb = new StringBuffer();
        if (parameters.size() > 1)
            sb.append("s");
        Iterator iter = parameters.iterator();
        while (iter.hasNext()) {
            String parameter = (String)iter.next();
            sb.append(" ");
            sb.append(parameter);
            if (iter.hasNext()) {
                sb.append(",");
            }
        }
        if (parameters.size() == 1)
            sb.append(" is");
        else
            sb.append(" are");

        return getStatusCode(
                INVALID_PARAMETER,
                sb.toString()
        );
    }

    private static StatusCode getStatusCode(StatusCode invalidParameter, String toString) {

        StatusCode statusCode = new StatusCode();
        statusCode.setExternalDescription(toString);

        return statusCode;

    }
}
