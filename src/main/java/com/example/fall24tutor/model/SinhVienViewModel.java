package com.example.fall24tutor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SinhVienViewModel {

    @Id
    private Integer id;

    private String name;

    private String address;

    private Integer age;

    private String status;

    @Column(name = "class_name")
    private String className;
}
