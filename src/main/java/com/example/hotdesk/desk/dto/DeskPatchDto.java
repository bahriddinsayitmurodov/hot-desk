package com.example.hotdesk.desk.dto;

import com.example.hotdesk.enums.Accessories;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeskPatchDto
{
    private Integer roomId;
    private List<Accessories> accessories;
}
