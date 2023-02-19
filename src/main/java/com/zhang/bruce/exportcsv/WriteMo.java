package com.zhang.bruce.exportcsv;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 20:19
 * @Description:
 */

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class WriteMo{

    @ExcelProperty("ID")
    private String rId;

    @ExcelProperty("名称")
    private String name; //名称

    @ExcelProperty("创建者")
    private String creator; //创建者


}
