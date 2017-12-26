package cn.demo.common.common.db;

import cn.demo.common.util.PropertyUtil;
import org.flywaydb.core.Flyway;

public class FlywayMigration {
    /**
     * Flyway 检测数据库变化
     */
    public void migrate() {
        Flyway flyway = new Flyway();
        flyway.setLocations("flywaySQL");
        flyway.setSchemas(PropertyUtil.getProperty("jdbc.schema"));
        flyway.setDataSource(PropertyUtil.getProperty("jdbc.url"), PropertyUtil.getProperty("jdbc.username"), PropertyUtil.getProperty("jdbc.password"));
        flyway.setBaselineOnMigrate(true);
        flyway.setBaselineVersionAsString("0.1");
        flyway.migrate();
    }

}
