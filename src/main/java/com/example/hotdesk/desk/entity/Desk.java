package com.example.hotdesk.desk.entity;

import com.example.hotdesk.common.auditing.Auditable;
import com.example.hotdesk.enums.Accessories;
import com.example.hotdesk.room.entity.Room;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Desk extends Auditable
{
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Enumerated( EnumType.STRING )
    private List<Accessories> accessories;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Room room;
}
