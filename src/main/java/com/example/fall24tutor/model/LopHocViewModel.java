package com.example.fall24tutor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LopHocViewModel {

    @Id
    private String className;

    private Integer siSo;

    @Override
    public String toString() {
        return "LopHocViewModel{" +
                "className='" + className + '\'' +
                ", siSo=" + siSo +
                '}';
    }
}
