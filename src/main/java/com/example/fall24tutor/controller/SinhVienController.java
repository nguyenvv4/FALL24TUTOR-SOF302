package com.example.fall24tutor.controller;

import com.example.fall24tutor.model.Product;
import com.example.fall24tutor.model.SinhVien;
import com.example.fall24tutor.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienRepository sinhVienRepository;

    @GetMapping("/sinh-vien")
    public String hienThi(Model model) {
        List<SinhVien> list = sinhVienRepository.findAll();
        model.addAttribute("list", list);
        return "sinh-vien";
    }
}
