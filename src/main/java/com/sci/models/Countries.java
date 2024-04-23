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
@Table(name = "COUNTRIES", schema = "sys")
@Data
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@NoArgsConstructor
@AllArgsConstructor
public class Countries implements Serializable {
    private static final long serialVersionUID = -915428707036605461L;
    @Id
    @Column(name = "COUNTRY_ID")
    private String COUNTRY_ID;
    @Column(name = "COUNTRY_NAME")
    private String COUNTRY_NAME;
    @Column(name = "REGION_ID")
    private Integer REGION_ID;


    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID", insertable = false, updatable = false)
    private List<Location> lacations;
}
