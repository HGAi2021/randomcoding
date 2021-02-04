package com.agohu.randomcoding.ao.excel.mapper;

import com.agohu.randomcoding.ao.excel.entity.vo.RideRecordVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by HGAI on 2021/1/28 18:05
 * @author jn-171301003
 */
public interface ExportExcelMapper {

    @Select("SELECT tpdm.ncaller sendNum, tpdm.vcaller acceptNum, tpdm.action travelType, tpdm.stat_time dateTime, tpdm.content smsContent FROM t_people_dx_master_info tpdm WHERE tpdm.action in (41,42) AND category = 6 ")
    List<RideRecordVO> getRideRecordInfo();
}
