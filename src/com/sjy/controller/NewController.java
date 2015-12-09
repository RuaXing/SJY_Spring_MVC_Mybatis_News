package com.sjy.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sjy.model.New;
import com.sjy.service.INewService;

@Controller
@RequestMapping("/news")
public class NewController {
	@Autowired
	private INewService service;

	/*
	 * @RequestMapping("/show/{id}.htm") public ModelAndView
	 * findById(HttpServletRequest request,HttpServletResponse
	 * response,@PathVariable int id) { ModelAndView mv = new
	 * ModelAndView("index"); New news = service.selectByPrimaryKey(id);
	 * System.out.println(news.toString()); mv.addObject("news", news); return
	 * mv; }
	 */

	@RequestMapping(value = "/index")
	// 映射URL /category/index.htm
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) {

		ModelAndView mv = new ModelAndView("/list");// 参数是视图名称 /views/list.jsp
		List newslist = service.findAll();
		mv.addObject("newslist", newslist);

		return mv;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	// 映射URL /category/add.htm
	public ModelAndView add(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("redirect:index.htm");// 设置添加成功后的视图跳转至index.htm
																	// !!!!!
		// 获取客户端提交的参数
		String title = request.getParameter("title") == null ? "" : request
				.getParameter("title");
		String content = request.getParameter("content") == null ? "" : request
				.getParameter("content");
		int typeid = request.getParameter("typeid") == null ? 0 : Integer
				.parseInt(request.getParameter("typeid"));
		// 组装数据模型
		New new1 = new New();
		new1.setNewstitle(title);
		new1.setNewscontent(content);
		new1.setNewsdate(new Date());
		new1.setTypeid(typeid);
		// 添加至数据库
		service.insert(new1);// 添加后，视图怎么处理？视图应该跳转至分类列表页面
		return mv;
	}

	@RequestMapping(value = "/edit/{id}.htm", method = RequestMethod.GET)
	// 映射URL /category/edit.htm
	// 用来获取原数据，展示到更新页面
	public ModelAndView edit(HttpServletRequest request,
			HttpServletResponse response, @PathVariable int id) {
		ModelAndView mv = new ModelAndView("/editnews");

		New new1 = service.selectByPrimaryKey(id);
		mv.addObject("new1", new1);

		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	// 映射URL /category/update.htm
	// 更新提交
	public ModelAndView update(HttpServletRequest request,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("redirect:index.htm");// 设置添加成功后的视图跳转至index.htm
		// !!!!!
		// 获取客户端提交的参数
		int id = request.getParameter("id") == null ? 0 : Integer
				.parseInt(request.getParameter("id"));
		String title = request.getParameter("title") == null ? "" : request
				.getParameter("title");
		String content = request.getParameter("content") == null ? "" : request.getParameter("content");
		int typeid = request.getParameter("typeid") == null ? 0 : Integer
				.parseInt(request.getParameter("typeid"));
		// 组装数据模型
		New new1 = service.selectByPrimaryKey(id);
		new1.setNewstitle(title);
		new1.setNewscontent(content);
		new1.setNewsdate(new Date());
		new1.setTypeid(typeid);
		// 添加至数据库
		service.insertSelective(new1);// 添加后，视图怎么处理？视图应该跳转至分类列表页面
		return mv;
	}

	@RequestMapping(value = "/delete/{id}.htm", method = RequestMethod.GET)
	// 映射URL /category/delete/1.htm ---》 /category/index.htm
	public ModelAndView delete(HttpServletRequest request,
			HttpServletResponse response, @PathVariable int id) {
		// 2个错误：1-缺少事务；2-路径
		ModelAndView mv = new ModelAndView("redirect:../index.htm");

		if (id > 0) {
			service.deleteByPrimaryKey(id);
		} else {
			System.out.println("参数不对");
		}

		return mv;
	}
}
