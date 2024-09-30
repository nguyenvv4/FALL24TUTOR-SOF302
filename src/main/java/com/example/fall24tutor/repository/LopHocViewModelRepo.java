package com.example.fall24tutor.repository;

import com.example.fall24tutor.model.LopHocViewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LopHocViewModelRepo extends JpaRepository<LopHocViewModel, String> {

    @Query(value = "SELECT l.class_name, count(*) as 'si_so' \n" +
            "from lop_hoc l inner join sinh_vien s on l.id = s.lop_hoc\n" +
            "GROUP BY l.class_name",
    nativeQuery = true)
    List<LopHocViewModel> getList();
}
