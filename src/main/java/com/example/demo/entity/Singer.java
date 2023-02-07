package com.example.demo.entity;
import com.google.cloud.spring.data.spanner.core.mapping.Column;
import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import com.google.cloud.spring.data.spanner.core.mapping.Table;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Table(name = "Singers")
public class Singer {

    @PrimaryKey
    @Column(name = "Id")
    String Id;

    @Column(name = "Name")
    String name;


}