/**
 * Create Date:2019年9月9日
 */
package com.yz.zheng;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:张英政
 * <br>Date:2019年9月9日
 */
public class StringUtil {
  public StringUtil() {
  }

  public static boolean isPhone(String phone) {
    String pho = "^(15[0-9]|17[0-9]|18[0-9])+\\d{8}$";
    boolean contains = phone.contains(pho);
    return contains;
  }

  public static boolean isEmail(String email) {
    String ema = "^\\d+@+\\w+(con|com|com.con)$";
    boolean contentEquals = email.contentEquals(ema);
    return contentEquals;
  }
}
