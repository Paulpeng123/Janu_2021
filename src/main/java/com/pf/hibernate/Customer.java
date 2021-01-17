package com.pf.hibernate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private Integer custId;
    private String custName;
    private String custLevel;
    private String custSource;
    private String custPhone;
    private String custMobile;

    private Set<Contacter> setContacters = new HashSet<Contacter>();
}
