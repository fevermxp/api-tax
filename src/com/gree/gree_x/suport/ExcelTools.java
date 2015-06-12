package com.gree.gree_x.suport;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public class ExcelTools {
	private static Logger logger = Logger.getLogger(ExcelTools.class);

    public static int getTargetList(MultipartFile multipartFile)
                throws Exception {
        String fileType = "";
        try {
            String fileName = multipartFile.getOriginalFilename();
            fileType = fileName.substring(fileName.lastIndexOf(".") + 1,
                    fileName.lastIndexOf(".") + 4);
        } catch (Exception e) {
            logger.error(e);
            fileType = "";
        }
        if (!fileType.toLowerCase().equals("xls")) {
            logger.debug("导入的文件格式不正确，应该不是excel文件");
            return 0;
        }
        try {
        	HSSFWorkbook wb = new HSSFWorkbook(multipartFile.getInputStream());
            HSSFSheet sheet = wb.getSheetAt(0);
            for(int i = sheet.getFirstRowNum();i<=sheet.getLastRowNum();i++){
                HSSFRow row = sheet.getRow(i);
                Iterator<Cell> cells = row.cellIterator();
                while(cells.hasNext()){
                    HSSFCell cell = (HSSFCell) cells.next();
                    logger.debug(cell.getStringCellValue());
                }
            }
            return wb.getNumberOfSheets();
        } catch (Exception e) {
        	try{
        		XSSFWorkbook xwb = new XSSFWorkbook(multipartFile.getInputStream());
            	XSSFSheet xsheet = xwb.getSheetAt(0);
            	logger.debug("sheet name = "+xwb.getSheetName(0));
            	for(int i = xsheet.getFirstRowNum();i<=xsheet.getLastRowNum();i++){
                    XSSFRow row = xsheet.getRow(i);
                    Iterator<Cell> xcells = row.cellIterator();
                    while(xcells.hasNext()){
                        XSSFCell xcell = (XSSFCell) xcells.next();
                        logger.debug(xcell.getStringCellValue());
                    }
                }
            	return xwb.getNumberOfSheets();
        	}catch(Exception e1){
        		logger.error(e);
        	}
        }
        return 0;
    }
}
