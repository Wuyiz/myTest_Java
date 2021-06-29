package com.wuyiz;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class MainTest {
    @Test
    void bigDecimalTest() {
        List<Complete> completes = completesFactory();
        List<Double> rates = new ArrayList<>();
        for (Complete complete : completes) {
            Double realComplete = complete.getRealComplete();
            Double planComplete = complete.getPlanComplete();
            double rate = realComplete / planComplete * 100;
            try {
                rates.add(new BigDecimal(rate).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < rates.size(); i++) {
            System.out.println(completes.get(i) + " ------> " + rates.get(i));
        }
    }

    List<Complete> completesFactory() {
        return JSONArray.parseArray(JSON_TEXT).toJavaList(Complete.class);
    }

    private static final String JSON_TEXT = "[\n" +
            "    {\n" +
            "        \"id\": \"1399970040111300097\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"924\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-06-16 00:00:00\",\n" +
            "        \"duration\": 1,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-16 00:00:00\",\n" +
            "        \"name\": \"乳化沥青透层（1L/㎡）+ES-2稀浆封层\",\n" +
            "        \"parentTaskUid\": \"920\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-06-16 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 16850,\n" +
            "        \"assignComplete\": 25267,\n" +
            "        \"realComplete\": 16850,\n" +
            "        \"quantityUnit\": \"㎡\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2491\",\n" +
            "        \"completeRate\": 100,\n" +
            "        \"taskStart\": \"2021-06-16 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-16 23:59:59\",\n" +
            "        \"remaining\": 0,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040111302097\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"925\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-06-16 00:00:00\",\n" +
            "        \"duration\": 10,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-16 00:00:00\",\n" +
            "        \"name\": \"路平石与路缘石\",\n" +
            "        \"parentTaskUid\": \"920\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-06-16 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 2117,\n" +
            "        \"assignComplete\": 952.5,\n" +
            "        \"realComplete\": 2117,\n" +
            "        \"quantityUnit\": \"m\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2491\",\n" +
            "        \"completeRate\": 100,\n" +
            "        \"taskStart\": \"2021-06-16 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-25 23:59:59\",\n" +
            "        \"remaining\": 0,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040119300097\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"845\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2020-09-06 00:00:00\",\n" +
            "        \"duration\": 247,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-05-29 23:59:59\",\n" +
            "        \"name\": \"沉井\",\n" +
            "        \"parentTaskUid\": \"817\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-05-28 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 129.19,\n" +
            "        \"assignComplete\": 1.74,\n" +
            "        \"realComplete\": 129.19,\n" +
            "        \"quantityUnit\": \"m\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2476\",\n" +
            "        \"secondLevelUid\": \"2477\",\n" +
            "        \"completeRate\": 100,\n" +
            "        \"taskStart\": \"2020-09-06 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-05-29 23:59:59\",\n" +
            "        \"remaining\": -15.94,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040131300097\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"926\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-06-19 00:00:00\",\n" +
            "        \"duration\": 4,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-22 23:59:59\",\n" +
            "        \"name\": \"8cm AC-25C型粗粒式沥青砼\",\n" +
            "        \"parentTaskUid\": \"920\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-06-19 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 16850,\n" +
            "        \"assignComplete\": 24483,\n" +
            "        \"realComplete\": 16850,\n" +
            "        \"quantityUnit\": \"㎡\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2491\",\n" +
            "        \"completeRate\": 100,\n" +
            "        \"taskStart\": \"2021-06-19 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-22 23:59:59\",\n" +
            "        \"remaining\": 0,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040157048834\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"2485\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-01-09 00:00:00\",\n" +
            "        \"duration\": 123,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-05-30 23:59:59\",\n" +
            "        \"name\": \"顶管顶进\",\n" +
            "        \"parentTaskUid\": \"2477\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-05-28 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 1180,\n" +
            "        \"assignComplete\": 26.85,\n" +
            "        \"realComplete\": 1207,\n" +
            "        \"quantityUnit\": \"m\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2476\",\n" +
            "        \"secondLevelUid\": \"2477\",\n" +
            "        \"completeRate\": 102.29,\n" +
            "        \"taskStart\": \"2021-01-09 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-05-30 23:59:59\",\n" +
            "        \"remaining\": -654.44,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040186408961\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"921\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-05-25 00:00:00\",\n" +
            "        \"duration\": 10,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-03 23:59:59\",\n" +
            "        \"name\": \"20cm 12%石灰土\",\n" +
            "        \"parentTaskUid\": \"920\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-05-28 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 3565,\n" +
            "        \"assignComplete\": 3743.11,\n" +
            "        \"realComplete\": 5347.28,\n" +
            "        \"quantityUnit\": \"m³\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2491\",\n" +
            "        \"completeRate\": 149.99,\n" +
            "        \"taskStart\": \"2021-05-25 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-03 23:59:59\",\n" +
            "        \"remaining\": 0.02,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040194797569\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"930\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-05-25 00:00:00\",\n" +
            "        \"duration\": 5,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-05-29 23:59:59\",\n" +
            "        \"name\": \"10cm 级配碎石垫层\",\n" +
            "        \"parentTaskUid\": \"929\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-05-28 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 1440,\n" +
            "        \"assignComplete\": 3702,\n" +
            "        \"realComplete\": 6170,\n" +
            "        \"quantityUnit\": \"㎡\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2490\",\n" +
            "        \"completeRate\": 428.47,\n" +
            "        \"taskStart\": \"2021-05-25 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-05-29 23:59:59\",\n" +
            "        \"remaining\": 5450,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040236740609\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"931\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-05-30 00:00:00\",\n" +
            "        \"duration\": 10,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-03 23:59:59\",\n" +
            "        \"name\": \"路缘石\",\n" +
            "        \"parentTaskUid\": \"929\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-05-30 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 1050,\n" +
            "        \"assignComplete\": 1587.5,\n" +
            "        \"realComplete\": 2117,\n" +
            "        \"quantityUnit\": \"m\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2490\",\n" +
            "        \"completeRate\": 201.62,\n" +
            "        \"taskStart\": \"2021-05-30 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-08 23:59:59\",\n" +
            "        \"remaining\": 1058,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040274489346\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"932\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-05-31 00:00:00\",\n" +
            "        \"duration\": 15,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-03 23:59:59\",\n" +
            "        \"name\": \"15cm C20透水混凝土\",\n" +
            "        \"parentTaskUid\": \"929\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-05-31 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 1280,\n" +
            "        \"assignComplete\": 2197.6,\n" +
            "        \"realComplete\": 5494,\n" +
            "        \"quantityUnit\": \"㎡\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2490\",\n" +
            "        \"completeRate\": 429.22,\n" +
            "        \"taskStart\": \"2021-05-31 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-14 23:59:59\",\n" +
            "        \"remaining\": 3296.4,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040312238081\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"15503940266\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"933\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-06-03 00:00:00\",\n" +
            "        \"duration\": 15,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-03 23:59:59\",\n" +
            "        \"name\": \"3cm M10透水砂浆\",\n" +
            "        \"parentTaskUid\": \"929\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-06-03 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 1280,\n" +
            "        \"assignComplete\": 549.4,\n" +
            "        \"realComplete\": 5494,\n" +
            "        \"quantityUnit\": \"㎡\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2490\",\n" +
            "        \"completeRate\": 429.22,\n" +
            "        \"taskStart\": \"2021-06-03 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-17 23:59:59\",\n" +
            "        \"remaining\": 1648.2,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399970040341598210\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"935\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-05-01 00:00:00\",\n" +
            "        \"duration\": 75,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-03 23:59:59\",\n" +
            "        \"name\": \"照明工程\",\n" +
            "        \"parentTaskUid\": \"2486\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-05-28 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 0,\n" +
            "        \"assignComplete\": 112,\n" +
            "        \"realComplete\": 300,\n" +
            "        \"quantityUnit\": \"m\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2489\",\n" +
            "        \"secondLevelUid\": \"\",\n" +
            "        \"completeRate\": 0,\n" +
            "        \"taskStart\": \"2021-05-01 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-07-14 23:59:59\",\n" +
            "        \"remaining\": 448,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876163731458\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"813\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2020-11-19 00:00:00\",\n" +
            "        \"duration\": 131,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-04-17 23:59:59\",\n" +
            "        \"name\": \"土方回填\",\n" +
            "        \"parentTaskUid\": \"808\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-01-01 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"路基工程\",\n" +
            "        \"planComplete\": 40826,\n" +
            "        \"assignComplete\": null,\n" +
            "        \"realComplete\": 40826,\n" +
            "        \"quantityUnit\": \"m³\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2476\",\n" +
            "        \"secondLevelUid\": \"808\",\n" +
            "        \"completeRate\": 100,\n" +
            "        \"taskStart\": \"2020-11-19 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-04-17 23:59:59\",\n" +
            "        \"remaining\": null,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876197285889\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"888\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2020-11-19 00:00:00\",\n" +
            "        \"duration\": 77,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-02-22 23:59:59\",\n" +
            "        \"name\": \"污水管施工\",\n" +
            "        \"parentTaskUid\": \"887\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-01-01 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"管线工程\",\n" +
            "        \"planComplete\": 670,\n" +
            "        \"assignComplete\": null,\n" +
            "        \"realComplete\": 670,\n" +
            "        \"quantityUnit\": \"延米\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"887\",\n" +
            "        \"completeRate\": 100,\n" +
            "        \"taskStart\": \"2020-11-19 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-02-22 23:59:59\",\n" +
            "        \"remaining\": null,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876230840321\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"894\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2020-11-13 00:00:00\",\n" +
            "        \"duration\": 83,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-02-22 23:59:59\",\n" +
            "        \"name\": \"雨水管施工\",\n" +
            "        \"parentTaskUid\": \"887\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-01-01 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"管线工程\",\n" +
            "        \"planComplete\": 1896,\n" +
            "        \"assignComplete\": null,\n" +
            "        \"realComplete\": 1896,\n" +
            "        \"quantityUnit\": \"延米\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"887\",\n" +
            "        \"completeRate\": 100,\n" +
            "        \"taskStart\": \"2020-11-13 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-02-22 23:59:59\",\n" +
            "        \"remaining\": null,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876256006145\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"900\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-03-14 00:00:00\",\n" +
            "        \"duration\": 48,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-04-30 23:59:59\",\n" +
            "        \"name\": \"给水管施工\",\n" +
            "        \"parentTaskUid\": \"887\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-03-14 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"管线工程\",\n" +
            "        \"planComplete\": 100,\n" +
            "        \"assignComplete\": null,\n" +
            "        \"realComplete\": 100,\n" +
            "        \"quantityUnit\": \"%\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"887\",\n" +
            "        \"completeRate\": 90,\n" +
            "        \"taskStart\": \"2021-03-14 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-04-30 23:59:59\",\n" +
            "        \"remaining\": null,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876276977666\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"905\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-03-14 00:00:00\",\n" +
            "        \"duration\": 48,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-04-30 23:59:59\",\n" +
            "        \"name\": \"电力管线\",\n" +
            "        \"parentTaskUid\": \"887\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-03-14 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"管线工程\",\n" +
            "        \"planComplete\": 100,\n" +
            "        \"assignComplete\": null,\n" +
            "        \"realComplete\": 100,\n" +
            "        \"quantityUnit\": \"%\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"887\",\n" +
            "        \"completeRate\": 90,\n" +
            "        \"taskStart\": \"2021-03-14 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-04-30 23:59:59\",\n" +
            "        \"remaining\": null,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876306337794\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"910\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-03-13 00:00:00\",\n" +
            "        \"duration\": 48,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-04-29 23:59:59\",\n" +
            "        \"name\": \"通信管线\",\n" +
            "        \"parentTaskUid\": \"887\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-03-13 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"管线工程\",\n" +
            "        \"planComplete\": 100,\n" +
            "        \"assignComplete\": null,\n" +
            "        \"realComplete\": 100,\n" +
            "        \"quantityUnit\": \"%\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"887\",\n" +
            "        \"completeRate\": 90,\n" +
            "        \"taskStart\": \"2021-03-13 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-04-29 23:59:59\",\n" +
            "        \"remaining\": null,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876327309314\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"915\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-03-14 00:00:00\",\n" +
            "        \"duration\": 48,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-04-30 23:59:59\",\n" +
            "        \"name\": \"燃气及热力管道施工\",\n" +
            "        \"parentTaskUid\": \"887\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-03-14 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"管线工程\",\n" +
            "        \"planComplete\": 100,\n" +
            "        \"assignComplete\": null,\n" +
            "        \"realComplete\": 100,\n" +
            "        \"quantityUnit\": \"%\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"887\",\n" +
            "        \"completeRate\": 90,\n" +
            "        \"taskStart\": \"2021-03-14 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-04-30 23:59:59\",\n" +
            "        \"remaining\": null,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876348180834\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"922\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-06-04 00:00:00\",\n" +
            "        \"duration\": 6,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-09 23:59:59\",\n" +
            "        \"name\": \"16cm 4.5%水泥稳定碎石\",\n" +
            "        \"parentTaskUid\": \"920\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-06-04 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 16850,\n" +
            "        \"assignComplete\": 25267.02,\n" +
            "        \"realComplete\": 16850,\n" +
            "        \"quantityUnit\": \"㎡\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2491\",\n" +
            "        \"completeRate\": 0,\n" +
            "        \"taskStart\": \"2021-06-04 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-09 23:59:59\",\n" +
            "        \"remaining\": 25267.02,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876383446658\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:04:02\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"923\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-06-10 00:00:00\",\n" +
            "        \"duration\": 6,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-10 23:59:59\",\n" +
            "        \"name\": \"16cm 4.5%水泥稳定碎石\",\n" +
            "        \"parentTaskUid\": \"920\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-06-10 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 16850,\n" +
            "        \"assignComplete\": 4211.17,\n" +
            "        \"realComplete\": 16850,\n" +
            "        \"quantityUnit\": \"㎡\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2491\",\n" +
            "        \"completeRate\": 100,\n" +
            "        \"taskStart\": \"2021-06-10 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-15 23:59:59\",\n" +
            "        \"remaining\": 4211.17,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876411858689\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"939\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-06-26 00:00:00\",\n" +
            "        \"duration\": 25,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-10 23:59:59\",\n" +
            "        \"name\": \"景观绿化工程\",\n" +
            "        \"parentTaskUid\": \"2486\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-06-04 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 60,\n" +
            "        \"assignComplete\": null,\n" +
            "        \"realComplete\": 60,\n" +
            "        \"quantityUnit\": \"%\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2489\",\n" +
            "        \"secondLevelUid\": \"\",\n" +
            "        \"completeRate\": 0,\n" +
            "        \"taskStart\": \"2021-06-26 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-07-20 23:59:59\",\n" +
            "        \"remaining\": 0,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876481692866\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"934\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-06-06 00:00:00\",\n" +
            "        \"duration\": 15,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-10 23:59:59\",\n" +
            "        \"name\": \"6cm 硅砂透水人行道板\",\n" +
            "        \"parentTaskUid\": \"929\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-06-06 00:00:00\",\n" +
            "        \"type\": 0,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 3000,\n" +
            "        \"assignComplete\": 0,\n" +
            "        \"realComplete\": 3000,\n" +
            "        \"quantityUnit\": \"㎡\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2486\",\n" +
            "        \"secondLevelUid\": \"2490\",\n" +
            "        \"completeRate\": 0,\n" +
            "        \"taskStart\": \"2021-06-06 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-06-20 23:59:59\",\n" +
            "        \"remaining\": 0,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    },\n" +
            "    {\n" +
            "        \"id\": \"1399976876511758689\",\n" +
            "        \"createBy\": \"15503940266\",\n" +
            "        \"createDate\": \"2021-06-02 14:31:12\",\n" +
            "        \"updateBy\": \"feng_h\",\n" +
            "        \"updateDate\": \"2021-06-02 17:05:32\",\n" +
            "        \"deleteFlag\": 0,\n" +
            "        \"fkId\": \"1399976875391979522\",\n" +
            "        \"prjId\": \"1304030101372932098\",\n" +
            "        \"uid\": \"935\",\n" +
            "        \"prjName\": null,\n" +
            "        \"userName\": null,\n" +
            "        \"userFullname\": null,\n" +
            "        \"userTelephoneNum\": null,\n" +
            "        \"prjDepCode\": null,\n" +
            "        \"prjDepName\": null,\n" +
            "        \"prjDepPathName\": null,\n" +
            "        \"prjDepPathCode\": null,\n" +
            "        \"warning\": null,\n" +
            "        \"pattern\": null,\n" +
            "        \"preTask\": null,\n" +
            "        \"isActive\": null,\n" +
            "        \"actualDuration\": \"0\",\n" +
            "        \"actualFinish\": null,\n" +
            "        \"actualStart\": null,\n" +
            "        \"constraintType\": 4,\n" +
            "        \"constraintDate\": \"2021-05-01 00:00:00\",\n" +
            "        \"duration\": 75,\n" +
            "        \"durationFormat\": null,\n" +
            "        \"finish\": \"2021-06-10 23:59:59\",\n" +
            "        \"name\": \"照明工程\",\n" +
            "        \"parentTaskUid\": \"2486\",\n" +
            "        \"percentComplete\": 0,\n" +
            "        \"predecessorLink\": null,\n" +
            "        \"start\": \"2021-06-04 00:00:00\",\n" +
            "        \"type\": 1,\n" +
            "        \"quantityYear\": \"2021\",\n" +
            "        \"firstLevel\": \"/\",\n" +
            "        \"secondLevel\": \"/\",\n" +
            "        \"planComplete\": 250,\n" +
            "        \"assignComplete\": 250,\n" +
            "        \"realComplete\": 250,\n" +
            "        \"quantityUnit\": \"m\",\n" +
            "        \"week\": \"2021-05-28-2021-06-03\",\n" +
            "        \"month\": null,\n" +
            "        \"year\": null,\n" +
            "        \"firstLevelUid\": \"2489\",\n" +
            "        \"secondLevelUid\": \"\",\n" +
            "        \"completeRate\": 0,\n" +
            "        \"taskStart\": \"2021-05-01 00:00:00\",\n" +
            "        \"taskFinish\": \"2021-07-14 23:59:59\",\n" +
            "        \"remaining\": 0,\n" +
            "        \"description\": null,\n" +
            "        \"isFillUp\": true\n" +
            "    }\n" +
            "]";

    @Data
    static class Complete {
        private Long id;
        private String createBy;
        private Timestamp createDate;
        private String updateBy;
        private Timestamp updateDate;
        private Integer deleteFlag;
        private String fkId;
        private String prjId;
        private String uid;
        private String prjName;
        private String userName;
        private String userFullname;
        private String userTelephoneNum;
        private String prjDepCode;
        private String prjDepName;
        private String prjDepPathName;
        private String prjDepPathCode;
        private String warning;
        private String pattern;
        private String preTask;
        private Boolean isActive;
        private String actualDuration;
        private Date actualFinish;
        private Date actualStart;
        private Integer constraintType;
        private Date constraintDate;
        private Integer duration;
        private Integer durationFormat;
        private Date finish;
        private String name;
        private String parentTaskUid;
        private Integer percentComplete;
        private String predecessorLink;
        private Date start;
        private Integer type;
        private String quantityYear;
        private String firstLevel;
        private String secondLevel;
        private Double planComplete;
        private Double assignComplete;
        private Double realComplete;
        private String quantityUnit;
        private String week;
        private String month;
        private String year;
        private String firstLevelUid;
        private String secondLevelUid;
        private Double completeRate;
        private Date taskStart;
        private Date taskFinish;
        private Double remaining;
        private String description;
        private Boolean isFillUp;
    }
}