package com.bright;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class DataBaseGenerator {

    private static final String OUT_PATH = "DataBaseGenerator/src-gen";

    public static void main(String[] args) throws Exception {
        // Model 所在的路径
        Schema schema = new Schema(1, "com.brightyu.model");
        // 数据库操作文件所在的路径
        schema.setDefaultJavaPackageDao("com.brightyu.database");
        // 建表
        addPerson(schema);
        // 生成文件
        new DaoGenerator().generateAll(schema, OUT_PATH);
    }

    /**
     * @param schema
     */
    private static void addPerson(Schema schema) {
        Entity note = schema.addEntity("Person");
        note.addIdProperty();
        note.addStringProperty("name").notNull();
        note.addIntProperty("age");
        note.addIntProperty("height");
        note.addStringProperty("introduction");
    }
}
