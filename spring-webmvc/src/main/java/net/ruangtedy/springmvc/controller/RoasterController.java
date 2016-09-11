package net.ruangtedy.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.ruangtedy.springmvc.model.Member;

@Controller
public final class RoasterController {
	private List<Member> members = new ArrayList<Member>();
	
	public RoasterController() {
		members.add(new Member("John", "Lennon"));
		members.add(new Member("Paul", "McCartney"));
		members.add(new Member("George", "Harrison"));
		members.add(new Member("Ringo", "Starr"));
	}
	
	@RequestMapping
	public void list(Model model) {
		model.addAttribute(members);
	}
	
	@RequestMapping
	public void member(@RequestParam("id") Integer id, Model model) {
		model.addAttribute(members.get(id));
	}
}
