package com.agohu.randomcoding.ao.excel.controller;

import com.agohu.randomcoding.ao.excel.service.ExportExcelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HGAI on 2021/1/28 15:40
 * Export Excel
 * @author jn-171301003
 */

@Slf4j
@RestController
@RequestMapping("/excel")
public class ExportExcelController {
    @Autowired
    ExportExcelService exportExcelService;

    @GetMapping("/exportExcel/{excelName}")
    public String exprotExcel(@PathVariable("excelName") String excelName) {
        boolean b = exportExcelService.exprotExcel(excelName);
        return "111";
    }
}
