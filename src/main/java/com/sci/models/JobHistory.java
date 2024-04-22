package com.sci.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "job_history", schema = "sys")
@Data
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@NoArgsConstructor
@AllArgsConstructor

public class JobHistory implements Serializable {

    private static final long serialVersionUID = -915428707036605461L;

    @Id
    @Column(name = "employee_id")
    private Integer employeeId;
    @Id
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "start_date")
    private Date endDate;
    @Column(name = "job_id")
    private String jobId;
    @Column(name = "department_id")
    private Integer departmentId;

}
