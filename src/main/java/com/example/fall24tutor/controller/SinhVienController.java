package com.example.fall24tutor.controller;

import com.example.fall24tutor.model.*;
import com.example.fall24tutor.repository.LopHocRepo;
import com.example.fall24tutor.repository.LopHocViewModelRepo;
import com.example.fall24tutor.repository.SinhVienRepository;
import com.example.fall24tutor.repository.SinhVienViewModelRepo;
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

    @Autowired
    SinhVienViewModelRepo sinhVienViewModelRepo;

    @Autowired
    LopHocViewModelRepo lopHocViewModelRepo;

    @Autowired
    LopHocRepo lopHocRepo;


    @GetMapping("/sinh-vien")
    public String hienThi(Model model) {
//        List<SinhVien> list = sinhVienRepository.findAll();
//        List<SinhVienViewModel> list = sinhVienViewModelRepo.getListSinhVien();
//        model.addAttribute("list", list);
        List<LopHocView> list = lopHocRepo.getList();
        for (LopHocView lopHocViewModel : list) {
            System.out.println(lopHocViewModel.getClassName() + "---" + lopHocViewModel.getSiSo());
        }
        List<LopHocViewModel> lopHocViewModels = lopHocViewModelRepo.getList();
        for (LopHocViewModel lopHocViewModel : lopHocViewModels) {
            System.out.println(lopHocViewModel.toString());
        }
        return "sinh-vien";
    }
}
