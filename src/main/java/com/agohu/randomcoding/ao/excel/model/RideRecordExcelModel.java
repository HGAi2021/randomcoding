package com.agohu.randomcoding.ao.excel.model;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * @author AiGH
 * @version 1.0
 * @date 2021/1/27 16:40
 * 乘车记录 t_people_dx_master_info
 */
@Data
public class RideRecordExcelModel  extends BaseRowModel{

    /**
     * 发送号码
     */
    @ExcelProperty(value = { "发送号码", "发送号码" }, index = 0)
    private String sendNum;

    /**
     * 接受号码
     */
    @ExcelProperty(value = { "接受号码", "接受号码" }, index = 1)
    private String acceptNum;

    /**
     * 出行方式
     */
    @ExcelProperty(value = { "出行方式", "飞机" }, index = 2)
    private String airplane;

    @ExcelProperty(value = { "出行方式", "火车" }, index = 3)
    private String train;


    /**
     * 短信内容
     */
    @ExcelProperty(value = { "短信内容", "短信内容" }, index = 4)
    private String smsContent;

    /**
     * 短信发送时间
     */
    @ExcelProperty(value = { "短信发送时间", "短信发送时间" }, index = 5)
    private String dateTime;

}
