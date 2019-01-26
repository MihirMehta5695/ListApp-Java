package com.mihir.listapp.root;

import com.mihir.listapp.response.ListAppResponse;

public class RootService
{

	protected RootService()
	{

	}

	protected ListAppResponse resp = null;

	protected String buildResponse(Object a)
	{
		return "built";
	}
}
