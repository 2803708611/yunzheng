/**
 * Create Date:2019年9月9日
 */
package com.yz.util;

import org.junit.Test;

import com.yz.zheng.StringUtil;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:张英政
 * <br>Date:2019年9月9日
 */
public class StringTest {
  @Test
  public void text01() {
    boolean phone = StringUtil.isPhone("18625197755");
    System.out.println(phone);
  }

  @Test
  public void test02() {
    boolean email = StringUtil.isEmail(" ");
    System.out.println(email);
  }
}
