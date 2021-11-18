package com.hello.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class UserT extends User {

    /**
     * userId
     */
    private Long userId;


}
