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

    /**
     * 全局的、服务器级别的，一个服务器定义一个即可
     */
    private static final ThreadLocal<SqlSession> LOCAL = new ThreadLocal<>();
    /**
     * 定义一个静态变量
     */
    private static SqlSessionFactory sqlSessionFactory;

    /*
      类加载时候执行
      获取SqlSessionUtil 工具类在进行第一次加载的时候，解析mybatis-config.xml文件，创建SqlSessionFactory对象
     */
    static {
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 工具类的构造方法一般都是私有化的
     * 工具类的方法都是静态的,直接采用类名调用即可，不需要new对象
     * 为了防止new对象，构造方法私有化
     */
    public SqlSessionUtil() {
    }

    /**
     * 保证在同一个线程中是同一个线程对象
     *
     * @return sqlSession
     */
    public static SqlSession openSqlSession() throws IOException {
        SqlSession sqlSession = LOCAL.get();
        if (sqlSession == null) {
            sqlSession = sqlSessionFactory.openSession();
            LOCAL.set(sqlSession);
        }
        return sqlSession;
    }


    /**
     * 关闭SqlSession，从当前线程移除SqlSession
     * 移除sqlSession 对象和当前线程的绑定关系
     *
     * @param sqlSession
     */
    public static void closeSqlSession(SqlSession sqlSession) {
        if (sqlSession != null) {
            sqlSession.close();
            LOCAL.remove();
        }
    }

}
