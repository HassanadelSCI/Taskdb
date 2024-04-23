package com.sci.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Regions", schema = "sys")
@Data
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@NoArgsConstructor
@AllArgsConstructor

public class Regions implements Serializable {
    private static final long serialVersionUID = -915428707036605461L;
    @Id
    @Column(name = "Region_ID")
    private Integer Region_Id;
    @Column(name = "Region_Name")
    private String Region_Name;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Region_ID", insertable = false, updatable = false)
    private List<Countries> countries;
}
