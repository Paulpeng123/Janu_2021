package com.pf.hibernate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contacter {
    private Integer contId;
    private String contName;
    private String contGender;
    private String contPhone;
    private Customer customer;

}
