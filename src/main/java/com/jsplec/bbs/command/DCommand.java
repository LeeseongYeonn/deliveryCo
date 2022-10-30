package com.jsplec.bbs.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface DCommand {

	
	public void execute(HttpServletRequest request, HttpServletResponse response);
}  //비컨맨드  test
