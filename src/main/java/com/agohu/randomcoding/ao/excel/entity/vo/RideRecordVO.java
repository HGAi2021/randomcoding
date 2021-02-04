package com.agohu.randomcoding.ao.excel.entity.vo;

import lombok.Data;

/**
 * @author AiGH
 * @version 1.0
 * @date 2021/1/27 16:40
 * 乘车记录 t_people_dx_master_info
 */
@Data
public class RideRecordVO {

    /**
     * 发送号码
     */
    private String sendNum;

    /**
     * 接受号码
     */
    private String acceptNum;

    /**
     * 出行方式
     */
    private String travelType;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 短信内容
     */
    private String smsContent;

    /**
     * 短信发送时间
     */
    private String dateTime;

}
