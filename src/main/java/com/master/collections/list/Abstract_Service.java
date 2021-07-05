package com.master.collections.list;

import java.util.List;

public abstract class Abstract_Service {

    public void init(List<Pojos> users) throws SMSException {
        List<String> param = validateParams(users);

        if ((param!= null )&& (param.size() > 0))
        {
           StatusCode statusCode = StatusCode.getInvalidParameterCode(param);
           throw new SMSException(statusCode.getExternalDescription());
        }
    }

    protected abstract List<String> validateParams(List<Pojos> logger);
}
