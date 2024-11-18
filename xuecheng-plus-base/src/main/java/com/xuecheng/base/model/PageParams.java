package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: parameters for page
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageParams {

    private Long pageNo = 1L;
    private Long pageSize = 10L;

}
