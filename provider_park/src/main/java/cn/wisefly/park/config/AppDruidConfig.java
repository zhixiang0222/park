package cn.wisefly.park.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppDruidConfig {

  @ConfigurationProperties(prefix = "spring.datasource")
  @Bean
  public DataSource dataSource() throws SQLException {
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setFilters("stat");
    return dataSource;
  }

  @Bean
  public ServletRegistrationBean statViewServlet() {
    ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
    Map<String, String> initParams = new HashMap<>();
    initParams.put("loginUsername", "admin");
    initParams.put("loginPassword", "123456");
    initParams.put("allow", "");
    bean.setInitParameters(initParams);
    return bean;
  }

  @Bean
  public FilterRegistrationBean webStatFilter() {
    FilterRegistrationBean bean = new FilterRegistrationBean();
    bean.setFilter(new WebStatFilter());
    Map<String, String> initParams = new HashMap<>();
    initParams.put("exclusions", "*.js,*.css,/druid/*");
    bean.setInitParameters(initParams);
    bean.setUrlPatterns(Arrays.asList("/*"));
    return bean;
  }

}
