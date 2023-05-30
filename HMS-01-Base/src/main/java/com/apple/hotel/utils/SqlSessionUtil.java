package com.apple.hotel.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @ author Egcoo
 * @ date 2023/4/23 - 14:30
 */
public class SqlSessionUtil {

    // 定义一个静态变量
    private static SqlSessionFactory sqlSessionFactory;

    static {
        // 类加载时候执行
        // 获取SqlSessionUtil 工具类在进行第一次加载的时候，解析mybatis-config.xml文件，创建SqlSessionFactory对象
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //工具类的构造方法一般都是私有化的
    //工具类的方法都是静态的,直接采用类名调用即可，不需要new对象
    // 为了防止new对象，构造方法私有化
    public SqlSessionUtil() {
    }

    public static SqlSession openSqlSession() throws IOException {

        return sqlSessionFactory.openSession();
    }

}
