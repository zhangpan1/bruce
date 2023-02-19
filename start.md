## 教训深刻

* 历经20天的面试，终于发现问题所在
* 年龄、履历、学历必须得有长处
* 技术也必须过硬，不能学个大概，要能举一反三
* 开这个项目也是每天开始一个小知识点，一个小面试题的分享与学习
* 每天保持固定的学习节奏，争取不留遗憾，努力奋斗



CREATE PROCEDURE demo.batch_generate ( )
BEGIN
DECLARE i INT DEFAULT 1;
WHILE i <= 5000000 DO
INSERT INTO `demo`.`act_result_log` (`onlineseqid`, `businessid`, `becifno`, `ivisresult`, `createdby`,`createddate`, `updateby`, `updateddate`,`risklevel`)
VALUES(CONCAT('0' + i), CONCAT('1'+ i), concat('2'+i), concat('3'+i),'1',now(),'1',now(),'1');
SET i = i + 1;
END WHILE;
end
call batch_generate


