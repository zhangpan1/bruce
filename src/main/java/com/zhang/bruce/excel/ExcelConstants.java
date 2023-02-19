package com.zhang.bruce.excel;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 15:17
 * @Description:
 */
public class ExcelConstants {
    public static final Integer PER_SHEET_ROW_COUNT = 100*10000;
    public static final Integer PER_WRITE_ROW_COUNT = 20*10000;
   // public static final Integer GENERAL_ONCE_SAVE_TO_DB_ROWS_JDBC = 5*10000;
   public static final Integer GENERAL_ONCE_SAVE_TO_DB_ROWS_JDBC = 1000;
    public static final Integer GENERAL_ONCE_SAVE_TO_DB_ROWS_MYBATIS = 5*10000;

}
