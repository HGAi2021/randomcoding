package com.agohu.randomcoding.ao.excel.service;



import com.agohu.randomcoding.ao.excel.entity.vo.RideRecordVO;
import com.agohu.randomcoding.ao.excel.mapper.ExportExcelMapper;
import com.agohu.randomcoding.ao.excel.model.RideRecordExcelModel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by HGAI on 2021/1/28 18:04
 * @author jn-171301003
 */
@Service
public class ExportExcelService {

    @Autowired
    ExportExcelMapper exportExcelMapper;

    // TODO  extract ↓
    static String EXCELNAME  = "withMultiHead";
    static String XLSX = ".xlsx";
    static String SHEELNAME  = "sheet1";


    // TODO　NO extract

    static String TRAINNUM = "41";

    public boolean exprotExcel(String excelName) {

        boolean b = writeExcel(excelName);

        return b;
    }

    // 生成Excel
    public boolean writeExcel(String excelName) {

            try (OutputStream out = new FileOutputStream(EXCELNAME + XLSX);) {

                ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);

                Sheet sheet1 = new Sheet(1, 0, RideRecordExcelModel.class);

                sheet1.setSheetName(SHEELNAME);

                List<RideRecordExcelModel> data = new ArrayList<>();

                List<RideRecordVO> rideRecordInfo = exportExcelMapper.getRideRecordInfo();

                rideRecordInfo.forEach(v -> {
                    data.add(new RideRecordExcelModel() {{
                        setSendNum(v.getSendNum());
                        setAcceptNum(v.getAcceptNum());
                        if (TRAINNUM.equals(v.getTravelType())) {
                            setTrain(v.getTravelType());
                        } else {
                            setAirplane(v.getTravelType());
                        }
                        setSmsContent(v.getSmsContent());
                        setDateTime(v.getDateTime());
                    }});
                });

                writer.write(data, sheet1);

                writer.finish();

            } catch (IOException e) {

                e.printStackTrace();

                return Boolean.FALSE;
            }

            return Boolean.TRUE;
    }

}


