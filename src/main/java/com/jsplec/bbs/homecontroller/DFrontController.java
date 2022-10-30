package com.jsplec.bbs.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.command.DCommand;
import com.jsplec.bbs.command.DContentCommand;
import com.jsplec.bbs.command.DDeleteCommand;
import com.jsplec.bbs.command.DListCommand;
import com.jsplec.bbs.command.DModifyCommand;
import com.jsplec.bbs.command.DWriteCommand;

/**
 * Servlet implementation class DFrontController
 */
@WebServlet("*.do")
public class DFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
		actionDo(request, response);
	}
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("actionDo");
		request.setCharacterEncoding("utf-8");
		
		String viewPage = null;
		DCommand command = null;
		
		String uri = request.getRequestURI();
		
		String conPath = request.getContextPath();
		
		String com = uri.substring(conPath.length());
		
		switch(com) {
		
		//전체 내용 검색
		case("/deliveryCo_list.do"):
			command = new DListCommand();
			command.execute(request, response);
			viewPage = "deliveryCo_list.jsp";
			break;
		
		//배송업체 등록 화면 띄우기
		case("/deliveryCo_writeView.do"):
			viewPage = "deliveryCo_writeView.jsp";
			break;
			
		//등록 완료 화면 띄우기
		case("/deliveryCo_registrationView.do"):
			viewPage = "deliveryCo_registrationView.jsp";
			break;
			
		//입력하기
		case("/deliveryCo_write.do"): 
			command = new DWriteCommand();
			command.execute(request, response);
			viewPage="deliveryCo_registrationView.do";
			//viewPage="deliveryCo_list.do";
			break;
			
		//내용보기
		case("/deliveryCo_contentView.do"): 
			command = new DContentCommand();
			command.execute(request, response);
			viewPage="deliveryCo_contentView.jsp";
			break;
			
		//삭제하기
		case("/deliveryCo_delete.do"): 
			command = new DDeleteCommand();
			command.execute(request, response);
			viewPage="deliveryCo_list.do";
			break;
		
		//수정하기
		case("/deliveryCo_modify.do"): 
			command = new DModifyCommand();
			command.execute(request, response);
			viewPage="deliveryCo_list.do";
			break;

		}

		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}	
}
