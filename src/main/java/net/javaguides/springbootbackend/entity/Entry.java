package net.javaguides.springbootbackend.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "entries")
public class Entry {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    private String headline;
    private String entry;
    private LocalDate creationDate;



}