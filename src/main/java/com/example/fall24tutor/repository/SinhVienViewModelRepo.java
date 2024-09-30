package com.example.fall24tutor.repository;

import com.example.fall24tutor.model.SinhVienViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SinhVienViewModelRepo extends JpaRepository<SinhVienViewModel, Integer> {

    @Query(nativeQuery = true,
            value = "select s.id, s.name, s.address , s.age, s.status, l.class_name \n" +
                    "from sinh_vien s\n" +
                    "inner join lop_hoc l on s.lop_hoc = l.id")
    List<SinhVienViewModel> getListSinhVien();
}
