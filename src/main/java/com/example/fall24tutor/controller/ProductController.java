package com.example.fall24tutor.controller;

import com.example.fall24tutor.model.Category;
import com.example.fall24tutor.model.Product;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class ProductController {
    ArrayList<Product> listProduct = new ArrayList<>();

    ArrayList<Category> listCategory = new ArrayList<>();

    public ProductController() {
        listProduct.add(new Product("PR1", "Product 1", 3000, "active", "category 1"));
        listProduct.add(new Product("PR2", "Product 1", 3000, "active", "category 1"));
        listProduct.add(new Product("PR3", "Product 1", 3000, "active", "category 1"));
        listCategory.add(new Category("c1", "Category1"));
        listCategory.add(new Category("c2", "Category2"));
        listCategory.add(new Category("c3", "Category3"));
        listCategory.add(new Category("c4", "Category4"));
    }

    @GetMapping("/product")
    public String hienThi(Model model) {
        model.addAttribute("pro", new Product());
        model.addAttribute("listProduct", listProduct);
        model.addAttribute("listCategory", listCategory);
        return "product";
    }

    @PostMapping("/product/add")
    public String add(Model model,
                      @Valid @ModelAttribute("product") Product product,
                      BindingResult result) {
        if (result.hasErrors()) {
            return "product";
        } else {
            listProduct.add(product);
        }
        return "redirect:/product";
    }

    @GetMapping("/product/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        Product productDetail = new Product();
        for (Product product : listProduct) {
            if (product.getId().equals(id)) {
                productDetail = product;
            }
        }
        listProduct.remove(productDetail);
        return "redirect:/product";
    }

    @GetMapping("/product/detail/{id}")
    public String detail(@PathVariable("id") String id, Model model) {
        Product productDetail = new Product();
        for (Product product : listProduct) {
            if (product.getId().equals(id)) {
                productDetail = product;
            }
        }
        model.addAttribute("product", productDetail);
        model.addAttribute("listCategory", listCategory);
        return "detail";
    }

    @PostMapping("/product/update/{id}")
    public String update(@ModelAttribute("product") Product product,
                         @PathVariable("id") String id) {
        for (Product pro : listProduct) {
            if (pro.getId().equals(id)) {
                pro.setCategory(product.getCategory());
                pro.setPrice(product.getPrice());
                pro.setName(product.getName());
                pro.setStatus(product.getStatus());
            }
        }
        return "redirect:/product";
    }
}
