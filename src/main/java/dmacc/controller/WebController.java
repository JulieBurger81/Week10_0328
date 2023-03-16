/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 16, 2023
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Albums;
import dmacc.repository.AlbumsRepository;

@Controller
public class WebController {
	@Autowired
	AlbumsRepository albumsRepo;
	
	@GetMapping({"/", "/viewAll"})
	public String viewAllAlbums(Model model)	{
		if(albumsRepo.findAll().isEmpty()) {
			System.out.println("need to add new data");
			return addNewAlbums(model);
		}
		model.addAttribute("albums", albumsRepo.findAll());
		return "results";
	}
	
	@GetMapping("/inputAlbum")			//connects to the input action
	public String addNewAlbums(Model model) {
		Albums a = new Albums();
		model.addAttribute("newAlbum", a); //connects to the input pages object name
		return "input";
	}
	
	@PostMapping("/inputAlbum") 
	public String addNewAlbums(@ModelAttribute Albums a, Model model) {
		albumsRepo.save(a);
		return viewAllAlbums(model);
	}
	
	@GetMapping("edit/{albumId}")
	public String showUpdateAlbums(@PathVariable("albumId") long albumId, Model model) {
		Albums a = albumsRepo.findById(albumId).orElse(null);
		model.addAttribute("newAlbum", a);
		return "input";
	}
	
	@PostMapping("/update/{albumId}")
	public String reviseAlbums(Albums a, Model model) {
		albumsRepo.save(a);
		return viewAllAlbums(model);
	}
	
	@GetMapping("/delete/{albumId}")
	public String deleteUser(@PathVariable("albumId") long albumId, Model model) {
		Albums a = albumsRepo.findById(albumId).orElse(null);
		albumsRepo.delete(a);
		return viewAllAlbums(model);
	}
}
