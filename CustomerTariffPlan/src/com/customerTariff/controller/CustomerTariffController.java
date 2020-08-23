package com.customerTariff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.customerTariff.entity.CustomerTariff;
import com.customerTariff.service.CustomerTariffService;

@Controller
@RequestMapping("/controller")
public class CustomerTariffController {

		@Autowired
		private CustomerTariffService customerTariffService;
		
		@GetMapping("/allcustomers")
		public String listCustomers(Model theModel) {
			List<CustomerTariff> theCustomer = customerTariffService.listCustomers();
			System.out.println("The customer values are: "+theCustomer);
			theModel.addAttribute("customerTariff",theCustomer);
			return "list-customers";
		}
		
		@GetMapping("/showFormForAdd")
		public String showFormForAdd(Model theModel) {
			//binding the form data through the model attribute
			CustomerTariff customerTariff = new CustomerTariff();
			theModel.addAttribute("customerTariff",customerTariff);
			return "customer-form";
		}
		
		@PostMapping("/saveCustomer")
		public String saveCustomer(@ModelAttribute("customerTariff") CustomerTariff customerTariff) {
			customerTariffService.saveCustomer(customerTariff);
			return "redirect:/controller/allcustomers";
		}
		
		@GetMapping("/showFormForUpdate")
		public String showFormForUpdate(@RequestParam("id") int theId,Model theModel) {
			CustomerTariff customerTariff = customerTariffService.getCustomerTariff(theId);
			theModel.addAttribute("customerTariff", customerTariff);
			return "update-form";
		}
		
		@GetMapping("/delete")
		public String delete(@RequestParam("id") int theId) {
			customerTariffService.deleteTariffPlan(theId);
			return "redirect:/controller/allcustomers";
		}
}
