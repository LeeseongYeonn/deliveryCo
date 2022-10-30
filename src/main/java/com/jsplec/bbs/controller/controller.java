//package com.jsplec.bbs.controller;
//
//import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//import com.jsplec.bbs.command.DCommand;
//import com.jsplec.bbs.command.DContentCommand;
//import com.jsplec.bbs.command.DDeleteCommand;
//import com.jsplec.bbs.command.DListCommand;
//import com.jsplec.bbs.command.DModifyCommand;
//import com.jsplec.bbs.command.DWriteCommand;
//
///**
// * Servlet implementation class DFrontController
// */
//@WebServlet("*.do")
//public class controller extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public controller() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		actionDo(request, response);
//		
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		System.out.println("doPost");
//		actionDo(request, response);
//	}
//	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		System.out.println("actionDo");
//		request.setCharacterEncoding("utf-8");
//		
//		String viewPage = null;
//		DCommand command = null;
//		
//		String uri = request.getRequestURI();
//		
//		String conPath = request.getContextPath();
//		
//		String com = uri.substring(conPath.length());
//		
//		switch(com) {
//		
//		//상품 등록 및 삭제 수정
//		case("상품등록"):
//			command = new DListCommand();
//			command.execute(request, response);
//			viewPage = "";
//			break;
//		
//		//주문확인
//		case("/주문확인"):
//			command = new DListCommand();
//		command.execute(request, response);
//		viewPage = "";
//		break;
//		
//			
//		//배송확인
//		case("/배송확인"): 
//			command = new DWriteCommand();
//			command.execute(request, response);
//			viewPage="";
//			break;
//			
//		//공급업체 등록 및 삭제/수정
//		case("/공급업체"): 
//			command = new DContentCommand();
//			command.execute(request, response);
//			viewPage="";
//			break;
//			
//		//배송업체 등록 및 삭제/수정
//		case("/배송업체"): 
//		command = new DDeleteCommand();
//		command.execute(request, response);
//		viewPage="";
//		break;
//		
//		//재고확인
//		case("/재고확인"): 
//		command = new DModifyCommand();
//		command.execute(request, response);
//		viewPage="";
//		break;
//		
//		//발주
//		case("/발주"): 
//			command = new DModifyCommand();
//		command.execute(request, response);
//		viewPage="";
//		break;
//		
//		//매출
//		case("/매출"): 
//			command = new DModifyCommand();
//		command.execute(request, response);
//		viewPage="";
//		break;
//		}
//
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
//		dispatcher.forward(request, response);
//	}	
//}
