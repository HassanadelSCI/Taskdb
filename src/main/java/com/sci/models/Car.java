package com.sci.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "car", schema = "sys")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @Column(name = "car_id")
    private Integer id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "person_id")
    private Integer person_id;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "person_id", insertable = false, updatable = false)
//    private Person person;
}
