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
//		//?????? ?????? ??? ?????? ??????
//		case("????????????"):
//			command = new DListCommand();
//			command.execute(request, response);
//			viewPage = "";
//			break;
//		
//		//????????????
//		case("/????????????"):
//			command = new DListCommand();
//		command.execute(request, response);
//		viewPage = "";
//		break;
//		
//			
//		//????????????
//		case("/????????????"): 
//			command = new DWriteCommand();
//			command.execute(request, response);
//			viewPage="";
//			break;
//			
//		//???????????? ?????? ??? ??????/??????
//		case("/????????????"): 
//			command = new DContentCommand();
//			command.execute(request, response);
//			viewPage="";
//			break;
//			
//		//???????????? ?????? ??? ??????/??????
//		case("/????????????"): 
//		command = new DDeleteCommand();
//		command.execute(request, response);
//		viewPage="";
//		break;
//		
//		//????????????
//		case("/????????????"): 
//		command = new DModifyCommand();
//		command.execute(request, response);
//		viewPage="";
//		break;
//		
//		//??????
//		case("/??????"): 
//			command = new DModifyCommand();
//		command.execute(request, response);
//		viewPage="";
//		break;
//		
//		//??????
//		case("/??????"): 
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
