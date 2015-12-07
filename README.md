# DataBaseGenerator
GreenDao 生成的基类项目！

# 步骤
## 1. 下载本项目 ##
git clone git@github.com:BrightYu/DataBaseGenerator.git
## 2. 配置生成文件路径  ##
### 修改文件：
&nbsp; &nbsp; &nbsp; &nbsp; DataBaseGenerator\src\com\bright\DataBaseGenerator.java  
### 修改方法:
&nbsp; &nbsp; &nbsp; &nbsp; private static final String OUT_PATH = "DataBaseGenerator/src-gen";  
&nbsp; &nbsp; &nbsp; &nbsp; 修改为为自己想要的目录
## 3. 配置要生成的表 ##
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
## 4. 编译工程生成文件 ##




License
=======

    Copyright 2015 Haiyang Yu
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
