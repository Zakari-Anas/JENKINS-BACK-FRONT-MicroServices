package com.supp.Absence.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Groupe {
    private Long id;
    private String name;
    private String count;
}
