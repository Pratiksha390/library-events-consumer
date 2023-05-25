package com.learnkafka.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class LibraryEvent{

    @Id
    @GeneratedValue
    private Integer libraryEventId;
    @Enumerated(EnumType.STRING)
    private LibraryEventType libraryEventType;
    @OneToOne(mappedBy = "libraryEventId",cascade = {CascadeType.ALL})
    @ToString.Exclude
    private Book book;
}